package com.java.tutorials.supporClass;

public class Employee{
	private int Id;
	private int age;
	private long salary;
	private String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int age, long salary, String name) {
 		Id = id;
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
