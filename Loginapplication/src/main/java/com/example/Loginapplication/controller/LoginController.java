package com.example.Loginapplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/check")
public class LoginController {

    //@RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    //@RequestMapping(value = "/login", method = RequestMethod.GET)
    @GetMapping("/loginpage")
    public String WelcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
    	
    if (userId.equals("admin") && password.equals("root")) {
    	model.put("userId", userId);
    	return "welcome";
    }
    
    model.put("errorMsg", "Please provide the correct userid and password");
        return "Welcome";
    } 
}