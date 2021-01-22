package com.mightyjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightyjava.entity.Friend;
import com.mightyjava.repository.FriendRepository;

@Service
public class FriendServiceImpl implements FriendService {

	private FriendRepository userRepository;

	@Autowired
	public FriendServiceImpl(FriendRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<Friend> findAllFriends() {
		return userRepository.findAll();
	}

	@Override
	public Friend findFrind(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public Friend saveFriend(Friend friend) {
		//Friend f = userRepository.save(friend); //ok
		Friend f = userRepository.saveAndFlush(friend);
		System.out.println(f);
		return f;
	}

	@Override
	public String deleteFriend(Long id) {
		userRepository.deleteById(id);
		return "{'message':'User deleted successfully.'}";
	}
}
