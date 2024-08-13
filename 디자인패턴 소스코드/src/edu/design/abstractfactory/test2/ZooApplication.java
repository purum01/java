package edu.design.abstractfactory.test2;

//ZooApplication.java

abstract class LandAnimal {
	public abstract void makeSound();
}

abstract class SeaAnimal {
	public abstract void makeSound();
}

class Dog extends LandAnimal {
	@Override
	public void makeSound() {
		System.out.println("Woof");
	}
}

class Cat extends LandAnimal {
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}

class Whale extends SeaAnimal {
	@Override
	public void makeSound() {
		System.out.println("Whooosh");
	}
}

class Dolphin extends SeaAnimal {
	@Override
	public void makeSound() {
		System.out.println("Eeeeee");
	}
}

abstract class AnimalFactory {
	public abstract LandAnimal createLandAnimal();

	public abstract SeaAnimal createSeaAnimal();
}

class LandAnimalFactory extends AnimalFactory {
	@Override
	public LandAnimal createLandAnimal() {
		return new Dog(); // or return new Cat(); depending on the requirement
	}

	@Override
	public SeaAnimal createSeaAnimal() {
		// Returning null as this factory doesn't create sea animals
		return null;
	}
}

class SeaAnimalFactory extends AnimalFactory {
	@Override
	public LandAnimal createLandAnimal() {
		// Returning null as this factory doesn't create land animals
		return null;
	}

	@Override
	public SeaAnimal createSeaAnimal() {
		return new Whale(); // or return new Dolphin(); depending on the requirement
	}
}

public class ZooApplication {
	private LandAnimal landAnimal;
	private SeaAnimal seaAnimal;

	public ZooApplication(AnimalFactory factory) {
		this.landAnimal = factory.createLandAnimal();
		this.seaAnimal = factory.createSeaAnimal();
	}

	public void makeSounds() {
		if (landAnimal != null) {
			landAnimal.makeSound();
		}
		if (seaAnimal != null) {
			seaAnimal.makeSound();
		}
	}

	public static void main(String[] args) {
		AnimalFactory landFactory = new LandAnimalFactory();
		ZooApplication landZoo = new ZooApplication(landFactory);
		landZoo.makeSounds(); // Output: Woof

		AnimalFactory seaFactory = new SeaAnimalFactory();
		ZooApplication seaZoo = new ZooApplication(seaFactory);
		seaZoo.makeSounds(); // Output: Whooosh
	}
}
