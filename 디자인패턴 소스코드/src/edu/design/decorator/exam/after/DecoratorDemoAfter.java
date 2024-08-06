package edu.design.decorator.exam.after;

public class DecoratorDemoAfter {
	public static void main(String[] args) {
		Person hong = new Person(70);
		Monster fDracula = new FireMonster(new Dracula());
		Monster aDracula = new ArrowMonster(new Dracula());
		Monster faDracula = new FireMonster(new ArrowMonster(new Dracula()));

		System.out.println("<불을 뿜는 드라큘라의 공격> ");
		fDracula.attack(hong);

		System.out.println("\n<화살을 던지는 드라큘라의 공격>");
		aDracula.attack(hong);

		System.out.println("\n<불을 뿜고 화살을 던지는 드라큘라의 공격>");
		faDracula.attack(hong);

		System.out.println();

		if (hong.isAlive()) {
			System.out.println("사람의 현재 에너지 : " + hong.getEnergy());
		} else {
			System.out.println("사람은 죽었다.");
		}
	}
}

// 확장성을 고려한 추상클래
abstract class Monster {
	public void attack(Person p) {
		if (isAttackable(p))
			doInjuryTo(p);
	}

	abstract protected boolean isAttackable(Person p);

	abstract protected void doInjuryTo(Person p);

}

// 장식 대상이 되는 핵심 클래스
class Dracula extends Monster {
	protected boolean isAttackable(Person p) {
		boolean attackable = false;
		if (p.getEnergy() < 100) {// 100보다 작으면 공격
			attackable = true;
		}
		return attackable;
	}

	protected void doInjuryTo(Person p) {
		p.getInjured(10);
	}
}

// 장식 기능의 최상의 부모클래스
class MonsterDecorator extends Monster {
	protected Monster monster;

	public MonsterDecorator(Monster monster) {
		this.monster = monster;
	}

	public void attack(Person p) {
		monster.attack(p);
	}

	protected boolean isAttackable(Person p) {
		return true;
	}

	protected void doInjuryTo(Person p) {
	}
}

class FireMonster extends MonsterDecorator {
	public FireMonster(Monster monster) {
		super(monster);
	}

	public void attack(Person p) {
		super.attack(p);
		shootFire();
	}

	public void shootFire() {
		System.out.println("불을 내뿜는 효과음을 낸다.");
	}
}

class ArrowMonster extends MonsterDecorator {
	public ArrowMonster(Monster monster) {
		super(monster);
	}

	public void attack(Person p) {
		super.attack(p);
		shootArrow();
	}

	public void shootArrow() {
		System.out.println("화살을 쏘는 효과음을 낸다.");
	}
}

class Person {
	private int energy;

	public Person() {
		this(100);
	}

	public Person(int energy) {
		this.energy = energy;
	}

	public void getInjured(int injuryLevel) {
		energy -= injuryLevel;
	}

	public boolean isAlive() {
		return (energy > 0); // 에너지가 0보다 크면 살아 있는 것
	}

	public int getEnergy() {
		return energy;
	}
}