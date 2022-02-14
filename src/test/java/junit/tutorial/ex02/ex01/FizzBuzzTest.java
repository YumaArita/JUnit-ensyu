package junit.tutorial.ex02.ex01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex02.e01.FizzBuzz;

public class FizzBuzzTest {

	@Test
	@DisplayName("2-1")
	void test1() {
		
		String[] items = new String[16];
		String[] items2 = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16"};
		
		
		FizzBuzz fizzBuzz = new  FizzBuzz();
		//assertIterableEquals(1+""+ 2 +""+"Fizz"+""+ 4+""+ "Buzz"+""+6+""+7+""+8+""+"Fizz"+""+"Buzz"+""+11+""+"Fizz"+""+13+""+14+""+"FizzBuzz"+""+16,(fizzBuzz.createFizzBuzzList(16)));
		List<String> list1 = Arrays.asList(items2);
		assertIterableEquals(list1,(fizzBuzz.createFizzBuzzList(16))
				);
	}
}
