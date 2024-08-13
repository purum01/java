package edu.design.factorymethod.test2;

//Animal.java
abstract class Animal {
	public abstract void makeSound();
}

//Dog.java
class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Woof");
	}
}

//Cat.java
class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}

//PetStore.java
abstract class PetStore {
	public abstract Animal createAnimal();

	public void orderAnimal() {
		Animal animal = createAnimal();
		animal.makeSound();
	}
}

//DogStore.java
class DogStore extends PetStore {
	@Override
	public Animal createAnimal() {
		return new Dog();
	}
}

//CatStore.java
class CatStore extends PetStore {
	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}

//Main.java
public class FactoryMethodDemo2 {
	public static void main(String[] args) {
		PetStore dogStore = new DogStore();
		dogStore.orderAnimal(); // Output: Woof

		PetStore catStore = new CatStore();
		catStore.orderAnimal(); // Output: Meow
	}
}
