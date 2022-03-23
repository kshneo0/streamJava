package com.fp.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fp.ch04.model.User;

public class Ch04Sec05 {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(3, "Alice"));
		users.add(new User(1, "Charlie"));
		users.add(new User(5, "Bob"));
		System.out.println(users);
		
		Comparator<User> isComparator = (u1, u2) -> u1.getId() - u2.getId();
		Collections.sort(users, isComparator);
		System.out.println(users);
		
		Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
		System.out.println(users);
		
	}
}
