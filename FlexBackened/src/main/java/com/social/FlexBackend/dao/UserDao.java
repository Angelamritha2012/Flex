package com.social.FlexBackend.dao;

import java.util.Set;
import java.util.List;

import com.social.FlexBackend.model.User;

public interface UserDao {

	public List<User> getAllUser();
	
	public boolean saveUser(User user);
	public User find (int id);
	public boolean updateOnlineStatus(Boolean status,User user);
	public boolean checkLogin (User user);
	
}