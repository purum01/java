package cleancode.section02.cstyle;

public class Stack {
	int size; 
	Object[] items; 
	int top = -1; 

	public Stack() {
		size = 10;
		items = new Object[size];
	}

	public Stack(int size) {
		this.size = size;
		items = new Object[size];
	}

	public void setItem(int index, Object item) {
		items[index] = item;
	}

	public Object getItem(int index) {
		return items[index];
	}
}

