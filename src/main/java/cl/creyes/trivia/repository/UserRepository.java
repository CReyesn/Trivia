package cl.creyes.trivia.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import cl.creyes.trivia.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	public Users findByEmail(String email);
}
