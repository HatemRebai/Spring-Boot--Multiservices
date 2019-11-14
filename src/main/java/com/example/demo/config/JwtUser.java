package com.example.demo.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtUser implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7178600519057401332L;
	private final int id; 
	private final String username;
	private final String password;
	private final User user;
	
	
	public JwtUser(int id, String username, String password, User user) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.user = user;
	}

	@JsonIgnore
	public int getId() {
		return id;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getPassword() {
		return password;
	}


	public User getUser() {
		return user;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}



	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
