package com.social.FlexBackend.impl;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.social.FlexBackend.dao.UserDao;
import com.social.FlexBackend.model.User;

@Repository("userDAO")
@Transactional

public class UserImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public List<User> getAllUser() {
		String hql ="from User";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Transactional
	public boolean saveUser(User user) {
		try{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(HibernateException e){
			e.printStackTrace();
			return false;

		}
	}

	@Transactional
	public User getByEmail(String email) {
		
		return (User)sessionFactory.getCurrentSession().get(User.class, email);
	}

	@Transactional
	public boolean updateOnlineStatus(String status, User user) {
		try
		{
			user.setIsOnline(status);
			sessionFactory.getCurrentSession().update(user);
			return true;
		}catch(Exception e)
		{
			System.out.println("exception arised"+e);
			return false;
		}
	
	}

}