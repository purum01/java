package edu.design.abstractfactory.test2;

//AbstractProductA interface
interface AbstractProductA {
	void doSomething();
}

//AbstractProductB interface
interface AbstractProductB {
	void doSomething();
}

//ConcreteProductA1 class
class ConcreteProductA1 implements AbstractProductA {
	@Override
	public void doSomething() {
		System.out.println("ProductA1 doing something");
	}
}

//ConcreteProductB1 class
class ConcreteProductB1 implements AbstractProductB {
	@Override
	public void doSomething() {
		System.out.println("ProductB1 doing something");
	}
}

//AbstractFactory interface
interface AbstractFactory {
	AbstractProductA createProductA();

	AbstractProductB createProductB();
}

//ConcreteFactory1 class
class ConcreteFactory1 implements AbstractFactory {
	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}
}

//Client code
public class AbstractFactoryDemo {
	private AbstractProductA productA;
	private AbstractProductB productB;

	public AbstractFactoryDemo(AbstractFactory factory) {
		productA = factory.createProductA();
		productB = factory.createProductB();
	}

	public void run() {
		productA.doSomething();
		productB.doSomething();
	}

	public static void main(String[] args) {
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactoryDemo client1 = new AbstractFactoryDemo(factory1);
		client1.run(); // Output: ProductA1 doing something, ProductB1 doing something
	}
}
