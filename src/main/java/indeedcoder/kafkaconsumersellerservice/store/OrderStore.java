package indeedcoder.kafkaconsumersellerservice.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import indeedcoder.kafkaconsumersellerservice.entity.SellerOrder;
import indeedcoder.kafkaconsumersellerservice.model.CustomerOrder;
import indeedcoder.kafkaconsumersellerservice.repository.SellerOrderRepository;
import indeedcoder.kafkaconsumersellerservice.utils.JsonUtil;
import indeedcoder.kafkaconsumersellerservice.utils.OrderUtil;

@Component
public class OrderStore {

	@Autowired
	private SellerOrderRepository repository;

	public void createOrder(String message) {
		CustomerOrder customerOrder = JsonUtil.toOrder(message, CustomerOrder.class);
		SellerOrder sellerOrder = OrderUtil.getSellerOrder(customerOrder);
		repository.add(sellerOrder);
	}

	public List<SellerOrder> getAllOrders() {
		return repository.getAll().values().stream().toList();
	}
}
