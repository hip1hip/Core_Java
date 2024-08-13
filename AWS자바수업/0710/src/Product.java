
public class Product {
	private String name; //이름 
	private int quantity, buyPrice, sellPrice; //수량 , 구입금액 , 판매금액 
	private int transFee, beneFit;  // 운송료 , 이익금
	private double benefitRate; // 이익율 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getTransFee() {
		return transFee;
	}
	public void setTransFee(int transFee) {
		this.transFee = transFee;
	}
	public int getBeneFit() {
		return beneFit;
	}
	public void setBeneFit(int beneFit) {
		this.beneFit = beneFit;
	}
	public double getBenefitRate() {
		return benefitRate;
	}
	public void setBenefitRate(double benefitRate) {
		this.benefitRate = benefitRate;
	}

	
}
