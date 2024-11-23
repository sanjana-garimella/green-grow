package com.klef.demo.service;

import com.klef.demo.controller.bean.Dev;
import com.klef.demo.controller.bean.Exp;
import com.klef.demo.controller.bean.Grn;
import com.klef.demo.controller.bean.Shop;
import com.klef.demo.controller.bean.Stk;
import com.klef.demo.controller.bean.User;

public interface UserService 
{
	User getUserByUserId5(String userId);
	
	User getUserByUserId1(String userId);
	
	User getUserByUserId2(String userId);
	
	User getUserByUserId3(String userId);
	
	User getUserByUserId4(String userId);
	
	Shop getUserByUserId6(String user_name);
	
	Grn getUserByUserId7(String grn_name);
	
	Exp getUserByUserId8(String exp_name);
	
	Stk getUserByUserId9(String stk_name);
	
	Dev getUserByUserId10(String dev_name);
	
	int createNewUser5(User user);
	
	int createNewUser1(User user);
	
	int createNewUser2(User user);
	
	int createNewUser3(User user);
	
	int createNewUser4(User user);
	
	int createNewUser6(Shop user);
	
	int createNewUser7(Grn user);
	
	int createNewUser8(Exp user);
	
	int createNewUser9(Stk user);
	
	int createNewUser10(Dev user);

}
