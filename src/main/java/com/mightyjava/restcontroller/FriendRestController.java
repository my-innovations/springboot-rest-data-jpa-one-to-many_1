package com.mightyjava.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mightyjava.entity.Friend;
import com.mightyjava.service.FriendService;

@RestController
@RequestMapping("/friend")
public class FriendRestController {

	private FriendService userService;

	@Autowired
	public FriendRestController(FriendService userService) {
		this.userService = userService;
	}

	@RequestMapping("/save")
	public Friend saveFriend(@RequestBody Friend friend) {
		return userService.saveFriend(friend);
	}

	@RequestMapping("/{id}")
	public Friend findUser(@PathVariable Long id) {
		return userService.findFrind(id);
	}

	@RequestMapping("/all")
	public List<Friend> friendsList() {
		return userService.findAllFriends();
	}

	@RequestMapping("/delete/{id}")
	public String deleteFriend(@PathVariable Long id) {
		return userService.deleteFriend(id);
	}
}
