package it.objectmethod.worldjpa.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.worldjpa.service.LoginService;

@RestController
public class LoginContoller {

	@Autowired
	LoginService service;

	@PostMapping("/login")
	public String login(@RequestParam("userName") String name, HttpServletResponse response) {
		String user = service.login(name, response);
		return user;
	}

}
