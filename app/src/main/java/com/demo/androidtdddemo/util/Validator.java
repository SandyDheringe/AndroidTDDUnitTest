package com.demo.androidtdddemo.util;

public class Validator
{
	public static boolean validateEmail(String email)
	{
		if (TextUtils.isEmpty(email))
			return false;
		String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
		return email.matches(emailPattern);
	}
}
