package week.product.beauty;

import week.DeliveryChargeCalculator;
import week.Product;

public class Beauty extends Product implements DeliveryChargeCalculator {

	public Beauty(String name, int price, int weight) {
		super(name, price, weight);
	}

	@Override
	public int getDeliveryCharge(int weight, int price) {
		int deliveryTip = 0;
		if (price < 30000) {
			if (weight < 3) {
				deliveryTip = 1000;
			} else if (weight < 10) {
				deliveryTip = 5000;
			} else {
				deliveryTip = 10000;
			}
		} else if (price < 100000) {
			deliveryTip = 9000;
		} else {
			deliveryTip = 0;
		}

		return deliveryTip;
	}
}
