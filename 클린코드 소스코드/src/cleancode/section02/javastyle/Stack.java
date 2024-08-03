package cleancode.section02.javastyle;

public class Stack {
	private int size;
	private Object[] items; 
	private int top = -1; 

	public Stack() {
		size = 10;
		items = new Object[size];
	}
	
	public Stack(int size) {
		size = 10;
		items = new Object[size];
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean isFull() {
		return (top >= size);
	}

	public boolean push(Object newItem) {
		if (isFull())
			return false;
		else {
			top++;
			items[top] = newItem;
			return true;
		}
	}

	public Object pop() {
		if (isEmpty())
			return null;
		else
			return items[top--];
	}

	public Object top() {
		if (isEmpty())
			return null;
		else
			return items[top];
	}

	public void printStack() {
		if (isEmpty())
			System.out.println("스택이 비어있음\n");
		else {
			System.out.println("스택에 저장된 데이터\n--------------");
			for (int i = top; i >= 0; i--)
				System.out.println(items[i]);
			System.out.println(" ");
		}
	}

}
