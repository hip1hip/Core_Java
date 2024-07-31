
public class ProductOutput {
	public void output(Product[] array) {
		System.out.println("                   <<상품별 판매 이익금 및 이익률 표>>");
		System.out.println("--------------------------------");
		System.out.println("상품명\t\t\t 수량 \t 판매단가 \t 매입단가 \t 운송료 \t\t  이익금 \t\t\t 이익률");
		System.out.println("---------------------------------");
		for (Product p : array) {
			System.out.printf("%-20s%, d\t%, d\t%, d\t%, d\t\t%, d\t%10.2f%n",
					p.getName(), p.getQuantity(), p.getSellPrice(), p.getBuyPrice(), p.getTransFee(), p.getBeneFit(), p.getBenefitRate());
		}
	}
}
