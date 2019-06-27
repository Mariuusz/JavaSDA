package pl.sda.homework.dao;

import org.hibernate.Session;
import pl.sda.homework.domain.Client;
import pl.sda.homework.domain.Phone;

public class ClientDAO {

	private Session session;

	public ClientDAO(Session session) {
		this.session = session;
	}

	public Client create(Client client) {
		session.persist(client);
		return client;
	}

	public Client get(int id) {
		return session.get(Client.class, id);
	}

	public Client addPhoneToClient(Client client, Phone phone) {
		client.getPhones().add(phone);
		return client;
	}
}
