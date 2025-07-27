package indeedcoder.kafkaconsumersellerservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import indeedcoder.kafkaconsumersellerservice.entity.SellerOrder;

@Configuration
public class AppConfig {

	@Bean
	public RedisConnectionFactory getRedisConnectionFactory() {
		return new LettuceConnectionFactory();
	}

	@Bean
	public RedisTemplate<String, SellerOrder> getRedisTemplate(){
		RedisTemplate<String, SellerOrder> template = new RedisTemplate<>();
		template.setConnectionFactory(getRedisConnectionFactory());
		return template;
	}
}
