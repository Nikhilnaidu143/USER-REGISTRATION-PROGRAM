package com.user.registration.problem.Functional_Interfaces;

import com.user.registration.problem.UserRegistrationException;

@FunctionalInterface
public interface IEmailValidation {
	public boolean emailValidation(String email) throws UserRegistrationException;

}