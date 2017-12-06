package com.social.FlexBackend.dao;

import java.util.List;

import com.social.FlexBackend.model.Friend;

public interface FriendDao {
public boolean saveFriend(Friend friend);
public boolean deleteFriend(Friend friend);
public boolean updateFriend(Friend friend);
public Friend getFriend(int friendId);
public List<Friend> getAllFriend();


}
