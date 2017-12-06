package com.social.FlexBackend.impl;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.social.FlexBackend.dao.ForumDao;
import com.social.FlexBackend.model.Forum;
@Repository("forumDAO")
public class ForumImpl implements ForumDao {
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean addForum(Forum forum) {
		try {
			sessionFactory.getCurrentSession().save(forum);
			return true;

		} catch (Exception e) {

		}
		return false;
	}

	@Transactional
	public boolean updateForum(Forum forum) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(forum);
			return true;

		} catch (Exception e) {

		} 
		return false;
	}

	@Transactional
	public boolean deleteForum(Forum forum) {
		try{
			sessionFactory.getCurrentSession().delete(forum);
			return true;

		}catch(Exception e){
			
		}
		return false;
	}

	@Transactional
	public Forum getForum(int forumId) {
		Session session = sessionFactory.openSession();
		Forum forum = (Forum) session.get(Forum.class, new Integer(forumId));
		return forum;
		
	}

	@Transactional
	public List<Forum> getAllForums() {
		
		return sessionFactory.getCurrentSession().createQuery("from Forum").list();
	}

}

