package com.core.integra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "home.html";
	}
	
	@RequestMapping("/add")
	public String add(@ModelAttribute UserModel1 u)
	{	
		System.out.println(u);
		repo.save(u);
		
		
		 
		return "redirect:/home";
	}
	@RequestMapping("/add1")
	public String add1()
	{
		return "add.html";
		
	}


}
