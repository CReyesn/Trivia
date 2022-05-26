package cl.creyes.trivia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.creyes.trivia.model.Users;
import cl.creyes.trivia.repository.UserRepository;
import cl.creyes.trivia.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void save(Users user) {
		userRepository.save(user);
	}

	@Override
	public List<Users> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void update(Users user) {
		userRepository.save(user);
		
	}

	@Override
	public void delete(Users user) {
		userRepository.delete(user);
	}

	@Override
	public Users findByEmail(String email) {

		return userRepository.findByEmail(email);
	}

}
