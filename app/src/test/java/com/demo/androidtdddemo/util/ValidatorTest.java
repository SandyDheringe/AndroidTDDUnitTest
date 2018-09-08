package com.demo.androidtdddemo.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest
{
	
	@Before
	public void setUp()
	{
		//PowerMockito.mockStatic(TextUtils.class);
	}
	
	
	@Test
	public void validateEmail_emptyInput()
	{
		assertFalse(Validator.validateEmail(""));
	}
	
	@Test
	public void validateEmail_nullInput()
	{
		assertFalse(Validator.validateEmail(null));
		//assertThat(Validator.validateEmail(nullValue()));
//		assertThat("");
	}
	@Test
	public void validateEmail_invalidInput()
	{
		assertFalse(Validator.validateEmail("sandy"));
		assertFalse(Validator.validateEmail("sandy@ss"));
		assertFalse(Validator.validateEmail("sandy@ss."));
		assertFalse(Validator.validateEmail("sandy @ sss.com"));
		assertFalse(Validator.validateEmail("sandy@@ss.com"));
		assertFalse(Validator.validateEmail("sandy@san@com"));
		assertThat(Validator.validateEmail("sandy_@san@in"), is(false));
		
	}
	
	@Test
	public void validateEmail_validInput()
	{
		assertTrue(Validator.validateEmail("sandy@s.c"));
		assertTrue(Validator.validateEmail("sandy_@san.com"));
		assertTrue(Validator.validateEmail("sandy_@san.in"));
		assertThat(Validator.validateEmail("sandy_@san.in"), is(true));
	}
	
	@After
	public void tearDown()
	{
	
	}
}