package pl.sda.homework.dao;

import org.hibernate.Session;
import pl.sda.homework.domain.Phone;

public class PhoneDAO {

	private Session session;

	public PhoneDAO(Session session) {
		this.session = session;
	}

	public Phone create(Phone phone) {
		session.persist(phone);
		return phone;
	}

	public Phone get(int id) {
		return session.get(Phone.class, id);
	}
}
