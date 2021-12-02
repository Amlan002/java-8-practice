package com.java.tutorials.supportClass;

public class UserDto {
	private int Id;
	private String email;
	private String name;

	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserDto(int id, String email, String name) {
		Id = id;
		this.email = email;
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDto [Id=" + Id + ", email=" + email + ", name=" + name + "]";
	}

}
