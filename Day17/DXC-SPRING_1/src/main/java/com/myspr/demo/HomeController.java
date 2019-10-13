package com.myspr.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String myMeth()
	{
	return "Design";
	}
	
	
	@RequestMapping(value="/getdata")
	public String myMeth(Model model,@ModelAttribute Customer cust)
	{
	model.addAttribute("customer",cust);
	return "Display";
	}
	
}
