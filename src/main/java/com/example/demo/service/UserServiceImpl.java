package com.example.demo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void saveUser(Client user) {
		userrepository.save(user);
		
	}


	@Override
	public void saveOuvrier(Ouvrier user) {
		userrepository.save(user);
		
	}
	
	@Override
	public User loadByUsername(String username) {
		
		TypedQuery<User> query = (TypedQuery<User>) em.createQuery("SELECT u FROM User u WHERE u.username = :username" ,User.class);
		User u=query.setParameter("username", username).getSingleResult();
			return  u;
		
	}

}
