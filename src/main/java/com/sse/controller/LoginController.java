package com.sse.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sse.daoImpl.StudentDAOImpl;
import com.sse.model.Employee;
import com.sse.model.Student;

@Controller
public class LoginController {

	@Autowired
	private StudentDAOImpl studentDao;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm(Model model) {
		model.addAttribute("loginForm", new Employee());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginCheck(@Valid @ModelAttribute("loginForm") Employee emp, BindingResult bs) {
		if (bs.hasErrors()) {
			return "login";
		}
		System.out.println("");
		return "dashboard";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(ModelAndView mv, Student st) {
		mv.addObject(st);
		mv.setViewName("register");
		return mv;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView processRegistration(ModelAndView mv, @Valid Student st, BindingResult bs, HttpRequest request) {
		Student existSt = studentDao.findByEmail(st.getEmail());
		if (existSt != null) {
			mv.addObject("errorMsg", "The email Id is already existing");
			mv.setViewName("register");
			bs.reject("email");
		}
		if (bs.hasErrors()) {
			mv.setViewName("register");
		} else {
			mv.setViewName("register");

		}

		return mv;
	}
}
