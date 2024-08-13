
public class GrandSon implements Son {
	public static void main(String[] args) {
		GrandFather jimin = new GrandSon();
		jimin.grandFather();
		
		Father chulsu = new GrandSon(); 
		chulsu.grandFather();
		
		Mother younghee = new GrandSon();
		younghee.mother();
		
		Son youngsu = new GrandSon(); 
		youngsu.son();
		//Son 은 GrandFather, Father , Mother 그리고 본인 메서드 모두 접근 가능 
		Son [] array = new Son[3];
		System.out.println(Father.NAME + " , " + Mother.NAME);
	}
	
	@Override
	public void father() {
		System.out.println("Called by father()");
	}

	@Override
	public void grandFather() {
		System.out.println("Called by grandfather()");
	}

	@Override
	public void mother() {
		System.out.println("Called by mother()");
	}

	@Override
	public void son() {
		System.out.println("Called by son()");
	}

}
