package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.models.ObjectModel;
import org.junit.jupiter.api.Test;

class ObjectModelTest {

	@Test
	void testGetObjectId() {
		ObjectModel object = new ObjectModel(1, "Sword", 10, 20, 100, 5, 50, "A sharp sword");
		assertEquals(1, object.getObject_id());
	}

	@Test
	void testGetObjectName() {
		ObjectModel object = new ObjectModel(1, "Sword", 10, 20, 100, 5, 50, "A sharp sword");
		assertEquals("Sword", object.getObject_name());
	}

	@Test
	void testSetObjectName() {
		ObjectModel object = new ObjectModel(1, "Sword", 10, 20, 100, 5, 50, "A sharp sword");
		object.setObject_name("Axe");
		assertEquals("Axe", object.getObject_name());
	}

	@Test
	void testGetDamage() {
		ObjectModel object = new ObjectModel(1, "Sword", 10, 20, 100, 5, 50, "A sharp sword");
		assertEquals(10, object.getDamage());
	}

	@Test
	void testSetDamage() {
		ObjectModel object = new ObjectModel(1, "Sword", 10, 20, 100, 5, 50, "A sharp sword");
		object.setDamage(15);
		assertEquals(15, object.getDamage());
	}

}
