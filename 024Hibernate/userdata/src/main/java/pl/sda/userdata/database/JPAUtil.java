package pl.sda.userdata.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("userdata");
	private static final EntityManager em = emf.createEntityManager();

	public static EntityManager getEm() {
		return em;
	}

	public static void closeEm() {
		if (em != null) {
			em.close();
		}
	}

	public static void closeEmFactory() {
		if (emf != null) {
			emf.close();
		}
	}
}
