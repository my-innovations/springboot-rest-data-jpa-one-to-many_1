package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.Friend;

public interface FriendService {
	
	Friend saveFriend(Friend friend);
	Friend findFrind(Long id);
	List<Friend> findAllFriends();
	String deleteFriend(Long id);
}
