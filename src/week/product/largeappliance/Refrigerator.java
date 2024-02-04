package week.product.largeappliance;

//냉장고 제품 클래스
public class Refrigerator extends LargeAppliance {
	private String energyRating;         // 에너지 등급

	public Refrigerator(String name, int price, int weight, String energyRating) {
		super(name, price, weight);
		this.energyRating = energyRating;
	}

	public String getEnergyRating() {
		return energyRating;
	}

	public void setEnergyRating(String energyRating) {
		this.energyRating = energyRating;
	}

	public String toString() {
		return "당신이 고른 냉장고인 " + getName() + "의 에너지등급은 " + getEnergyRating() + "이고, 이 상품의 배송 가격은 " + getDeliveryCharge(
			getWeight(), getPrice()) + "원 입니다.";
	}
}
