package com.redfern.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersianTest {

	private static Persian felix; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Persian("Felix", "male", 0);
	}

	@Test
	void felix_GivenThreeParameters_ShouldConstructPersian() {
		assertTrue(felix instanceof Persian);
	}

}
