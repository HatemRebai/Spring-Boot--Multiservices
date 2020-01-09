package com.example.demo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.BCryptManagerUtil;
import com.example.demo.entities.Admin;
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
	
	
	private BCryptManagerUtil passwordEncoder;
	
	@Override
	public void savAdmin(Admin user) {
		user.setPassword(BCryptManagerUtil.passwordEncoder().encode(user.getPassword()));
		userrepository.save(user);	
	}
	
	@Override
	public void saveUser(Client user) {
		user.setPassword(BCryptManagerUtil.passwordEncoder().encode(user.getPassword()));
		userrepository.save(user);	
	}
	@Override
	public void saveOuvrier(Ouvrier user) {
		user.setPassword(BCryptManagerUtil.passwordEncoder().encode(user.getPassword()));
		user.setAvailable(true);
		userrepository.save(user);
	}
	
	@Override
	public User loadByUsername(String username)   {
		
		TypedQuery<User> query = (TypedQuery<User>) em.createQuery("SELECT u FROM User u WHERE u.username = :username " ,User.class);
		User u = query.setParameter("username", username).getSingleResult();
		
			return  u;
	}
	@Override
	public User loadByEmail(String email) {
	
		TypedQuery<User> query = (TypedQuery<User>) em.createQuery("SELECT u FROM User u WHERE u.email = :email " ,User.class);
	     User u = query.setParameter("email", email).getSingleResult(); 
			return  u;
	}
	
	@Override
	public void saveAdmin(Admin user) {
		// TODO Auto-generated method stub
		user.setPassword(BCryptManagerUtil.passwordEncoder().encode(user.getPassword()));
		userrepository.save(user);
	}
	}