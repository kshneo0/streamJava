package com.fp.ch05;

import java.util.function.Function;

import com.fp.ch05.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Ch05Sec02 {

	public static void main(String[] args) {
		Function<String, Integer> strLength = String::length;
		int length = strLength.apply("hello world");
		System.out.println(length);
		
		BiPredicate<String, String> strEquals = String::equals;
		boolean helloEqualsWorld = strEquals.test("hello","world");
		System.out.println(helloEqualsWorld);
		System.out.println(strEquals.test("hello","hello"));
		
		List<User> users = new ArrayList<>();
		users.add(new User(3, "Alice"));
		users.add(new User(1, "Charlie"));
		users.add(new User(5, "Bob"));
		
//		printUserField(users, (User user) -> user.getId());
		printUserField(users, User::getId);
		printUserField(users, User::getName);
	}
	
	public static void printUserField(List<User> users, Function<User, Object> getter) {
		for( User user : users) {
			System.out.println(getter.apply(user));
		}
	}

}
