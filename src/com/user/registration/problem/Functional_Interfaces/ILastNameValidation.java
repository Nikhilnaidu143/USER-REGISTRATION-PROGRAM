package com.user.registration.problem.Functional_Interfaces;

import com.user.registration.problem.UserRegistrationException;

@FunctionalInterface
public interface ILastNameValidation {
	public boolean lastNameValidation(String last_name) throws UserRegistrationException;

}