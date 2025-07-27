package indeedcoder.kafkaconsumersellerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import indeedcoder.kafkaconsumersellerservice.entity.SellerOrder;
import indeedcoder.kafkaconsumersellerservice.store.OrderStore;

@RestController
public class ConsumerController {

	@Autowired
	private OrderStore orderStore;

	@GetMapping("/all-orders")
	public List<SellerOrder> getAllOrders(){
		return orderStore.getAllOrders();
	}
}
