package com.klef.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.demo.controller.bean.Dev;
import com.klef.demo.controller.bean.Exp;
import com.klef.demo.controller.bean.Grn;
import com.klef.demo.controller.bean.Shop;
import com.klef.demo.controller.bean.Stk;
import com.klef.demo.controller.bean.User;
import com.klef.demo.dao.UserDao;
import com.klef.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public User getUserByUserId5(String userId) 
	{
		User user=userDao.getUserById5(userId);
		return user;
	}
	
	@Override
	public User getUserByUserId1(String userId) 
	{
		User user=userDao.getUserById1(userId);
		return user;
	}
	
	@Override
	public User getUserByUserId2(String userId) 
	{
		User user=userDao.getUserById2(userId);
		return user;
	}
	
	@Override
	public User getUserByUserId3(String userId) 
	{
		User user=userDao.getUserById3(userId);
		return user;
	}
	
	@Override
	public User getUserByUserId4(String userId) 
	{
		User user=userDao.getUserById4(userId);
		return user;
	}
	
	@Override
	public Shop getUserByUserId6(String user_name) 
	{
		Shop user=userDao.getUserById6(user_name);
		return user;
	}
	
	@Override
	public Grn getUserByUserId7(String grn_name) 
	{
		Grn user=userDao.getUserById7(grn_name);
		return user;
	}
	
	@Override
	public Exp getUserByUserId8(String exp_name) 
	{
		Exp user=userDao.getUserById8(exp_name);
		return user;
	}
	
	@Override
	public Stk getUserByUserId9(String stk_name) 
	{
		Stk user=userDao.getUserById9(stk_name);
		return user;
	}
	
	@Override
	public Dev getUserByUserId10(String dev_name) 
	{
		Dev user=userDao.getUserById10(dev_name);
		return user;
	}
	
	@Override
	public int createNewUser5(User user) {
		return userDao.createNewUser5(user);
	}
	
	@Override
	public int createNewUser1(User user) {
		return userDao.createNewUser1(user);
	}
	
	@Override
	public int createNewUser2(User user) {
		return userDao.createNewUser2(user);
	}
	
	@Override
	public int createNewUser3(User user) {
		return userDao.createNewUser3(user);
	}
	
	@Override
	public int createNewUser4(User user) {
		return userDao.createNewUser4(user);
	}
	
	@Override
	public int createNewUser6(Shop user) {
		return userDao.createNewUser6(user);
	}
	
	@Override
	public int createNewUser7(Grn user) {
		return userDao.createNewUser7(user);
	}
	
	
	@Override
	public int createNewUser8(Exp user) {
		return userDao.createNewUser8(user);
	}
	
	@Override
	public int createNewUser9(Stk user) {
		return userDao.createNewUser9(user);
	}
	
	@Override
	public int createNewUser10(Dev user) {
		return userDao.createNewUser10(user);
	}
	
}
