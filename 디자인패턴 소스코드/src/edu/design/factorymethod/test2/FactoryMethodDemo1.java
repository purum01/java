package edu.design.factorymethod.test2;

//Product interface
interface Product {
	void use();
}

//ConcreteProduct class
class ConcreteProductA implements Product {
	@Override
	public void use() {
		System.out.println("Using ConcreteProductA");
	}
}

//Another ConcreteProduct class
class ConcreteProductB implements Product {
	@Override
	public void use() {
		System.out.println("Using ConcreteProductB");
	}
}

//Creator abstract class
abstract class Creator {
	// Factory Method
	public abstract Product factoryMethod();

	// Other operations that use the Product
	public void someOperation() {
		Product product = factoryMethod();
		product.use();
	}
}

//ConcreteCreator class
class ConcreteCreatorA extends Creator {
	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}

//Another ConcreteCreator class
class ConcreteCreatorB extends Creator {
	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}

//Client code
public class FactoryMethodDemo1 {
	public static void main(String[] args) {
		Creator creatorA = new ConcreteCreatorA();
		creatorA.someOperation(); // Output: Using ConcreteProductA

		Creator creatorB = new ConcreteCreatorB();
		creatorB.someOperation(); // Output: Using ConcreteProductB
	}
}
