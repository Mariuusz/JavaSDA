package pl.sda.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.hibernate.domain.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeDAO {

	private Session session;

	public EmployeeDAO(Session session) {
		this.session = session;
	}

	public Employee create(String name, String password, int age) {
		Transaction transaction = session.beginTransaction();

		// TODO:

		transaction.commit();
		return null;
	}

	public Employee getById(int id) {
		// TODO:
		return null;
	}

	/**
	 *
	 * Hint: session.byId(LITERAL_KLASY_ENCJI).loadOptional(IDENTYFIKATOR_ENCJI)
	 */
	public Optional<Employee> findById(int id) {
		// TODO:
		return null;
	}

	/**
	 *
	 * Hint: session.createQuery("from NAZWA_KLASY_ENCJI").getResultList()
	 */
	public List<Employee> findAll() {
		// TODO:
		return null;
	}

	public Employee update(Employee updatedEmployee) {
		Transaction transaction = session.beginTransaction();

		// TODO:

		transaction.commit();
		return null;
	}

	public Employee delete(int id) {
		Transaction transaction = session.beginTransaction();

		// TODO:

		transaction.commit();
		return null;
	}
}
