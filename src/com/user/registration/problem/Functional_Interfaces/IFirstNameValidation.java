package com.user.registration.problem.Functional_Interfaces;

import com.user.registration.problem.UserRegistrationException;

@FunctionalInterface
public interface IFirstNameValidation {
	public boolean firstNameValidation(String first_name) throws UserRegistrationException;
}