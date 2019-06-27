package pl.sda.userdata.database;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {
		try {
			ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml")
					.build();

			Metadata metaData = new MetadataSources(standardRegistry)
					.getMetadataBuilder()
					.build();

			sessionFactory = metaData.getSessionFactoryBuilder().build();
		} catch (Throwable th) {
			System.err.println("Initial SessionFactory creation failed: " + th);
			throw new ExceptionInInitializerError(th);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}