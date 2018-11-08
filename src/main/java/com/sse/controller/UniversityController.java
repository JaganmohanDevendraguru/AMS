package com.sse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sse.daoImpl.UniversityDAOImpl;
import com.sse.model.University;

@Controller
@RequestMapping("/university")
public class UniversityController {
	
	@Autowired
	private UniversityDAOImpl uniDaoImpl;
	
	@GetMapping
	public String showUni(Model model) {
		List<University> listUnis = uniDaoImpl.findAll();
		model.addAttribute("listUnis",listUnis);
		return "university";
	}
}
