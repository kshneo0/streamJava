package com.fp.ch10.service;

import com.fp.ch10.model.User;

public interface EmailProvider {
	String getEmail(User user);
}
