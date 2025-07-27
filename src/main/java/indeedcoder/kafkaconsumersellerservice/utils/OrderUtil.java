package indeedcoder.kafkaconsumersellerservice.utils;

import indeedcoder.kafkaconsumersellerservice.entity.SellerOrder;
import indeedcoder.kafkaconsumersellerservice.model.CustomerOrder;

public class OrderUtil {

	private OrderUtil() {
	}

	public static SellerOrder getSellerOrder(CustomerOrder customerOrder) {
		return new SellerOrder(customerOrder.getId(), customerOrder.getCustomerName(), customerOrder.getItemId(),
				customerOrder.getDateOfOrder());
	}
}
