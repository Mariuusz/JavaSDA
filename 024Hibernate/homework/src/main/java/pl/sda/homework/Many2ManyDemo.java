package pl.sda.homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pl.sda.homework.dao.ClientDAO;
import pl.sda.homework.dao.CompanyDAO;
import pl.sda.homework.util.HibernateUtil;

public class Many2ManyDemo {

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
			CompanyDAO companyDAO = new CompanyDAO(session);

			// !!!!! TUTAJ ZACZYNA się Unit of Work !!!!!
			// ponizej znajduje sie konkretny scenariusz
			// pracujemy na jednej transakcji (globalnej) (zrobilem tak dla uproszczenia)
			// ale DAO maja sesje, wiec moglyby tworzyc swoje podtransakcje

			// TODO:


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
