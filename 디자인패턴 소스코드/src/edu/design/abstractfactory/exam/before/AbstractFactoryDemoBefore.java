package edu.design.abstractfactory.exam.before;

import java.util.Vector;
import java.util.Enumeration;

public class AbstractFactoryDemoBefore {

	public static void main(String[] args) {
		Stage[] stages = new Stage[2];
		stages[0] = createSnowStage();
		stages[1] = createSpaceStage();
		for (int i = 0; i < stages.length; i++) {
			// 화면에 스테이지의 게임 컴포넌트들을 그린다.
			Enumeration<StageComponent> components = stages[i].getStageComponents();
			while (components.hasMoreElements()) {
				StageComponent component = (StageComponent) components.nextElement();
				component.draw();
			}
			System.out.println();
		}
	}

	static Stage createSnowStage() {
		Stage stage = new Stage();

		Tree tree = new SnowTree();
		tree.setX(50);
		tree.setY(50);
		stage.addStageComponent(tree);

		Car car = new SnowCar();
		car.setX(10);
		car.setY(10);
		stage.addStageComponent(car);
		car = new SnowCar();
		car.setX(10);
		car.setY(20);
		stage.addStageComponent(car);

		Bunker bunker = new SnowBunker();
		bunker.setX(60);
		bunker.setY(30);
		stage.addStageComponent(bunker);
		bunker = new SnowBunker();
		bunker.setX(60);
		bunker.setY(40);
		stage.addStageComponent(bunker);

		return stage;
	}

	static Stage createSpaceStage() {
		Stage stage = new Stage();

		Tree tree = new SpaceTree();
		tree.setX(50);
		tree.setY(50);
		stage.addStageComponent(tree);

		Car car = new SpaceCar();
		car.setX(10);
		car.setY(10);
		stage.addStageComponent(car);
		car = new SpaceCar();
		car.setX(10);
		car.setY(20);
		stage.addStageComponent(car);

		Bunker bunker = new SpaceBunker();
		bunker.setX(60);
		bunker.setY(30);
		stage.addStageComponent(bunker);
		bunker = new SpaceBunker();
		bunker.setX(60);
		bunker.setY(40);
		stage.addStageComponent(bunker);

		return stage;
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
		System.out.println("(" + x + "," + y + ")에 있는 눈 나무의 모습");
	}
}

class SpaceTree extends Tree {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 우주 나무의 모습");
	}
}

abstract class Car extends StageComponent {
}

class SnowCar extends Car {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 눈자동차의 모습");
	}
}

class SpaceCar extends Car {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 우주 자동차의 모습");
	}
}

abstract class Bunker extends StageComponent {
}

class SnowBunker extends Bunker {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 눈벙커의 모습");
	}
}

class SpaceBunker extends Bunker {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 우주벙커의 모습");
	}
}