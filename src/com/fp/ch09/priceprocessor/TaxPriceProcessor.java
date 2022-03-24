package com.fp.ch09.priceprocessor;

import java.math.BigDecimal;
import java.util.function.Function;

import com.fp.ch09.model.Order;

public class TaxPriceProcessor implements Function<Order, Order>{

	private final BigDecimal taxRate;
	
	public TaxPriceProcessor(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	
	@Override
	public Order apply(Order order) {
		return order.setAmount(order.getAmount()
				.multiply(taxRate.divide(new BigDecimal(100)).add(BigDecimal.ONE)));
	}

}
