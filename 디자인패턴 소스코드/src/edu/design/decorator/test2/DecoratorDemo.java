package edu.design.decorator.test2;

interface Coffee {
	String getDescription();

	double getCost();
}

class SimpleCoffee implements Coffee {
	@Override
	public String getDescription() {
		return "Simple coffee";
	}

	@Override
	public double getCost() {
		return 2.0;
	}
}

abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}
}

class MilkDecorator extends CoffeeDecorator {
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", milk";
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost() + 0.5;
	}
}

class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", sugar";
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost() + 0.2;
	}
}

public class DecoratorDemo {
	public static void main(String[] args) {
		Coffee myCoffee = new SimpleCoffee();
		System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

		myCoffee = new MilkDecorator(myCoffee);
		System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

		myCoffee = new SugarDecorator(myCoffee);
		System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());
	}
}
