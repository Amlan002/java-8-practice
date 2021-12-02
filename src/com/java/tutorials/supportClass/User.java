package com.java.tutorials.supportClass;

public class User {
	private int Id;
	private String email;
	private String password;
	private String name;

	public User() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(int id, String email, String password, String name) {
		Id = id;
		this.email = email;
		this.password = password;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", email=" + email + ", password=" + password + ", name=" + name + "]";
	}

}
