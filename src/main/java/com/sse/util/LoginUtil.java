package com.sse.util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginUtil {
	//we dnt need a model
    public String index(Model model, HttpSession session) {
        List<String> loggedUser = (List<String>) session.getAttribute("USER");
        if(loggedUser == null) {
        	loggedUser = new ArrayList<>();
        }
        model.addAttribute("loggedUser", loggedUser);
        return "index";
    }
 
    public String saveMessage(@RequestParam("userObj") String userObj, HttpServletRequest request) 
    {
        List<String> USER = (List<String>) request.getSession().getAttribute("USER");
        if(USER == null) {
        	USER = new ArrayList<>();
            request.getSession().setAttribute("USER", USER);
        }
        USER.add(userObj);
        return "redirect:/";
    }
}

