package com.amdocs.JenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Vidhii {

		@GetMapping("/in")
		public String show() {
			String s = "Hello, I am Vidhi, Welcome to Spring boot and Jenkins ";
			return s +"Id : 201320";
		}
	}


