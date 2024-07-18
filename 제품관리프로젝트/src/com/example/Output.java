package com.example;

import java.util.List;

public class Output {
	private List<Product> list;
	public Output(List<Product> list) {
		this.list = list;
	}

	public void print() {
		this.labelPrin();
		for(Product p : this.list) {
			System.out.println(p);  //p.toString()
		}
	}
	private void labelPrin() {
		System.out.println("                  <<제품관리 프로그램>>");
		System.out.println("------------------------------------------------------");
		System.out.println("제품명 \t 수량 \t 판매단가 \t 매입단가 \t 운송료 \t이익금 \t 이익율");
		System.out.println("------------------------------------------------------");
	}

}
