package com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userConstroller {
	@RequestMapping("/")
	public String userpage(ModelMap model)
	{
		User user=new User();
		model.put("user", user);
		initialization(model);
		return "reg";
		
	}
	@RequestMapping("/register")
	public String register(@ModelAttribute User user,ModelMap model)
	{
		model.put("users",user);
		double total=0.0;
		total=user.getHmarks()+user.getJmarks()+user.getSmarks();
		model.put("total", total);
		double per=total/3;
		model.put("per", per);
		String grade=null;
		if(per>=70)
		{
			 grade="a";
		}
		else if(per>=60)
		{
			 grade="b";
		}
		else if(per>=50)
		{
			grade="c";
		}
		else
		{
			 grade="fail";
		}
		model.put("grade", grade);
		return "result";
	}
	public void initialization(ModelMap model)
	{
		List<String> li=new ArrayList<String>();
		li.add("java");
		li.add("Spring");
		li.add("hibernate");
		model.addAttribute("courses", li);
		List<String > gender=new ArrayList<String>();
		gender.add("male");
		gender.add("female");
		gender.add("other");
		model.addAttribute("genders",gender);
	}

}
