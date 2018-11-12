package com.sse.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		model.addAttribute("listUnis", listUnis);
		return "university";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String addUni(Model model) {
		// form model attribute name from form is the one we use here
		// we should pass empty/new object here
		model.addAttribute("uniForm", new University());
		return "addUniversity";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	// form model attribute name from form is the one we use here
	public String addUniProcessing(@Valid @ModelAttribute("uniForm") University uni, BindingResult bs) {
		return "addUniversity";
	}

}
