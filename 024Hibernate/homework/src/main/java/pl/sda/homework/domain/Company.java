package pl.sda.homework.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@ManyToMany
	@JoinTable(
			name = "COMPANY_2_CLIENT",
			joinColumns =  {@JoinColumn(name = "COMPANY_ID")},
			inverseJoinColumns = {@JoinColumn(name = "CLIENT_ID")}
	)
	private Set<Client> clients = new HashSet<>();

	public Company(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "Company{" +
				"id=" + id +
				", name='" + name + '\'' +
				", clients=" + clients +
				'}';
	}
}