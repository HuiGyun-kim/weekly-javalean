package week.product.beauty;

// 메이크업 제품 클래스
public class MakeupProduct extends Beauty {
	private String colorPalette;          //제품의 색상 구성

	public MakeupProduct(String name, int price, int weight, String colorPalette) {
		super(name, price, weight);
		this.colorPalette = colorPalette;
	}

	public String getColorPalette() {
		return colorPalette;
	}

	public void setColorPalette(String colorPalette) {
		this.colorPalette = colorPalette;
	}

	@Override
	public String toString() {
		return "당신이 고른 메이크업 제품인 " + getName() + "의 색깔은 " + getColorPalette() + "이고, 이 상품의 배송 가격은 " + getDeliveryCharge(
			getWeight(), getPrice()) + "원 입니다.";
	}
}
