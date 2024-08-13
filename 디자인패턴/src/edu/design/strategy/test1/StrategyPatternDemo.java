package edu.design.strategy.test1;

interface Strategy {
	void execute();
}

class ConcreteStrategyA implements Strategy {
	@Override
	public void execute() {
		System.out.println("ConcreteStrategyA 실행");
	}
}

class ConcreteStrategyB implements Strategy {
	@Override
	public void execute() {
		System.out.println("ConcreteStrategyB 실행");
	}
}

class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy() {
		strategy.execute();
	}
}

public class StrategyPatternDemo {
	public static void main(String[] args) {
		// 초기 전략을 설정한다.
		Context context = new Context(new ConcreteStrategyA());
		context.executeStrategy(); // Output: ConcreteStrategyA 실행

		// 전략을 동적으로 변경한다.
		context.setStrategy(new ConcreteStrategyB());
		context.executeStrategy(); // Output: ConcreteStrategyB 실행
	}
}
