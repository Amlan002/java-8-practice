package com.java.tutorials.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.tutorials.supportClass.User;
import com.java.tutorials.supportClass.UserDto;

public class StreamMapping {

	public static void main(String[] args) {
		
		getUsers().stream().map((User user)->new UserDto(user.getId(), user.getEmail(), user.getName())).forEach((userDto)->System.out.println(userDto));
		
		List<UserDto> userDtos= getUsers().stream().map((User user)->new UserDto(user.getId(), user.getEmail(), user.getName())).collect(Collectors.toList());
		userDtos.forEach((x)->System.out.println("========user name "+x.getName()));
	}

	private static List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User(2, "gmail", "xyz", "Amlan"));
		users.add(new User(1, "yahoo", "abc", "Khusi"));
		users.add(new User(3, "hotmail", "mnq", "Arpita"));
		return users;
	}
}
