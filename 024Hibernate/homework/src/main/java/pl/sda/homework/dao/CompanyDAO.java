package pl.sda.homework.dao;

import org.hibernate.Session;
import pl.sda.homework.domain.Client;
import pl.sda.homework.domain.Company;

public class CompanyDAO {

	private Session session;

	public CompanyDAO(Session session) {
		this.session = session;
	}

	public Company create(Company company) {
		session.persist(company);
		return company;
	}

	public Company get(int id) {
		return session.get(Company.class, id);
	}

	public Company addClientToCompany(Company company, Client client) {
		company.getClients().add(client);
		// zalecane
		client.getCompanies().add(company);
		return company;
	}

	public Company removeClientFromCompany(Company company, Client client) {
		company.getClients().remove(client);
		// zalecane
		client.getCompanies().remove(company);
		return company;
	}

	public Company removeAllClientsFromCompany(Company company) {
		for (Client client : company.getClients()) {
			// zalecane
			client.getCompanies().remove(company);
		}

		company.setClients(null);

		return company;
	}

}
