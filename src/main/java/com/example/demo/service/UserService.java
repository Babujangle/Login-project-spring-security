package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.model.User;
import com.example.demo.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	public User save(UserRegistrationDto registrationDto);

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
