package com.pnc.account.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	
	 @RequestMapping("/")
	    public String welcome() {
	        return "index";
	    }
	}


