package com.redfern.cat_project;

import java.io.Serializable;

public class Cat implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	public void meow(int numTimes) {
		for(int i=0; i<numTimes; i++) {
			System.out.println("Meow");
		}
	}
	
	public String[] meow(String string, int size) {
		String[] strings = new String[size];
		for(int i=0; i<size; i++) {
			strings[i] = string;
		}
		return strings;
	}
}
