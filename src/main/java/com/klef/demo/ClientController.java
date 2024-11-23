package com.klef.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
public class ClientController 
{
	@RequestMapping("/")
	public String display0(HttpServletRequest request)
	{
		 String baseUrl = ServletUriComponentsBuilder.fromRequestUri(request)
		            .replacePath(null)
		            .build()
		            .toUriString();
		 
	    System.out.println(baseUrl);
		return "home";
	}
	@RequestMapping("/home")
	public String display()
	{
		return "home";
	}
	@RequestMapping("/green-enterpreneur-register")
	public String display1()
	{
		return "green-enterpreneur-register";
	}
	@RequestMapping("/expert-register")
	public String display2()
	{
		return "expert-register";
	}
	@RequestMapping("/stakeholder-register")
	public String display3()
	{
		return "stakeholder-register";
	}
	@RequestMapping("/developer-register")
	public String display4()
	{
		return "developer-register";
	}
	@RequestMapping("/customer-register")
	public String display5()
	{
		return "customer-register";
	}
	
	@RequestMapping("/index-1")
	public String display6()
	{
		return "index-1";
	}
	
	@RequestMapping("/category")
	public String display7()
	{
		return "category";
	}
	
	@RequestMapping("/product")
	public String display8()
	{
		return "product";
	}
	
	@RequestMapping("/cart")
	public String display9()
	{
		return "cart";
	}
	
	@RequestMapping("/checkout")
	public String display10()
	{
		return "checkout";
	}
	
	@RequestMapping("/dashboard")
	public String display11()
	{
		return "dashboard";
	}
	
	@RequestMapping("/ideas")
	public String display12()
	{
		return "ideas";
	}
	
	@RequestMapping("/suggestions")
	public String display13()
	{
		return "suggestions";
	}
	
	@RequestMapping("/investments")
	public String display14()
	{
		return "investments";
	}
	
	@RequestMapping("/developments")
	public String display15()
	{
		return "developments";
	}
	
	@RequestMapping("/tab-orders")
	public String display17()
	{
		return "tab-orders";
	}
	
	@RequestMapping("/green-enterpreneur-home")
	public String display18()
	{
		return "green-enterpreneur-home";
	}
	
	@RequestMapping("/view-ideas")
	public String display19()
	{
		return "view-ideas";
	}
	
	@RequestMapping("/view-suggestions")
	public String display20()
	{
		return "view-suggestions";
	}
	
	@RequestMapping("/view-investments")
	public String display21()
	{
		return "view-investments";
	}
	
	@RequestMapping("/view-developments")
	public String display23()
	{
		return "view-developments";
	}
}
