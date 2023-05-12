package com.in28minutes.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private Long id;
	private String from;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;
	private String to;

	public CurrencyConversionBean() {
	}

	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	public BigDecimal getConversionMultiple() {
		return this.conversionMultiple;
	}

	public Long getId() {
		return this.id;
	}

	public int getPort() {
		return this.port;
	}
	
	public String getFrom() {
		return this.from;
	}
	
	public String getTo() {
		return this.to;
	}
	
	public BigDecimal getQuanity() {
		return this.quantity;
	}
	
	public BigDecimal getTotalCalculatedAmount() {
		return this.totalCalculatedAmount;
	}

}
