package week.product.grocery;

//음료 제품 클래스
public class Beverage extends Grocery {
	private String flavor;             // 맛

	public Beverage(String name, int price, int weight, String flavor) {
		super(name, price, weight);
		this.flavor = flavor;
		System.out.println(
			"당신이 고른 음료 제품인 " + getName() + "의 맛은 " + getFlavor() + "이고, 이 상품의 배송 가격은 " + getDeliveryCharge(
				getWeight(), getPrice()) + "원 입니다."
		);
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
}

