package com.example.demo.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.userDAO;
import com.example.demo.models.user;

@Service
@Transactional
public class userService {

	@Autowired
	private userDAO repos;
	
	public user addUser(user usr)	{
		return repos.save(usr);
	}
	
	 public Collection<user> getAllUser(){
		return repos.findAll(); 
	 }
		
	 public void deleteUser(user u) {
		 repos.delete(u);
	 }
	 
	 public user updateUser (user u) {
		 return repos.save(u);
	 }

	public user saveUser(user u) {
		 return repos.save(u);
	}
	 
	}