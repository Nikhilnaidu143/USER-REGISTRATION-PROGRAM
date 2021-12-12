package com.user.registration.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistrationProblem uspTest;

	@Before
	public void classObject() {
		uspTest = new UserRegistrationProblem();
	}

	/**
	 * UC-12 :- Refactor the Code to throw custom exceptions in case of Invalid User
	 * Details.
	 **/
	@Test
	public void given_first_name_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.firstNameValidation("Nikhil");
		assertEquals(true, output);
	}

	@Test
	public void given_first_name_expected_as_false() {
		try {
			boolean output = uspTest.firstNameValidation("nikhil");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_last_name_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.lastNameValidation("Sundarasetty");
		assertEquals(true, output);
	}

	@Test
	public void given_last_name_expected_as_false() {
		try {
			boolean output = uspTest.lastNameValidation("sundarasetty");
			assertEquals(false, output);

		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void given_email__extpected_as_true() throws UserRegistrationException {
		boolean output = uspTest.emailValidation("nikhilnaidu473@gmail.com");
		assertEquals(true, output);
	}

	@Test
	public void given_email__extpected_as_false() {
		try {
			boolean output = uspTest.emailValidation("nikhilnaidu473@.gmail.com.com.");
			assertEquals(true, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_mobile_number_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.mobileNumberValidation("91 9398359637");
		assertEquals(true, output);
	}

	@Test
	public void given_mobile_number_expected_as_false() {
		try {
			boolean output = uspTest.mobileNumberValidation("919398359637");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_password_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.passwordValidation("Nikhil123@");
		assertEquals(true, output);
	}

	@Test
	public void given_password_expected_as_false() {
		try {
			boolean output = uspTest.passwordValidation("Nikhi$l123@");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}
}