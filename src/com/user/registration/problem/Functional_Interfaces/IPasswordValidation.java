package com.user.registration.problem.Functional_Interfaces;

import com.user.registration.problem.UserRegistrationException;

@FunctionalInterface
public interface IPasswordValidation {
	public boolean passwordValidation(String password) throws UserRegistrationException;

}