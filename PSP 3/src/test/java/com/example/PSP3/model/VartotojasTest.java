package com.example.PSP3.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;




class VartotojasTest {
	
	
	@Test
	void testVartotjasGetters() {
		Vartotojas v = new Vartotojas(1, "Algis", "Karosas", "861603153", "karosas@gmail.com", "Berzunu 2", "Qwerty");
		assertAll("Test Preke constructor",
				() -> assertEquals(1, v.getId()),
				() -> assertEquals("Algis", v.getVardas()),
				() -> assertEquals("Karosas", v.getPavarde()),
				() -> assertEquals("861603153", v.getNumeris()),
				() -> assertEquals("karosas@gmail.com", v.getEmail()),
				() -> assertEquals("Berzunu 2", v.getAdresas()),
				() -> assertEquals("Qwerty", v.getSlaptazodis())
				);
	}
	
	void testCompareTo() {
		Vartotojas v1 = new Vartotojas(1, "Algis", "Karosas", "861603153", "karosas@gmail.com", "Berzunu 2", "Qwerty");
		Vartotojas v2 = new Vartotojas(1, "Algis", "Karosas", "861603153", "karosas@gmail.com", "Berzunu 2", "Qwerty");
		assertEquals(0, v1.compareTo(v2));
	}
	
	@Test
	void testEqualsObject() {
		Vartotojas v1 = new Vartotojas(1, "Algis", "Karosas", "861603153", "karosas@gmail.com", "Berzunu 2", "Qwerty");
		Vartotojas v2 = new Vartotojas(1, "Algis", "Karosas", "861603153", "karosas@gmail.com", "Berzunu 2", "Qwerty");
		assertTrue(v1.equals(v2));
	}
	
	@Test
	void testSetId() {
		Vartotojas v = new Vartotojas();
		assertThrows(NullPointerException.class, () -> {  v.setId(-1);  });
	}

	@Test
	void testSetEmail() {
		Vartotojas v = new Vartotojas();
		assertThrows(NullPointerException.class, () -> {  v.setEmail(null);  });
	}
}
