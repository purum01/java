package edu.design.decorator.exam.before;

public class DecoratorDemoBefore {
	public static void main(String[] args) {
		Person hong = new Person(70);		
		Monster fDracula = new FireDracula();
		Monster aDracula = new ArrowDracula();
		Monster faDracula = new FireAndArrowDracula();	
		
		System.out.println("<불을 뿜는 드라큘라의 공격> ");
		fDracula.attack(hong);		
		
		System.out.println("\n<화살을 던지는 드라큘라의 공격>");
		aDracula.attack(hong);	
		
		System.out.println("\n<불을 뿜고 화살을 던지는 드라큘라의 공격>");
		faDracula.attack(hong);
		
		System.out.println();		
		if (hong.isAlive()){
			System.out.println("사람의 현재 에너지 : " + hong.getEnergy());
		}else{
			System.out.println("사람 죽었다.");
		}
	}
}
// 확장성을 고려한 추상클래스 
abstract class Monster {		
	public void attack(Person p) {
		if (isAttackable(p)){
			doInjuryTo(p);	
		}
		soundEffect();		
	}		
	abstract protected void soundEffect();
	abstract protected boolean isAttackable(Person p);
	abstract protected void doInjuryTo(Person p);	
}

class Dracula extends Monster {	
	protected void soundEffect() { 
		// 아무 소리도 내지 않는다.		
	}	
	protected boolean isAttackable(Person p) {		
		boolean attackable = false;		
		if (p.getEnergy() < 100) // 100보다 작으면 공격 
			attackable = true;		
		return attackable;		
	}	
	protected void doInjuryTo(Person p) {
		p.getInjured(10);		
	}	
}

class FireDracula extends Dracula {		
	public void soundEffect() {
		System.out.println("불을 내뿜는 효과음을 낸다.");
	}	
}

class ArrowDracula extends Dracula {		
	public void soundEffect() {
		System.out.println("화살을 쏘는 효과음을 낸다.");
	}	
}

class FireAndArrowDracula extends Dracula {		
	public void soundEffect() {
		System.out.println("불을 내뿜는 효과음을 낸다.");
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