package com.klef.demo.dao;

import com.klef.demo.controller.bean.Dev;
import com.klef.demo.controller.bean.Exp;
import com.klef.demo.controller.bean.Grn;
import com.klef.demo.controller.bean.Shop;
import com.klef.demo.controller.bean.Stk;
import com.klef.demo.controller.bean.User;

public interface UserDao {

	User getUserById5(String userId);
	
	User getUserById1(String userId);
	
	User getUserById2(String userId);
	
	User getUserById3(String userId);
	
	User getUserById4(String userId);
	
	Shop getUserById6(String user_name);
	
	Grn getUserById7(String grn_name);
	
	Exp getUserById8(String exp_name);
	
	Stk getUserById9(String stk_name);
	
	Dev getUserById10(String stk_name);
	
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
