 package org.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "HelloWorld";
	}
	
	@RequestMapping(value = "displayName")
	public String displayName(@RequestParam("firstName") String firstName, 
			@RequestParam("lastName") String lastName, 
			Model model) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return "displayName";
	}
}
