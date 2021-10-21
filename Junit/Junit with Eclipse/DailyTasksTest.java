package com.wipro.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DailyTasksTest {

	@Test
	void testDoStringConcat() {
		DailyTasks d = new DailyTasks();
		String result = d.doStringConcat("Hello", "World");
		assertEquals("Hello World",result);
	}
}
