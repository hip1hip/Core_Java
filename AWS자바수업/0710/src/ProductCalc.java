
public class ProductCalc {
	public void calc(Product[] array) {
		for(Product p : array) {
			int sellMoney = p.getQuantity() * p.getSellPrice();  // 판매금액 = 수량 * 판매단가
			int buyMoney = p.getQuantity() * p.getBuyPrice();  // 매입금액 
			int benefit = sellMoney - (buyMoney + p.getTransFee()); // 이익금
			double rate =(double)benefit / buyMoney * 100; //이익률 
			p.setBeneFit(benefit);
			p.setBenefitRate(rate);
					
		}
	}
}
