package week.product.largeappliance;

//에어컨 제품 클래스
public class AirConditioner extends LargeAppliance {
	private String energyRating;    // 에너지 등급

	public AirConditioner(String name, int price, int weight, String energyRating) {
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
		return "당신이 고른 에어컨인 " + getName() + "의 에너지등급은 " + getEnergyRating() + "이고, 이 상품의 배송 가격은 " + getDeliveryCharge(
			getWeight(), getPrice()) + "원 입니다.";
	}
}
