 package org.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "HelloWorld";
	}
	
	@RequestMapping(value = "displayName")
	public String displayName(HttpServletRequest request) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		return "displayName";
	}
}
