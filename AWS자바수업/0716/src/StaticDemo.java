
public class StaticDemo {
	public static void main(String[] args) {
		Tiger [] array = new Tiger[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Tiger();
		}
		for(Tiger t : array)
			System.out.println("a = " + t.a + ", b =" + Tiger.b );
		
	}
}

class Tiger {
	int a;  //맴버 
	static int b;  //스테틱 , 공유해서 사용함 
	public Tiger() {
		a++;
		b++;
	}
}