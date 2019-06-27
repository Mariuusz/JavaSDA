package pl.sda.userdata.user;

import org.hibernate.SessionFactory;
import pl.sda.userdata.database.HibernateUtil;
import pl.sda.userdata.database.JPAUtil;

import java.util.*;

public class UserDAO {

	//private SessionFactory sf;

	private static final Map<Integer, User> users = new HashMap<>();

	static {
		User rafos = new User("Rafos");
		User admin = new User("Admin");
		users.put(rafos.getId(), rafos);
		users.put(admin.getId(), admin);
	}

	public UserDAO() {
		//sf = HibernateUtil.getSessionFactory();
	}

	public Optional<User> getUserById(int id) {
		// Session session = sf.openSession();
		// User value = session.find(User.class, id);
		// session.close();
		return Optional.ofNullable(users.get(id));
	}

	public Set<User> getAll() {
		return new HashSet<>(users.values());
	}

	public User addUser(String name) {
		User user = new User(name);
		users.put(user.getId(), user);
		return user;
	}

	public boolean removeUser(int id) {
		if (!users.containsKey(id)) {
			return false;
		}
		users.remove(id);
		return true;
	}

	public boolean editUser(Integer userId, String name) {
		if (!users.containsKey(userId)) {
			return false;
		}

		User user = users.get(userId);
		user.setName(name);

		return true;
	}
}
