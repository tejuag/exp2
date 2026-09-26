package com.exmple.vve.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.*;
import org.junit.jupiter.api.Test;

public class AppTest {
	App app=new App();
	@Test
	 void testAdd() {
		 assertEquals(25, app.add(20,5));
	 }
    @Test
    void testSubtract() {
    	assertEquals(15, app.sub(20,5));
    }
}

