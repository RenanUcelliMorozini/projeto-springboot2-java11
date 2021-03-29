package br.com.renanucelli.aula.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.renanucelli.aula.course.entities.User;
import br.com.renanucelli.aula.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> finAll(){
		
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
