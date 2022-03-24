package com.fp.ch09.priceprocessor;

import java.math.BigDecimal;
import java.util.function.Function;

import com.fp.ch09.model.Order;
import com.fp.ch09.model.OrderLine;

public class OrderLineAggregationPriceProcessor implements Function<Order, Order> {

	@Override
	public Order apply(Order order) {
		return order.setAmount(order.getOrderLines().stream()
				.map(OrderLine::getAmount)
				.reduce(BigDecimal.ZERO, BigDecimal::add));
	}

}
