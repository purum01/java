package cleancode.section02.cstyle;

class StackFunction {
	public boolean isEmpty(Stack stack) {
		return (stack.top < 0);
	}

	public boolean isFull(Stack stack) {
		return (stack.top == stack.size);
	}

	public boolean push(Stack stack, Object newItem) {
		if (isFull(stack))
			return false;
		else {
			int newTop = stack.top + 1;
			stack.top = newTop;
			stack.setItem(newTop, newItem);
			return true;
		}
	}

	public Object pop(Stack stack) {
		if (isEmpty(stack))
			return null;
		else {
			int currentTop = stack.top;
			Object item = stack.getItem(currentTop);
			stack.top = currentTop - 1;
			return item;
		}
	}

	public Object top(Stack stack) {
		if (isEmpty(stack))
			return null;
		else
			return stack.getItem(stack.top);
	}

	public void printStack(Stack stack) {
		if (isEmpty(stack))
			System.out.println("스택이 비어있음\n");
		else {
			System.out.println("스택에 저장된 데이터\n--------------");
			for (int i = stack.top; i >= 0; i--)
				System.out.println(stack.getItem(i));
			System.out.println(" ");
		}
	}
}
