package com.social.FlexBackend.dao;

import java.util.List;

import com.social.FlexBackend.model.ForumComments;

public interface ForumCommentsDao {
	public boolean saveForumComments(ForumComments forumComments);

	public boolean deleteForumComments(ForumComments forumComments);

	public boolean updateForumComments(ForumComments forumComments);

	public ForumComments getForumComments(int fComments);

	public List<ForumComments> getAllForumComments();
}