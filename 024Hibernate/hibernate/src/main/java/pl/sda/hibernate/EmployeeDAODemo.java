package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.sda.hibernate.dao.EmployeeDAO;
import pl.sda.hibernate.util.HibernateUtil;

public class EmployeeDAODemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		try {

			EmployeeDAO employeeDAO = new EmployeeDAO(session);


		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
