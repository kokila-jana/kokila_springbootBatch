package com.example.thymleafApplication;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class Controller1 
{
	//	@GetMapping("/S")
//	public String Student(Model m)
//	{
//		List<String> l=List.of("Java","Python","C","C++");
//		m.addAttribute("Student",l);
//		return "First";
//		
//	}
	
//	@GetMapping("/S")
//	public String Student(Model m)
//	{
//		m.addAttribute("name","Kokila");
//		return "First";
//		
//	}
	
//	@GetMapping("/S")
//	public String Student(Model m)
//	{
//		m.addAttribute("age",16);
//		return "First";
//		
//	}

	
	@GetMapping("/S")
	public String Student(Model m)
	{
		m.addAttribute("Entity",new Entity("Jana"));
		return "First";
		
	}



}
