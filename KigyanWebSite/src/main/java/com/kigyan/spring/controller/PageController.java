package com.kigyan.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/index.html")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/about.html")
	public String getAbout() {
		return "about";
	}
	
	@GetMapping("/blog.html")
	public String getBlog() {
		return "about";
	}
	
	@GetMapping("/blog_single.html")
	public String getBlogSingle() {
		return "blog_single";
	}
	
	@GetMapping("/contact.html")
	public String getContact() {
		return "contact";
	}
	
	@GetMapping("/course.html")
	public String getCourse() {
		return "course";
	}
	
	@GetMapping("/courses.html")
	public String getCourses() {
		return "courses";
	}
	
	@GetMapping("/register.html")
	public String getRegister() {
		return "register";
	}
}
