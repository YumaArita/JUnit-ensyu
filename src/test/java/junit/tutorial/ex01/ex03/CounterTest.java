package junit.tutorial.ex01.ex03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e03.Counter;

public class CounterTest {

	@Test
	@DisplayName("1-3-1")
	void test3() {
		Counter C = new Counter();
		assertEquals(1, C.increment());

	}

	@Test
	@DisplayName("1-3-2")
	void test4() {
		Counter C = new Counter();
		C.increment();
		assertEquals(2, C.increment());

	}

	@Test
	@DisplayName("1-3-3")
	void test5() {
		Counter C = new Counter();
		C.SC(50);
		assertEquals(51, C.increment());
	}
}
