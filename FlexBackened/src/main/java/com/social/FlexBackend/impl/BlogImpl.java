package com.social.FlexBackend.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.social.FlexBackend.dao.BlogDao;
import com.social.FlexBackend.model.Blog;

@Repository("blogDAO")
public class BlogImpl implements BlogDao {
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean addBlog(Blog blog) {
		try {
			sessionFactory.getCurrentSession().save(blog);
			return true;
		} catch (Exception e) {

		}
		return false;
	}

	@Transactional
	public boolean updateBlog(Blog blog) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;

		} catch (Exception e) {

		}
		return false;
	}

	@Transactional
	public boolean deleteBlog(Blog blog) {
		try {
			sessionFactory.getCurrentSession().delete(blog);
			return true;

		} catch (Exception e) {

		}
		return false;
	}

	@Transactional
	public Blog getBlog(int blogId) {
		Session session = sessionFactory.openSession();
		Blog blog = (Blog) session.get(Blog.class, new Integer(blogId));
		return blog;
	}

	@Transactional
	public List<Blog> getAllBlogs() {

		return sessionFactory.getCurrentSession().createQuery("from Blog").list();
	}

	@Transactional
	public boolean approveBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

}


