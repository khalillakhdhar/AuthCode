package com.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.th.model.User;

@Controller
public class MainController {
@GetMapping("")
public String logpage(Model m)
{
	User user=new User();
	m.addAttribute("user",user);
return "login";	

}
@PostMapping("connect")
public String login(User user)
{
	if(user.getLogin().equals("admin")&&user.getMdp().equals("admin"))
		return "profile";
	else 
		return "redirect:/";

}
}
