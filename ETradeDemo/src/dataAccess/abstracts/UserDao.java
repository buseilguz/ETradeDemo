package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
	void updata(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
	

}
