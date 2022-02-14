package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	@DisplayName("1-1")
	void test1() {

//		 StringUtils SU = new StringUtils();
		assertEquals("aaa", StringUtils.toSnakeCase("aaa"));
		assertEquals("hello_world", StringUtils.toSnakeCase("HelloWorld"));
		assertEquals("practice_junit", StringUtils.toSnakeCase("practiceJunit"));
	}
	

}