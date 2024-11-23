package com.klef.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.klef.demo.controller.bean.Dev;
import com.klef.demo.controller.bean.Exp;
import com.klef.demo.controller.bean.Grn;
import com.klef.demo.controller.bean.Shop;
import com.klef.demo.controller.bean.Stk;
import com.klef.demo.controller.bean.User;
import com.klef.demo.service.UserService;

@Controller
public class LoginController 
{
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/customer-login",method=RequestMethod.GET)
	public String loginPage5()
	{
		return "customer-login";
	}
	
	@RequestMapping(value="/green-enterpreneur-login",method=RequestMethod.GET)
	public String loginPage1()
	{
		return "green-enterpreneur-login";
	}
	
	@RequestMapping(value="/expert-login",method=RequestMethod.GET)
	public String loginPage2()
	{
		return "expert-login";
	}
	
	@RequestMapping(value="/stakeholder-login",method=RequestMethod.GET)
	public String loginPage3()
	{
		return "stakeholder-login";
	}
	
	@RequestMapping(value="/developer-login",method=RequestMethod.GET)
	public String loginPage4()
	{
		return "developer-login";
	}
	
	@RequestMapping(value="/order-show",method=RequestMethod.GET)
	public String ordershow()
	{
		return "order-show";
	}
	
	@RequestMapping(value="/ideas-table",method=RequestMethod.GET)
	public String ideas()
	{
		return "ideas-table";
	}
	
	@RequestMapping(value="/suggestions-table",method=RequestMethod.GET)
	public String suggestions()
	{
		return "suggestions-table";
	}
	
	@RequestMapping(value="/investments-table",method=RequestMethod.GET)
	public String investments()
	{
		return "investments-table";
	}
	
	@RequestMapping(value="/developments-table",method=RequestMethod.GET)
	public String developments()
	{
		return "developments-table";
	}
	
	@RequestMapping(value="/customer-login",method=RequestMethod.POST)
	public String welcomePage5(ModelMap model,@RequestParam String userId, @RequestParam String password)
	{
		User user=userService.getUserByUserId5(userId);
		if(user.getPassword().equals(password))
		{
			model.put("userId", userId);
			return "index-1";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "customer-login";
	}
	
	@RequestMapping(value="/green-enterpreneur-login",method=RequestMethod.POST)
	public String welcomePage1(ModelMap model,@RequestParam String userId, @RequestParam String password)
	{
		User user=userService.getUserByUserId1(userId);
		if(user.getPassword().equals(password))
		{
			model.put("userId", userId);
			return "green-enterpreneur-home";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "green-enterpreneur-login";
	}
	
	@RequestMapping(value="/expert-login",method=RequestMethod.POST)
	public String welcomePage2(ModelMap model,@RequestParam String userId, @RequestParam String password)
	{
		User user=userService.getUserByUserId2(userId);
		if(user.getPassword().equals(password))
		{
			model.put("userId", userId);
			return "expert-home";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "expert-login";
	}
	
	@RequestMapping(value="/stakeholder-login",method=RequestMethod.POST)
	public String welcomePage3(ModelMap model,@RequestParam String userId, @RequestParam String password)
	{
		User user=userService.getUserByUserId3(userId);
		if(user.getPassword().equals(password))
		{
			model.put("userId", userId);
			return "stakeholder-home";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "stakeholder-login";
	}
	
	@RequestMapping(value="/developer-login",method=RequestMethod.POST)
	public String welcomePage4(ModelMap model,@RequestParam String userId, @RequestParam String password)
	{
		User user=userService.getUserByUserId4(userId);
		if(user.getPassword().equals(password))
		{
			model.put("userId", userId);
			return "developer-home";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "developer-login";
	}
	
	@RequestMapping(value="/order-show",method=RequestMethod.POST)
	public String ordershow(ModelMap model,@RequestParam String user_name, @RequestParam String user_country,@RequestParam String user_street,@RequestParam String user_state,@RequestParam String user_zip,@RequestParam String user_phone,@RequestParam String user_mail,@RequestParam String user_products)
	{
		Shop user=userService.getUserByUserId6(user_name);
		if(user.getUser_name()!=null)
		{
			model.put("user_name", user.getUser_name());
			model.put("user_country", user.getUser_country());
			model.put("user_street", user.getUser_street());
			model.put("user_state", user.getUser_state());
			model.put("user_zip", user.getUser_zip());
			model.put("user_phone", user.getUser_phone());
			model.put("user_mail", user.getUser_mail());
			model.put("user_products", user.getUser_products());
			return "order-show";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "checkout";
	}
	
	@RequestMapping(value="/ideas-table",method=RequestMethod.POST)
	public String ideas(ModelMap model,@RequestParam String grn_name)
	{
		Grn user=userService.getUserByUserId7(grn_name);
		if(user.getGrn_name()!=null)
		{
			model.put("grn_name", user.getGrn_name());
			model.put("grn_email", user.getGrn_email());
			model.put("grn_idea", user.getGrn_idea());
			return "ideas-table";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "ideas";
	}
	
	@RequestMapping(value="/suggestions-table",method=RequestMethod.POST)
	public String suggestions(ModelMap model,@RequestParam String exp_name)
	{
		Exp user=userService.getUserByUserId8(exp_name);
		if(user.getExp_name()!=null)
		{
			model.put("exp_name", user.getExp_name());
			model.put("exp_email", user.getExp_email());
			model.put("exp_suggestion", user.getExp_suggestion());
			return "suggestions-table";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "suggestions";
	}
	
	@RequestMapping(value="/investments-table",method=RequestMethod.POST)
	public String investments(ModelMap model,@RequestParam String stk_name)
	{
		Stk user=userService.getUserByUserId9(stk_name);
		if(user.getStk_name()!=null)
		{
			model.put("stk_name", user.getStk_name());
			model.put("stk_email", user.getStk_email());
			model.put("stk_grn_email", user.getStk_grn_email());
			model.put("stk_investment", user.getStk_investment());
			return "investments-table";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "investments";
	}
	
	@RequestMapping(value="/developments-table",method=RequestMethod.POST)
	public String developments(ModelMap model,@RequestParam String dev_name)
	{
		Dev user=userService.getUserByUserId10(dev_name);
		if(user.getDev_name()!=null)
		{
			model.put("dev_name", user.getDev_name());
			model.put("dev_email", user.getDev_email());
			model.put("dev_grn_email", user.getDev_grn_email());
			model.put("dev_stk_email", user.getDev_stk_email());
			model.put("dev_product_desc", user.getDev_product_desc());
			return "developments-table";
		}
		model.put("errorMsg","Please provide correct Username and password");
		return "developmets";
	}
	

}
