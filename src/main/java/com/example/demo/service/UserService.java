package com.example.demo.service;


import com.example.demo.entities.Client;
import com.example.demo.entities.Ouvrier;
import com.example.demo.entities.User;


public interface UserService {
	public void saveUser( Client user);
	public void saveOuvrier( Ouvrier user);
	public User loadByUsername(String username);
}
