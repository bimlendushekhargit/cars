package com.bims.sb;

public class Car {

	private String make;
	private String model;
	private String quote;

	public Car(String make, String model, String quote) {
		super();
		this.make = make;
		this.model = model;
		this.quote = quote;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}
