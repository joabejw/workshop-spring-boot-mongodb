package com.joabejw.workshopmongo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joabejw.workshopmongo.Repositories.UserRepository;
import com.joabejw.workshopmongo.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}
