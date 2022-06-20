package com.abc.email.model.service;

import java.util.Random;

import com.abc.email.model.Employee;

public class Credentialserviceimpl implements Credentialservice {

	@Override
	public String generateEmailAddress(Employee emp, String department) {
		
		return emp.getFirstname()+emp.getLastname()+"@"+department+".abc.com";
	}

	@Override
	public char[] generatePassword() {
		Random random =new Random();
		
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	    String specialCharacters = "!@#$";
	    String numbers = "1234567890";
	    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	    char[] password = new char[8]; 
	    for(int i = 0; i< 8 ; i++) {
	       password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	    }
	   return password;
	}

	@Override
	public void showCredential(Employee emp, String email, char[] generatePassword) {
	System.out.println("Dear "+ emp.getFirstname() + ""+ emp.getLastname());
    System.out.println("Your generated credentials are as follows");
    System.out.print("email --> ");
    System.out.println(email);
    System.out.print("Password--> ");
    System.out.print(generatePassword);

}
}