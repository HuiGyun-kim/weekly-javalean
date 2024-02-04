package week.product.beauty;

//향수 제품 클래스
public class PerfumeProduct extends Beauty {
	private String smellType;     //향수의 향 유형

	public PerfumeProduct(String name, int price, int weight, String smellType) {
		super(name, price, weight);
		this.smellType = smellType;
	}

	public String getSmellType() {
		return smellType;
	}

	public void setSmellType(String smellType) {
		this.smellType = smellType;
	}

	@Override
	public String toString() {
		return "당신이 고른 향수인 " + getName() + "의 향은 " + getSmellType() + "이고, 이 상품의 배송 가격은 " + getDeliveryCharge(
			getWeight(), getPrice()) + "원 입니다.";
	}
}
