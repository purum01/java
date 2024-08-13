package edu.design.factorymethod.exam.after;

import java.util.Vector;
import java.util.Enumeration;

public class FactoryMethodDemoAfter {

	public static void main(String[] args) {
		StageGame[] stageGames = new StageGame[2];
		stageGames[0] = new SnowStageGame();
		stageGames[1] = new SpaceStageGame();

		for (int i = 0; i < stageGames.length; i++) {
			Stage eachStage = stageGames[i].createStage();
			// 화면에 스테이지의 게임 컴포넌트들을 그린다..
			Enumeration<StageComponent> components = eachStage.getStageComponents();
			while (components.hasMoreElements()) {
				StageComponent component = components.nextElement();
				component.draw();
			}
			System.out.println();
		}
	}
}

// 각 스테이지의 초기 화면의 각종 게임 컴포넌트들을 생성하는 클래스로서
// 실제 객체생성은 하위클래스에서 담당한다.
abstract class StageGame {
	// 벙커가 2개, 자동차가 2대, 나무 1그루씩 배치한다.
	// final로 만들어서 overriding하지 못하게 하는 것도 중요하다.
	public Stage createStage() {
		Stage stage = new Stage();
		// 나무 1그루 배치한다. 
		Tree tree = makeTree();
		tree.setX(50);
		tree.setY(50);
		stage.addStageComponent(tree);
		// 자동차 2대를 포함한다. 
		Car car = makeCar();
		car.setX(10);
		car.setY(10);
		stage.addStageComponent(car);
		car = makeCar();
		car.setX(10);
		car.setY(20);
		stage.addStageComponent(car);
		// 벙커 2대를 포함한다. 
		Bunker bunker = makeBunker();
		bunker.setX(60);
		bunker.setY(30);
		stage.addStageComponent(bunker);
		bunker = makeBunker();
		bunker.setX(60);
		bunker.setY(40);
		stage.addStageComponent(bunker);

		return stage;
	}
	// 3개의 팩토리 메소드
	abstract public Tree makeTree();
	abstract public Car makeCar();
	abstract public Bunker makeBunker();
}

class SnowStageGame extends StageGame {
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

class SpaceStageGame extends StageGame {
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

// 화면을 구성하는 게임 컴포넌트들
abstract class StageComponent {
	int x, y; // 화면의 좌표
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
	// 속성의 in x, int y값에 자신을 그린다. 
	abstract public void draw();
}

abstract class Tree extends StageComponent {
}

// 눈싸움 스테이지에 나타나는 나무들을  상징한다.
class SnowTree extends Tree {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 눈 나무의 모습");
	}
}

// 우주전사 싸움 스테이지에 나타나는 나무들을  상징한다.
class SpaceTree extends Tree {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 우주 나무의 모습");
	}
}

// 스테이지에 나타나는 자동차들을  상징한다.
abstract class Car extends StageComponent {
}

// 눈싸움 스테이지에 나타나는 자동차들을  상징한다.
class SnowCar extends Car {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 눈자동차의 모습");
	}
}

// 우주전사 싸움 스테이지에 나타나는 자동차들을  상징한다.
class SpaceCar extends Car {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 우주 자동차의 모습");
	}
}

// 스테이지에 나타나는 벙커들을 상징한다.
abstract class Bunker extends StageComponent {
}

// 눈싸움 스테이지에 나타나는 눈벙커를 상징한다.
class SnowBunker extends Bunker {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 눈벙커의 모습");
	}
}

// 우주전사 싸움 스테이지에 나타나는 우주벙커를 상징한다.
class SpaceBunker extends Bunker {
	public void draw() {
		System.out.println("(" + x + "," + y + ")에 있는 우주벙커의 모습");
	}
}
