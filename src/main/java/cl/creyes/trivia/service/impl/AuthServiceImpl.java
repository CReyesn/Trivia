package cl.creyes.trivia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.creyes.trivia.model.Users;
import cl.creyes.trivia.repository.UserRepository;

@Service
public class AuthServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository usersRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException { //metodo de UserDetailService
		Users user= usersRepository.findByEmail(email);//busca el usuario por email
		System.out.println(user);
		if (user==null) {
			throw new UsernameNotFoundException(email); // si es nulo manda la excepcion
		}
		List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>(); 
		authorities.add(new SimpleGrantedAuthority(user.getRole().toString())); //seteo de la lista de autoridad
		
		return new User(user.getEmail(),user.getPassword(),authorities);
	}

}
