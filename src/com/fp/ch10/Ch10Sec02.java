package com.fp.ch10;


import com.fp.ch10.model.User;

public class Ch10Sec02 {

	public static void main(String[] args) {
		User user = User.builder(1, "Alice")
				.with(builder -> {
					builder.emailAddress = "alice@fastcampus.co.kr";
					builder.isVerified = true;
				}).build();
		System.out.println(user);
	}

}
