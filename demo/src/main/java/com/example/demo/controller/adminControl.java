package com.example.demo.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.user;
import com.example.demo.service.userService;



@RestController
public class adminControl {

	@Autowired
	private userService uDao;
	
	@PostMapping(value= "/admin/addUser")
		public user  addUser(@RequestBody user usr)
		{
			user n = new  user();
			System.out.println(usr);
		//	n.setEmail(usr.getEmail());
			n.setId(usr.getId());
			n.setFname(usr.getFname());
			n.setLname(usr.getLname());
			n.setPhone(usr.getPhone());
			n.setAge(usr.getAge());
			n.setMarried(usr.isMarried());
			n.setHow_Many_Children_Dose_He_Have(usr.getHow_Many_Children_Dose_He_Have());
			n.setNumber_Of_Hours(usr.getNumber_Of_Hours());
			n.setOne_Hour(usr.getOne_Hour());
			n.setSalary(usr.getSalary());
			n.setDay(usr.getDay());
			n.setMonth(usr.getMonth());
			n.setNumber_Of_Day(usr.getNumber_Of_Day());
			
			
		//	n.setPassword(usr.getPassword());
			uDao.saveUser(n);
			
			 HttpHeaders httpHeaders = new HttpHeaders();
			 return n;
		}
		@GetMapping("/admin/getAll")
		public Collection<user>getAllUsers()
		{
			return uDao.getAllUser();
		}
	
		
		
		@RequestMapping("/admin/hi")
		@ResponseBody
		public String printHi()
		{
			return "hi";
		}

	
		
	}

	
		
	