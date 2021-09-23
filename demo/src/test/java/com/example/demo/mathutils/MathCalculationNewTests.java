package com.example.demo.mathutils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MathCalculationNewTests {

	@Test
	public void calculationTest() {
		
		MathCalculation mathCalculation = new MathCalculation();
		int actualResult = mathCalculation.calculation(5, 2);
		
		assertEquals(7,actualResult);
		
	}
}
