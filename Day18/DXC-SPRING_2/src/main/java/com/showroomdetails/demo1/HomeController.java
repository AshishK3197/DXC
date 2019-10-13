package com.showroomdetails.demo1;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	ArrayList<Car> car =  new ArrayList<Car>();
	String sname = "";
	
	
	
	@RequestMapping(value="/")
	public String myMeth1(Model model)
	{
	return "Design";
	}
	
	
	@RequestMapping(value="/getdata")
	public String myMeth(Model model)
	{
	Showroom show = new Showroom();
	show.setShowName(sname);
	show.setCars(car);
	model.addAttribute("showroom",show);
	return "Display";
	}
	@RequestMapping(value = "/add")
	public String myMeth(Model model, @RequestParam("ShowName") String ShowName,@ModelAttribute Car cars)
	{
		sname = ShowName;
		System.out.println(ShowName);
		car.add(cars);
		model.addAttribute("sname",sname);
		return "Design";
	}
	
}
