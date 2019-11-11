package com.bims.sb;

import org.springframework.stereotype.Repository;

@Repository
public class CarRepository {
	
 public Car getCar() {
	 
	 String quote="";
	 
	 Car car = new Car("Audi", "TT", quote);
	 
	 return car;
	 
	 
 }

}
