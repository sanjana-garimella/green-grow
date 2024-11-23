package com.klef.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.klef.demo.controller.bean.Dev;
import com.klef.demo.controller.bean.Exp;
import com.klef.demo.controller.bean.Grn;
import com.klef.demo.controller.bean.Shop;
import com.klef.demo.controller.bean.Stk;
import com.klef.demo.controller.bean.User;
import com.klef.demo.dao.UserDao;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void initialize()
	{
		setDataSource(dataSource);
	}

	@Override
	public User getUserById5(String userId) {
		String sql="select user_pswd from customer where user_mail=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{userId},new RowMapper<User>()
		{
		@Override	
		public User mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			User user=new User();
			user.setUserId(userId);
			user.setPassword(rs.getString(1));
			return user;
		}
		});
		
	}
	
	@Override
	public User getUserById1(String userId) {
		String sql="select user_pswd from green_enterpreneur where user_mail=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{userId},new RowMapper<User>()
		{
		@Override	
		public User mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			User user=new User();
			user.setUserId(userId);
			user.setPassword(rs.getString(1));
			return user;
		}
		});
		
	}
	
	@Override
	public User getUserById2(String userId) {
		String sql="select user_pswd from expert where user_mail=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{userId},new RowMapper<User>()
		{
		@Override	
		public User mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			User user=new User();
			user.setUserId(userId);
			user.setPassword(rs.getString(1));
			return user;
		}
		});
		
	}
	
	@Override
	public User getUserById3(String userId) {
		String sql="select user_pswd from stakeholder where user_mail=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{userId},new RowMapper<User>()
		{
		@Override	
		public User mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			User user=new User();
			user.setUserId(userId);
			user.setPassword(rs.getString(1));
			return user;
		}
		});
		
	}
	
	@Override
	public User getUserById4(String userId) {
		String sql="select user_pswd from developer where user_mail=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{userId},new RowMapper<User>()
		{
		@Override	
		public User mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			User user=new User();
			user.setUserId(userId);
			user.setPassword(rs.getString(1));
			return user;
		}
		});
		
	}
	
	@Override
	public Shop getUserById6(String user_name) {
		String sql="select * from shop where user_name=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{user_name},new RowMapper<Shop>()
		{
		@Override	
		public Shop mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			Shop user=new Shop();
			user.setUser_name(user_name);
			System.out.println(rs.getString("user_mail"));
			user.setUser_street(rs.getString("user_name"));
			user.setUser_country(rs.getString(1));
			user.setUser_products(rs.getString(2));
			return user;
		}
		});
		
	}
	
	@Override
	public Grn getUserById7(String grn_name) {
		String sql="select * from ideas where grn_name=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{grn_name},new RowMapper<Grn>()
		{
		@Override	
		public Grn mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			Grn user=new Grn();
			user.setGrn_name(grn_name);
			user.setGrn_email(rs.getString(1));
			user.setGrn_idea(rs.getString(2));
			return user;
		}
		});
		
	}
	
	@Override
	public Exp getUserById8(String exp_name) {
		String sql="select * from suggestions where exp_name=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{exp_name},new RowMapper<Exp>()
		{
		@Override	
		public Exp mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			Exp user=new Exp();
			user.setExp_name(exp_name);
			user.setExp_email(rs.getString(1));
			user.setExp_suggestion(rs.getString(2));
			return user;
		}
		});
		
	}
	
	@Override
	public Stk getUserById9(String stk_name) {
		String sql="select * from investments where stk_name=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{stk_name},new RowMapper<Stk>()
		{
		@Override	
		public Stk mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			Stk user=new Stk();
			user.setStk_name(stk_name);
			user.setStk_email(rs.getString(1));
			user.setStk_grn_email(rs.getString(2));
			user.setStk_price(rs.getString(3));
			user.setStk_investment(rs.getString(4));
			return user;
		}
		});
		
	}
	
	@Override
	public Dev getUserById10(String dev_name) {
		String sql="select * from developments where dev_name=?";
		
		return getJdbcTemplate().queryForObject(sql, new Object[]{dev_name},new RowMapper<Dev>()
		{
		@Override	
		public Dev mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			Dev user=new Dev();
			user.setDev_name(dev_name);
			user.setDev_email(rs.getString(1));
			user.setDev_grn_email(rs.getString(2));
			user.setDev_stk_email(rs.getString(3));
			user.setDev_product_desc(rs.getString(4));
			return user;
		}
		});
		
	}
	
	@Override
	public int createNewUser5(User user)
	{
		String sql="insert into customer(user_name,user_mail,user_pswd) values(?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(2, user.getUserId());
				ps.setString(1, user.getCname());
				ps.setString(3, user.getPassword());
				return ps;
			}
			
		});
	}
	
	@Override
	public int createNewUser1(User user)
	{
		String sql="insert into green_enterpreneur(user_name,user_mail,user_pswd) values(?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, user.getCname());
				ps.setString(2, user.getUserId());
				ps.setString(3, user.getPassword());
				return ps;
			}
			
		});
	}
	
	@Override
	public int createNewUser2(User user)
	{
		String sql="insert into expert(user_name,user_mail,user_pswd) values(?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(2, user.getUserId());
				ps.setString(1, user.getCname());
				ps.setString(3, user.getPassword());
				return ps;
			}
			
		});
	}
	
	@Override
	public int createNewUser3(User user)
	{
		String sql="insert into stakeholder(user_name,user_mail,user_pswd) values(?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(2, user.getUserId());
				ps.setString(1, user.getCname());
				ps.setString(3, user.getPassword());
				return ps;
			}
			
		});
	}
	
	@Override
	public int createNewUser4(User user)
	{
		String sql="insert into developer(user_name,user_mail,user_pswd) values(?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(2, user.getUserId());
				ps.setString(1, user.getCname());
				ps.setString(3, user.getPassword());
				return ps;
			}
			
		});
	}
	
	@Override
	public int createNewUser6(Shop user)
	{
		String sql="insert into shop(user_name,user_country,user_street,user_state,user_zip,user_phone,user_mail,user_products) values(?,?,?,?,?,?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, user.getUser_name());
				ps.setString(2, user.getUser_country());
				ps.setString(3, user.getUser_street());
				ps.setString(4, user.getUser_state());
				ps.setString(5, user.getUser_zip());
				ps.setString(6, user.getUser_phone());
				ps.setString(7, user.getUser_mail());
				ps.setString(8, user.getUser_products());
				return ps;
			}
			
		});
	}
	
	@Override
	public int createNewUser7(Grn user)
	{
		String sql="insert into ideas(grn_name,grn_email,grn_idea) values(?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, user.getGrn_name());
				ps.setString(2, user.getGrn_email());
				ps.setString(3, user.getGrn_idea());
				return ps;
			}
			
		});
	}
	
	@Override
	public int createNewUser8(Exp user)
	{
		String sql="insert into suggestions(exp_name,exp_email,exp_suggestion) values(?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, user.getExp_name());
				ps.setString(2, user.getExp_email());
				ps.setString(3, user.getExp_suggestion());
				return ps;
			}
			
		});
	}
	
	
	@Override
	public int createNewUser9(Stk user)
	{
		String sql="insert into investments(stk_name,stk_email,stk_grn_email,stk_price,stk_investment) values(?,?,?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, user.getStk_name());
				ps.setString(2, user.getStk_email());
				ps.setString(3, user.getStk_grn_email());
				ps.setString(4, user.getStk_price());
				ps.setString(5, user.getStk_investment());
				return ps;
			}
			
		});
	}
	
	@Override
	public int createNewUser10(Dev user)
	{
		String sql="insert into developments(dev_name,dev_email,dev_grn_email,dev_stk_email,dev_product_desc) values(?,?,?,?,?)";
		
		return getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, user.getDev_name());
				ps.setString(2, user.getDev_email());
				ps.setString(3, user.getDev_grn_email());
				ps.setString(4, user.getDev_stk_email());
				ps.setString(5, user.getDev_product_desc());
				return ps;
			}
			
		});
	}
}
