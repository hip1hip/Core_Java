import java.util.*;

public class DeprecationDemo {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);  //today.toString()
		int year = today.getYear();
		System.out.println(year+ 1900);
	}
}
