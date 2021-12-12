package com.user.registration.problem.Functional_Interfaces;

import com.user.registration.problem.UserRegistrationException;

@FunctionalInterface
public interface IMobileNumValidation {
	public boolean mobileNumberValidation(String mobileNum) throws UserRegistrationException;

}