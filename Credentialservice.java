package com.abc.email.model.service;
import com.abc.email.model.Employee;
public interface Credentialservice {
	public String generateEmailAddress(Employee emp,String department);
	public char[] generatePassword();
	public void showCredential(Employee emp, String email, char[] generatePassword);
}
