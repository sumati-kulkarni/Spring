 package org.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "HelloWorld";
	}
	
	@GetMapping(value = "displayName")
	public ModelAndView displayName(@RequestParam("firstName") String firstName, 
			@RequestParam("lastName") String lastName) {
		
		ModelAndView modelAndView = new ModelAndView("displayName");
		
		modelAndView.addObject("firstName", firstName);
		modelAndView.addObject("lastName", lastName);
		
		Date date = new Date();
		modelAndView.addObject("date", date);
		
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Alice");
		names.add("Bob");
		names.add("Monty");
		modelAndView.addObject("teamMembers", names);
		return modelAndView;
	}
}





