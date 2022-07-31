package com.github.andrielson.decorator.coffeeShop.model.decorators;

import com.github.andrielson.decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator {
	
	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		System.out.println("- Adding 30ml of Milk");
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.5d;
	}

}