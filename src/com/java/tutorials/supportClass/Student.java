package com.java.tutorials.supportClass;

import java.util.List;

public class Student {
	 private String name;
     private Integer age = 30;
     private List<String> phoneNumbers;

     public Student(String name, Integer age, List<String> phoneNumbers) {
         this.name = name;
         this.age = age;
         this.phoneNumbers = phoneNumbers;
     }

     public List<String> getPhoneNumbers() {
         return phoneNumbers;
     }

     public void setPhoneNumbers(List<String> phoneNumbers) {
         this.phoneNumbers = phoneNumbers;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Integer getAge() {
         return age;
     }

     public void setAge(Integer age) {
         this.age = age;
     }

     @Override
     public String toString() {
         return "name : " + name + " age : " + age;
     }
}
