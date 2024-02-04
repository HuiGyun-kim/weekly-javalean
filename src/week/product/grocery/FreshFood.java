package week.product.grocery;

//신선 식품 클래스
public class FreshFood extends Grocery {
	private String origin;             //원산지

	public FreshFood(String name, int price, int weight, String origin) {
		super(name, price, weight);
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String toString() {
		return "당신이 고른 신선 식품인 " + getName() + "의 원산지는 " + getOrigin() + "이고, 이 상품의 배송 가격은 " + getDeliveryCharge(
			getWeight(), getPrice()) + "원 입니다.";
	}
}
