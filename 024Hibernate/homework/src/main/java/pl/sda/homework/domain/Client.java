package pl.sda.homework.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

    @OneToMany
    @JoinColumn(name = "client_id")
	private List<Phone> phones = new ArrayList<>();

	@ManyToMany(mappedBy = "clients")
	private Set<Company> companies = new HashSet<>();

	public Client() {
	}

	public Client(String name) {
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

	public List<Phone> getPhones() {
		return phones;
	}

	public Set<Company> getCompanies() {
		return companies;
	}

	@Override
	public String toString() {
		return "Client{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phones=" + phones +
				'}';
	}
}
