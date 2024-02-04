package week;

/*
<구현 범위>
1. 클래스와 인터페이스 선언, 각 메소드와 필드 선언
2. 그림에 나온 리턴 타입과 다른 리턴타입이어도 괜찮습니다.
    - getDeliveryCharge() 메소드의 리턴타입은 double 혹은 int로 구현해도 OK.
해당 클래스 설계와 아래 설명을 만족하는 기능을 구현하세요.
<구현 조건>
쇼핑몰에서 판매하는 상품 종류는 아래와 같습니다.
1. 식료품
2. 화장품
3. 대형가전

각 상품들은 무게 / 크기 / 가격 속성을 가지고 있습니다.
상품들은 무게 단위와 가격에 따라 아래 표에 따라 배송비가 측정됩니다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
|     무게      |        배송비        |
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
|   3키로 미만   |        1천원        |
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
|  3~10키로 미만 |        5천원        |
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
|  10키로 이상   |        1만원        |
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
무게단위로 측정된 배송비들은 아래와 같은 상품가격에 따라 추가 적용됩니다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
|      가격     |        배송비        |
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
|    3만원 미만  |  무게단위 배송비 적용  |
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
|  3~10만원 미만 |    배송비 천원 할인   |
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
|  10만원 이상   |      배송비 무료     |
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
*/

import week.product.beauty.Beauty;
import week.product.beauty.MakeupProduct;
import week.product.beauty.PerfumeProduct;
import week.product.beauty.SkincareProduct;
import week.product.grocery.Beverage;
import week.product.grocery.FreshFood;
import week.product.grocery.Grocery;
import week.product.largeappliance.AirConditioner;
import week.product.largeappliance.LargeAppliance;
import week.product.largeappliance.Refrigerator;
import week.product.largeappliance.WashingMachine;

public class WeeklyQuiz {
	public static void main(String[] args) {
		// 상품 인스턴스 생성
		Beauty makeupProduct = new MakeupProduct("러블리 레드 립스틱", 13000, 2, "레드");
		System.out.println(makeupProduct);
		Beauty perfumeProduct = new PerfumeProduct("오션 브리즈", 27000, 3, "신선한 바닷가");
		System.out.println(perfumeProduct);
		Beauty skincareProduct = new SkincareProduct("딥 클린 클레이 마스크", 29000, 4, "고체");
		System.out.println(skincareProduct);
		Grocery beverage = new Beverage("쿨 민트 티", 29000, 10, "민트");
		System.out.println(beverage);
		Grocery freshFood = new FreshFood("프리미엄 한우 스테이크", 59000, 15, "한국");
		System.out.println(freshFood);
		LargeAppliance airConditioner = new AirConditioner("에코 쿨 에어컨", 3800000, 140, "1등급");
		System.out.println(airConditioner);
		LargeAppliance refrigerator = new Refrigerator("크리스탈 아이스", 5300000, 640, "1등급");
		System.out.println(refrigerator);
		LargeAppliance washingMachine = new WashingMachine("클린 웨이브 AI 세탁기", 6830000, 250, 15);
		System.out.println(washingMachine);
	}
}
