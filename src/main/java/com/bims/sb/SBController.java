package com.bims.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carservice")
public class SBController {

	@Autowired
	private CarRepository carRepo;

	@Autowired
	private PriceProxy priceProxy;

	@RequestMapping("/car")
	public Car getMsg() {
		Car car = carRepo.getCar();

		String quote = priceProxy.getQuote();

		car.setQuote(quote);

		return car;

	}

}
