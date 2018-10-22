package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class Logincontroller {
@RequestMapping(value="login")
public String login(){
	return "maye";
}
@RequestMapping(value="index")
public String index(){
	return "index";
}
}
