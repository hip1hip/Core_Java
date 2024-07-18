package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.Input;
import com.example.Product;

class InputTest {
//	private List<Product> list;
//	
//	@BeforeEach
//	void init() {
//		this.list = new ArrayList<Product>();
//	}
	
	@Test
	void testFileInput() {
		List<Product> list = new ArrayList<Product>();
		Input input = new Input(list);
		input.fileInput();
//		assertNotNull(list);  //ㅁ
		assertEquals("DISKETTE",list.get(5).getName());  //5번째 이름이 DISKETTE 이야?
		
	}

}
