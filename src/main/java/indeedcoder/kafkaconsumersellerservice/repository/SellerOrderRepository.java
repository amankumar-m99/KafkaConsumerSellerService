package indeedcoder.kafkaconsumersellerservice.repository;

import java.util.Map;

import indeedcoder.kafkaconsumersellerservice.entity.SellerOrder;

public interface SellerOrderRepository {

	void add(SellerOrder sellerOrder);
	void modify(SellerOrder sellerOrder);
	SellerOrder getOne(String id);
	Map<String, SellerOrder> getAll();
	void remove(String id);

}
