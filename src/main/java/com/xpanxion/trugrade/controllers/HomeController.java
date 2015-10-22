package com.xpanxion.trugrade.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getHome(HttpServletRequest request, Model model) {
		return ControllerConstants.VIEW_HOME;
	}
}
