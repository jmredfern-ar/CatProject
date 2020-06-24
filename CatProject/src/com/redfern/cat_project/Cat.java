package com.redfern.cat_project;

public class Cat {
	
	private String name;
	private String gender;
	private int age;
	private boolean isAMouser = true;

	public Cat(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public boolean isAMouser() {
		return isAMouser;
	}

	public String getName() {
		return this.name;
	}

	public String getGender() {
		return this.gender;
	}

	public int getAge() {
		return this.age;
	}

}
