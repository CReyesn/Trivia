package cl.creyes.trivia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.creyes.trivia.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
