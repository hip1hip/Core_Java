/*
 * Author : HongInPyo
 * When : Jul , 1, 2024
 * objective : Java First Coding
 * Environment : Windows 10 , JDK 17
 * 
*/ 
public class HelloWorld {
	public static void main(String [] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("이름이 뭐야? : "); 
		String name = sc.nextLine();   //넥스트 라인 - 한줄을 읽을거야 
		System.out.printf("귀하의 이름은 %s 입니다. \n",name);
	}
}



