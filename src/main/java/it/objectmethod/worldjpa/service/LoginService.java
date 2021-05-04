package it.objectmethod.worldjpa.service;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public String login(String userName, HttpServletResponse response) {
		if (userName.trim().isEmpty()) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		return userName;
	}
}
