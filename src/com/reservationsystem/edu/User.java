package com.reservationsystem.edu;

import java.sql.Date;

public class User {
	private int userID;
	
	private String firstname, lastname, middlename, suffix;
	private Date birthdate;
	private String gender;
	
	private Address address;
	
	private String email, username, password;
	
	private int countryCode, phoneNumber;
	
	private String secQuestion1, answer1, secQuestion2, answer2;
	
	private String userType;
	
	public void User(String firstName, String lastName, String middleName, String suffix, Date birthdate, String gender, Address addres, String email, String username, String password, int countryCode, int phoneNumber, String secQuestion1, String answer1, String secQuestion2, String answer2) {
		
	}
	
	public void Signup(User user) {
		
	}
	
	public void updateUser(int userID, User user) {
		
	}
	
	public void deleteUser(int userID) {
		
	}
}
