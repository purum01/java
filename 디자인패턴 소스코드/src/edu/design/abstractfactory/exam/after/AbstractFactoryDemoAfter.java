package edu.design.abstractfactory.exam.after;

import java.util.Enumeration;
import java.util.Vector;

public class AbstractFactoryDemoAfter {

	public static void main(String[] args) {
		StageFactory[] stageFactories = new StageFactory[2];
		stageFactories[0] = new SnowStageFactory();
		stageFactories[1] = new SpaceStageFactory();

		for (int i = 0; i < stageFactories.length; i++) {
			Stage eachStage = createStage(stageFactories[i]);
			Enumeration<StageComponent> components = eachStage.getStageComponents();
			while (components.hasMoreElements()) {
				StageComponent component =
					(StageComponent) components.nextElement();
				component.draw();
			}
			System.out.println();
		}
	}

	static Stage createStage(StageFactory factory) {
		Stage stage = new Stage();

		Tree tree = factory.makeTree();
		tree.setX(50);
		tree.setY(50);
		stage.addStageComponent(tree);

		Car car = factory.makeCar();
		car.setX(10);
		car.setY(10);
		stage.addStageComponent(car);

		car = factory.makeCar();
		car.setX(10);
		car.setY(20);
		stage.addStageComponent(car);

		Bunker bunker = factory.makeBunker();
		bunker.setX(60);
		bunker.setY(30);
		stage.addStageComponent(bunker);

		bunker = factory.makeBunker();
		bunker.setX(60);
		bunker.setY(40);
		stage.addStageComponent(bunker);

		return stage;
	}
}

abstract class StageFactory {
	abstract public Tree makeTree();
	abstract public Car makeCar();
	abstract public Bunker makeBunker();
}

class SnowStageFactory extends StageFactory {
	public Tree makeTree() {
		return new SnowTree();
	}

	public Car makeCar() {
		return new SnowCar();
	}

	public Bunker makeBunker() {
		return new SnowBunker();
	}
}

class SpaceStageFactory extends StageFactory {
	public Tree makeTree() {
		return new SpaceTree();
	}

	public Car makeCar() {
		return new SpaceCar();
	}

	public Bunker makeBunker() {
		return new SpaceBunker();
	}
}

class Stage {
	Vector<StageComponent> stageComponents;
	public Stage() {
		stageComponents = new Vector<StageComponent>();
	}

	public void addStageComponent(StageComponent stageComponent) {
		stageComponents.addElement(stageComponent);
	}

	public Enumeration<StageComponent> getStageComponents() {
		return stageComponents.elements();
	}
}

abstract class StageComponent {
	int x, y;
	StageComponent() {
		x = y = 0;
	}
	StageComponent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	abstract public void draw();
}

abstract class Tree extends StageComponent {
}

class SnowTree extends Tree {
	public void draw() {
		System.out.println("(" + x + "," + y + ")�� �ִ� �� ������ ���");
	}
}

class SpaceTree extends Tree {
	public void draw() {
		System.out.println("(" + x + "," + y + ")�� �ִ� ���� ������ ���");
	}
}

abstract class Car extends StageComponent {
}

class SnowCar extends Car {
	public void draw() {
		System.out.println("(" + x + "," + y + ")�� �ִ� ���ڵ����� ���");
	}
}

class SpaceCar extends Car {
	public void draw() {
		System.out.println("(" + x + "," + y + ")�� �ִ� ���� �ڵ����� ���");
	}
}

abstract class Bunker extends StageComponent {
}

class SnowBunker extends Bunker {
	public void draw() {
		System.out.println("(" + x + "," + y + ")�� �ִ� ����Ŀ�� ���");
	}
}

class SpaceBunker extends Bunker {
	public void draw() {
		System.out.println("(" + x + "," + y + ")�� �ִ� ���ֺ�Ŀ�� ���");
	}
}

