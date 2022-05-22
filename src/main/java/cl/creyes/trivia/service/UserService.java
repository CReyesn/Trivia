package cl.creyes.trivia.service;

import java.util.List;

import cl.creyes.trivia.model.User;


public interface UserService {

	void save(User user);
	
	List<User> findAll();
	
	void update(User user);
	
	void delete(User user);
	
}
