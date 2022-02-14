package junit.tutorial.ex01.ex02;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e02.Calculator;

public class CalculatorTest {
	
	@Test
	@DisplayName("1-2")
	void test2() {
		Calculator CU = new Calculator();
		assertThrows(IllegalArgumentException.class,() -> {CU.divide(3, 0);});
		
	}
}
