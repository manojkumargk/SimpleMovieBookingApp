package com;

public class User {
    private String email;
    private int age;
    private String password;

    public User(String email, int age, String password) {
        this.email = email;
        this.age = age;
        this.password = password;
    }

    public String getEmail() {
    	return email;
    	}
    public void setEmail(String email) {
    	this.email = email;
    	}

    public int getAge() {
    	return age;
    	}
    public void setAge(int age) {
    	this.age = age;
    	}

    public String getPassword() {
    	return password;
    	}
    public void setPassword(String password) {
    	this.password = password;
    	}
}
