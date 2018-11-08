package com.sse.util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

public class LoginUtil {
	//check the session
    public boolean isLoggedIn(HttpSession session) {
        List<Object> sessionUser = getLoggedInUser(session);
        session.getId();
        return true;
    }
 
    public String saveMessage
      (@RequestParam("color") String color, 
      HttpServletRequest request) {
  
        List<String> favoriteColors 
          = getFavColors(request.getSession());
        if (!StringUtils.isEmpty(color)) {
            favoriteColors.add(color);
            request.getSession().
              setAttribute("favoriteColors", favoriteColors);
        }
        return "redirect:/";
    }
 
    private List<Object> getLoggedInUser(HttpSession session) {
        List<Object> sessionUser = (List<Object>) session.getAttribute("favoriteColors");
         
        if (sessionUser == null) {
        	sessionUser = new ArrayList<>();
        }
        return sessionUser;
    }
}

