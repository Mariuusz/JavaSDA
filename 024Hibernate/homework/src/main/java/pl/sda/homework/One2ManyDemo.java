package pl.sda.homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pl.sda.homework.dao.ClientDAO;
import pl.sda.homework.dao.PhoneDAO;
import pl.sda.homework.domain.Client;
import pl.sda.homework.domain.Phone;
import pl.sda.homework.util.HibernateUtil;

public class One2ManyDemo {

	public static void main(String[] args) {
		// przydatne obiekty
		SessionFactory sf = null;
		Session session = null;
		Transaction transaction = null;

		try {
			// probujemy utworzyc te obiekty
			sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			transaction = session.beginTransaction();

			// tworze potrzebne DAO
			ClientDAO clientDAO = new ClientDAO(session);
			PhoneDAO phoneDAO = new PhoneDAO(session);

			// !!!!! TUTAJ ZACZYNA się Unit of Work !!!!!
			// ponizej znajduje sie konkretny scenariusz
			// pracujemy na jednej transakcji (globalnej) (zrobilem tak dla uproszczenia)
			// ale DAO maja sesje, wiec moglyby tworzyc swoje podtransakcje

			Client client1 = new Client("Jan");
			Client client2 = new Client("Janusz");
			Client client3 = new Client("Roman");

			clientDAO.create(client1);
			clientDAO.create(client2);
			clientDAO.create(client3);

			Phone phone1 = new Phone("555-666-777");
			Phone phone2 = new Phone("444-666-222");
			Phone phone3 = new Phone("111-222-333");

			phoneDAO.create(phone1);
			phoneDAO.create(phone2);
			phoneDAO.create(phone3);

			// 1c -> 2t, 2c -> 3t, 3c -> 1t

			System.out.println(clientDAO.get(1));
			System.out.println(clientDAO.get(2));
			System.out.println(clientDAO.get(3));

			System.out.println(phoneDAO.get(1));
			System.out.println(phoneDAO.get(2));
			System.out.println(phoneDAO.get(3));

			clientDAO.addPhoneToClient(client1, phone2);
			clientDAO.addPhoneToClient(client2, phone3);
			clientDAO.addPhoneToClient(client3, phone1);

			// !!!!! TUTAJ KONCZY się Unit of Work !!!!!

			// zatwierdzamy wszyskie zmiany
			transaction.commit();
		} catch (Throwable throwable) {
			// jesli poszlo nie tak, to rollback
			if (transaction != null) {
				transaction.rollback();
			}

			// a tutaj sie dowiemy, co jest nie tak
			throwable.printStackTrace();
		} finally {
			// na koniec trzeba po sobie posprzatac
			if (session != null) {
				session.close();
			}
			if (sf != null) {
				sf.close();
			}
		}
	}
}
