package junit.tutorial.ex01.ex04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e04.NumberUtils;

public class NumberUtilsTest {
	
	@Test
	@DisplayName("1-4")
	void test6() {
		assertEquals(false,NumberUtils.isEven(7));
		assertEquals(true,NumberUtils.isEven(10));
	}

}
