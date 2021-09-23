package com.example.demo.mathutils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
public class MathCalculationTests {
	
	@Test
	public void calculationTest() {
		
		MathCalculation mathCalculation = new MathCalculation();
		//1 scenario
		int actualResult = mathCalculation.calculateMultiplication(2, 3);		
		assertEquals(6,actualResult);
		
		//2 scenario
		actualResult = mathCalculation.calculateMultiplication(-2, 3);		
		assertEquals(-6,actualResult);
		
		//3 scenario using list
		List<Integer> l1 = Stream.of(1,2,3,4,5).collect(Collectors.toList());
		List<Integer> l2 = Stream.of(1,-2,3,4,6).collect(Collectors.toList());
		
		for(int i=0 ; i<l1.size();i++) {
			
			int actualResult1 = mathCalculation.calculateMultiplication(l1.get(i),l2.get(i));		
			assertEquals(l1.get(i)*l2.get(i),actualResult1);
			
		}
		
		
	}

}
