package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Input {
	private List<Product> list; //Product 객체들의 리스트를 저장할 변수 
	private Scanner sc;  // 파일을 읽어들이기 위한 스캐너 객체 
	private File file;  // 읽어올 파일을 가리키는 변수
	
	public Input(List<Product> list) {
		this.list = list; //리스트를 매개변수로 받아  'this.list'에 저장 
		this.file = new File("./productdata.txt");

		try {   // 파일을 읽어 들이려는 시도 
			this.sc = new Scanner(this.file);
		} catch (FileNotFoundException e) {  //못찾았을때 예외처리 . 
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		}
	}

	public void fileInput() {
		while(this.sc.hasNextLine()) {  // 다음 라인이 있으면 와일 반복 
			String line = this.sc.nextLine(); //한줄을 읽음 NOTEBOOK	36000	5000	4700	2000
			/*
			 * 1. String' split()
			 * 2. Scanner's useDelemeter()
			 * 3. StringTokenizer  /스페이스바 기준으로 토큰화 스트링으로
			 */
			Scanner scLine = new Scanner(line).useDelimiter("\\s+"); //한 줄을 스페이스바를 기준으로 토큰화 \\s+는 하나 이상의 공백 문자를 의미. 
			Product p = new Product(scLine.next(), scLine.nextInt(),
					scLine.nextInt(),scLine.nextInt(),scLine.nextInt());  //Product 객체를 생성 매개변수를 받음 
			this.list.add(p);  //생성된 'Product' 객체를 리스트에 추가 
			
					
		}
	}

}
