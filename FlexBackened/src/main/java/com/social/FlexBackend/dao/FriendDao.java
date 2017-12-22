package com.social.FlexBackend.dao;

import java.util.List;

import com.social.FlexBackend.model.Friend;
public interface FriendDao {
public boolean createFriend(Friend friend);
public List<Friend> getAllFriendRequest(String username);
public List<Friend> getApprovedFriends(String username);
public Friend getFriend(int friendId);
public boolean  rejectFriendRequest(Friend friend);
public boolean approveFriendRequest(Friend friend);
}

