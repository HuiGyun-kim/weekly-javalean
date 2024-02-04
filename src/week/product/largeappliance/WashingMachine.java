package week.product.largeappliance;

//세탁기 제품 클래스
public class WashingMachine extends LargeAppliance {
	private int washPrograms;       // 세탁 프로그램 수

	public WashingMachine(String name, int price, int weight, int washPrograms) {
		super(name, price, weight);
		this.washPrograms = washPrograms;
	}

	public int getWashPrograms() {
		return washPrograms;
	}

	public void setWashPrograms(int washPrograms) {
		this.washPrograms = washPrograms;
	}

	public String toString() {
		return "당신이 고른 세탁기인 " + getName() + "의 세탁 프로그램수는 " + getWashPrograms() + "개 이고, 이 상품의 배송 가격은 "
			+ getDeliveryCharge(getWeight(), getPrice()) + "원 입니다.";
	}
}
