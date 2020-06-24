package com.redfern.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CatTest {
	
	private static Cat felix;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
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
	

}
