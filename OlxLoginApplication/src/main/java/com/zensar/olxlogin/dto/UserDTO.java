package com.zensar.olxlogin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Automatically Creates all the Getters,Setters,ArgsConstructors,
@NoArgsConstructor // Creates a default constructor
@AllArgsConstructor //Creates all arguments constructor
public class UserDTO {

	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String phone;
}
