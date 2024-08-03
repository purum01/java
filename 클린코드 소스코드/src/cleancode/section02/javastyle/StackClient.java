package cleancode.section02.javastyle;

public class StackClient {

	public static void main(String args[]) {

		System.out.println("Start Stack");
		Stack example = new Stack(); // 스택을 생성하고 초기화한다.
		example.printStack();

		String one = new String("1");
		System.out.print("push: ");
		if (example.push(one)) // '1'을 푸쉬한다.
			System.out.println(one);
		else
			System.out.println("Insert Failed");
		example.printStack();

		String two = new String("2");
		System.out.print("push: "); // '2'를 푸쉬한다.
		if (example.push(two))
			System.out.println(two);
		else
			System.out.println("Insert Failed");
		example.printStack();

		Object result;

		System.out.print("pop: ");
		result = example.pop(); // '2'를 팝업한다.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.printStack();

		System.out.print("pop: ");
		result = example.pop(); // '1'을 팝업한다.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.printStack();

		System.out.print("pop: ");
		result = example.pop(); // 더 이상 팝업할 수 없다.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.printStack();
	}
}
