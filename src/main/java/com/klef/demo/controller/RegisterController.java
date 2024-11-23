package com.klef.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.klef.demo.controller.bean.Dev;
import com.klef.demo.controller.bean.Exp;
import com.klef.demo.controller.bean.Grn;
import com.klef.demo.controller.bean.Shop;
import com.klef.demo.controller.bean.Stk;
import com.klef.demo.controller.bean.User;
import com.klef.demo.service.UserService;

@Controller
public class RegisterController 
{
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/customer-register",method=RequestMethod.GET)
	public String registerPage5(Model model)
	{
		User user=new User();
		model.addAttribute("user", user);
		return "customer-register";
	}
	
	@RequestMapping(value="/green-enterpreneur-register",method=RequestMethod.GET)
	public String registerPage1(Model model)
	{
		User user=new User();
		model.addAttribute("user", user);
		return "green-enterpreneur-register";
	}
	
	@RequestMapping(value="/expert-register",method=RequestMethod.GET)
	public String registerPage2(Model model)
	{
		User user=new User();
		model.addAttribute("user", user);
		return "expert-register";
	}
	
	@RequestMapping(value="/stakeholder-register",method=RequestMethod.GET)
	public String registerPage3(Model model)
	{
		User user=new User();
		model.addAttribute("user", user);
		return "stakeholder-register";
	}
	
	@RequestMapping(value="/developer-register",method=RequestMethod.GET)
	public String registerPage4(Model model)
	{
		User user=new User();
		model.addAttribute("user", user);
		return "developer-register";
	}
	
	@RequestMapping(value="/checkout",method=RequestMethod.GET)
	public String shoppage(Model model)
	{
		Shop user=new Shop();
		model.addAttribute("user", user);
		return "checkout";
	}
	
	@RequestMapping(value="/ideas",method=RequestMethod.GET)
	public String ideaspage(Model model)
	{
		Grn user=new Grn();
		model.addAttribute("user", user);
		return "ideas";
	}
	
	@RequestMapping(value="/suggestions",method=RequestMethod.GET)
	public String suggestionspage(Model model)
	{
		Exp user=new Exp();
		model.addAttribute("user", user);
		return "suggestions";
	}
	
	@RequestMapping(value="/investments",method=RequestMethod.GET)
	public String investmentspage(Model model)
	{
		Stk user=new Stk();
		model.addAttribute("user", user);
		return "investments";
	}
	
	@RequestMapping(value="/developments",method=RequestMethod.GET)
	public String developmentspage(Model model)
	{
		Dev user=new Dev();
		model.addAttribute("user", user);
		return "developments";
	}
	
	@RequestMapping(value="/customer-register",method=RequestMethod.POST)
	public String welcomePage(@ModelAttribute("user") User user,ModelMap model)
	{
		int count=userService.createNewUser5(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in registration. Please try again!");
			return "customer-register";
		}
		return "customer-login";
	}
	
	@RequestMapping(value="/green-enterpreneur-register",method=RequestMethod.POST)
	public String welcomePage1(@ModelAttribute("user") User user,ModelMap model)
	{
		int count=userService.createNewUser1(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in registration. Please try again!");
			return "green-enterpreneur-register";
		}
		return "green-enterpreneur-login";
	}
	
	@RequestMapping(value="/expert-register",method=RequestMethod.POST)
	public String welcomePage2(@ModelAttribute("user") User user,ModelMap model)
	{
		int count=userService.createNewUser2(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in registration. Please try again!");
			return "expert-register";
		}
		return "expert-login";
	}
	
	@RequestMapping(value="/stakeholder-register",method=RequestMethod.POST)
	public String welcomePage3(@ModelAttribute("user") User user,ModelMap model)
	{
		int count=userService.createNewUser3(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in registration. Please try again!");
			return "stakeholder-register";
		}
		return "stakeholder-login";
	}
	
	@RequestMapping(value="/developer-register",method=RequestMethod.POST)
	public String welcomePage4(@ModelAttribute("user") User user,ModelMap model)
	{
		int count=userService.createNewUser4(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in registration. Please try again!");
			return "developer-register";
		}
		return "developer-login";
	}
	
	@RequestMapping(value="/checkout",method=RequestMethod.POST)
	public String shoppage(@ModelAttribute("user") Shop user,ModelMap model)
	{
		int count=userService.createNewUser6(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in placing order. Please try again!");
			return "checkout";
		}
		return "order-show";
	}
	
	@RequestMapping(value="/ideas",method=RequestMethod.POST)
	public String ideaspage(@ModelAttribute("user") Grn user,ModelMap model)
	{
		int count=userService.createNewUser7(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in the website. Please try again!");
			return "ideas";
		}
		return "ideas-table";
	}
	
	@RequestMapping(value="/suggestions",method=RequestMethod.POST)
	public String ideaspage(@ModelAttribute("user") Exp user,ModelMap model)
	{
		int count=userService.createNewUser8(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in the website. Please try again!");
			return "suggestions";
		}
		return "suggestions-table";
	}
	
	@RequestMapping(value="/investments",method=RequestMethod.POST)
	public String investmentspage(@ModelAttribute("user") Stk user,ModelMap model)
	{
		int count=userService.createNewUser9(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in the website. Please try again!");
			return "investments";
		}
		return "investments-table";
	}
	
	@RequestMapping(value="/developments",method=RequestMethod.POST)
	public String developmentspage(@ModelAttribute("user") Dev user,ModelMap model)
	{
		int count=userService.createNewUser10(user);
		if(count!=1)
		{
			model.put("errorMsg","Some issue occurred in the website. Please try again!");
			return "developments";
		}
		return "developments-table";
	}

}
