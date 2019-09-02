package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.entities.Ouvrier;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service("userservice")
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userrepository;
	
	
	@Override
	public void saveUser(Client user) {
		userrepository.save(user);
		
	}


	@Override
	public void saveOuvrier(Ouvrier user) {
		userrepository.save(user);
		
	}

}
