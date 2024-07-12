
//3. static 변수와 static 메서드는 상속되지 않는다. / 스테틱은 별도로 만들어지니깐 객체와 상관없다. 

public class InheritanceDemo2 {

	public static void main(String[] args) {
//		Student jimin = new Student();
//		jimin.
		System.out.println(Student.age);
		System.out.println(Person.age);  // 동일함. 
	}

}

class Person {
	String name = "한지민";
	static int age = 28;
}

class Student extends Person{}
