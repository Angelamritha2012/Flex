package com.social.FlexBackend.dao;

import java.util.List;

import com.social.FlexBackend.model.Forum;

public interface ForumDao {
	public boolean addForum(Forum forum);
	public boolean updateForum(Forum forum);
	public boolean deleteForum(Forum forum);
	public Forum getForum(int forumId);
	public List<Forum> getAllForums();

}
