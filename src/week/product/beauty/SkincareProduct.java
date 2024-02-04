package week.product.beauty;

//스킨케어 제품 클래스
public class SkincareProduct extends Beauty {
	private String type;            //자외선 차단 지수

	public SkincareProduct(String name, int price, int weight, String type) {
		super(name, price, weight);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "당신이 고른 스킨케어 제품인 " + getName() + "에 제품의 형태는 " + getType() + "형 이고, 이 상품의 배송 가격은 " + getDeliveryCharge(
			getWeight(), getPrice()) + "원 입니다.";
	}
}
