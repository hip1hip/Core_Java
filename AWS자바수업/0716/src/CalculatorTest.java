import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator cal;
	
	@BeforeEach  //검사하기 전에 먼저 돌아감, 
	void init() {
		this.cal = new Calculator();
	}
	
	@Disabled  @Test
	void test() {
		assertNotNull(this.cal);   //널이 아님을 확증한다, 널이 아니먼 거짓이 나옴 
	}
	
	//@Disabled  검사하지 않겠다. 
	 @Test
	void testAdd() {
		 assertEquals(8,this.cal.add(3, 5));
	}

	@Test
	void testSubtract() {
		assertEquals(5, this.cal.subtract(8, 3));
	}

	 @Test
	void testMultiple() {
		 assertEquals(24,this.cal.multiple(6, 4));
	}

	@Test
	void testDivide() {
		assertEquals(4.1,this.cal.divide(24, 6));
	}

}
