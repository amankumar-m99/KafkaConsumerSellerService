package indeedcoder.kafkaconsumersellerservice.repository;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import indeedcoder.kafkaconsumersellerservice.entity.SellerOrder;
import jakarta.annotation.Resource;

@Repository
public class SellerOrderRepositoryImpl implements SellerOrderRepository {

	private static final String KEY = "SELLERORDER";

	@Resource(name = "getRedisTemplate") //tells Spring to inject the bean by this name.
	private HashOperations<String, String, SellerOrder> hashOperations;
	//<ref type, key type, value type>

	@Override
	public void add(SellerOrder sellerOrder) {
		hashOperations.putIfAbsent(KEY, sellerOrder.getId(), sellerOrder);
	}

	@Override
	public void modify(SellerOrder sellerOrder) {
		hashOperations.put(KEY, sellerOrder.getId(), sellerOrder);
	}

	@Override
	public SellerOrder getOne(String id) {
		return hashOperations.get(KEY, id);
	}

	@Override
	public Map<String, SellerOrder> getAll() {
		return hashOperations.entries(KEY);
	}

	@Override
	public void remove(String id) {
		hashOperations.delete(KEY, id);
	}

}
