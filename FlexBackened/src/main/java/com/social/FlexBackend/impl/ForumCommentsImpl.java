package com.social.FlexBackend.impl;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.social.FlexBackend.dao.ForumCommentsDao;
import com.social.FlexBackend.model.ForumComments;

@Repository("forumCommentsDAO")
public class ForumCommentsImpl implements ForumCommentsDao {
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean saveForumComments(ForumComments forumComments) {
		{
			try {
				sessionFactory.getCurrentSession().save(forumComments);
				return true;
			} catch (Exception e) {
				System.out.println("exception arised" + e);
			}
		}
		return false;
	}

	@Transactional
	public boolean deleteForumComments(ForumComments forumComments) {
		try {
			sessionFactory.getCurrentSession().delete(forumComments);
			return true;
		} catch (Exception e) {
			System.out.println("exception arised" + e);
		}
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean updateForumComments(ForumComments forumComments) {
		try{
			sessionFactory.getCurrentSession().update(forumComments);
			return true;
		}catch(Exception e){
			System.out.println("exception arised"+e);

		}
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public ForumComments getForumComments(int fComments) {
		Session session = sessionFactory.openSession();
		ForumComments forumComments = (ForumComments) session.get(ForumComments.class, new Integer(fComments));
		return forumComments;
		
	}
	@Transactional
	
	public List<ForumComments> getAllForumComments() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from ForumComments").list();
	}

}

