//MethodReference
/*
 * Lambda experssion 구현코드에서 다른 클래스의 단 하나의 메소드만 참조한다는 것을 보장한다면
 * 클래스명 :: 메서드명
 */

@FunctionalInterface
interface MyPolygon{
	double redianToDegree(double value);
}

public class MethodReferenceDemo {
	public static void main(String[] args) {
	MyPolygon mp = (radina) -> Math.toDegrees(radina);  //lambda experssion	
	double result = mp.redianToDegree(1);
	System.out.println(result);
	
	MyPolygon mp1 = Math::toDegrees;  //메서드 참조 , 특정 클래스의 단하나만 사용하는걸 보장하면 / ClassName :: methodName
	double result1 = mp1.redianToDegree(1);
	System.out.println(result1);
	}
}
