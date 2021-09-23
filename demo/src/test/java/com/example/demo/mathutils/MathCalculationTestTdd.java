package com.example.demo.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathCalculationTestTdd {
	
	@Test
	public void calculationTestTdd() {
		
		MathCalculation mathCalculation = new MathCalculation();
		mathCalculation.calculation_tdd(0, 0);
		
		//************ Diffferent Scenarious ******************
		//0,0 = 0
		//-1,1 = 0
		//2,2 = 4
		//-2,2 = 0
		//3,1 = 4
		//3,4 = 7
		
		assertEquals(0,mathCalculation.calculation_tdd(0, 0));
		assertEquals(0,mathCalculation.calculation_tdd(-1, 1));
		assertEquals(0,mathCalculation.calculation_tdd(-2, 2));
		assertEquals(4,mathCalculation.calculation_tdd(2, 2));
		assertEquals(4,mathCalculation.calculation_tdd(3, 1));
		assertEquals(7,mathCalculation.calculation_tdd(3, 4));
		
		
	}
}
