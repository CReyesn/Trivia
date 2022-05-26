package cl.creyes.trivia.service;

import java.util.List;

import cl.creyes.trivia.model.Users;


public interface UserService {

	void save(Users user);
	
	List<Users> findAll();
	
	void update(Users user);
	
	void delete(Users user);
	
	Users findByEmail(String email);
}
