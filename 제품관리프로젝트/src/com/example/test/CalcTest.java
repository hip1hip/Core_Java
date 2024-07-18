package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.Calc;
import com.example.Input;
import com.example.Product;

class CalcTest {

	@Test
	void testClac() {
		List<Product>list = new ArrayList<Product>();
		Input input = new Input(list);
		input.fileInput();
		Calc calc = new Calc(list);
		calc.clac();
		assertEquals(7_597_000, list.get(1).getBenefit()); //너의 1번째 배네핏이 7,597,000 맞는지?
	}

}
