package junit.tutorial.ex01.ex05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e05.Item;
import junit.tutorial.ex01.e05.ItemStock;

public class itemTest {
	
	@Test
	@DisplayName("1-5-1")
	void test7() {
		Item item = new Item("TV",15000);
		ItemStock itemStock = new ItemStock();
		assertEquals(0,itemStock.getNum(item));
	}
	
	@Test
	@DisplayName("1-5-2")
	void test8() {
		Item item = new Item("TV",15000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item));
	}
	
	@Test
	@DisplayName("1-5-3")
	void test9() {
		Item item = new Item("TV",15000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		itemStock.add(item);
		assertEquals(2,itemStock.getNum(item));
	}
	
	@Test
	@DisplayName("1-5-4")
	void test10() {
		Item item = new Item("TV",15000);
		Item item2 = new Item("PC",155000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		itemStock.add(item);
		itemStock.add(item2);
		assertEquals(1,itemStock.getNum(item2));
	}
}
