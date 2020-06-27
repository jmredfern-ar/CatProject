package com.redfern.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CatTest {
	
	protected static Cat felix;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Cat("Felix", "male", 6);
	}

	@Test
	// <method under test>_<GivenParameters>_<Result You Expect>() 
	public void cat_GivenThreeParameters_ShouldConstructCat() {
		assertTrue(felix instanceof Cat);
		assertEquals("Felix", felix.getName());
		assertEquals("male", felix.getGender());
		assertEquals(6, felix.getAge());
		assertNotEquals(7, felix.getAge());
	}
	
	@Test
	void meow_GivenStringAndSize_ShouldReturnArrayOfStrings() {
		int length = 10;
		String catSez = "meow";
		String[] strings = felix.meow(catSez, length);
		assertEquals(length, strings.length);
		for(int i=0; i<length; i++) {
			assertEquals(catSez, strings[i]);
		}
	}
}
