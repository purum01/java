package cleancode.section02.cstyle;

public class StackClient {
	public static void main(String args[]) {

		System.out.println("Start Stack");
		Stack stackData = new Stack(); // 스택 객체를 생성한다.
		StackFunction stackFunction = new StackFunction(); // 스택에 적용될 함수를 상징하는
													// 객체를 생성한다.

		stackFunction.printStack(stackData);

		String one = new String("1");
		System.out.print("push: ");
		if (stackFunction.push(stackData, one)) // '1'을 푸쉬한다.
			System.out.println(one);
		else
			System.out.println("Insert Failed");
		stackFunction.printStack(stackData);

		String two = new String("2");
		System.out.print("push: ");
		if (stackFunction.push(stackData, two)) // '2'를 푸쉬한다.
			System.out.println(two);
		else
			System.out.println("Insert Failed");
		stackFunction.printStack(stackData);

		Object result;

		System.out.print("pop: ");
		result = stackFunction.pop(stackData); // '2'를 팝업한다.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		stackFunction.printStack(stackData);

		System.out.print("pop: ");
		result = stackFunction.pop(stackData); // '1'을 팝업한다.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		stackFunction.printStack(stackData);

		System.out.print("pop: ");
		result = stackFunction.pop(stackData); // 더 이상 팝업할 수 없다.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		stackFunction.printStack(stackData);
	}
}
