package edu.design.decorator.test2;

abstract class Window {
	protected int width, height;
	public abstract int getWidth();
	public abstract int getHeight();
	public abstract String getText(int row);

	public final void draw() {
		for (int i = 1; i <= getHeight(); i++) {
			System.out.println(getText(i));
		}
	}
}

class StarWindow extends Window {
	public String str = "*";

	public StarWindow(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getText(int row) {
		if (row == 1)
			return makeLine();
		else if (row == getHeight())
			return makeLine();
		else
			return makeSpaceLine();
	}

	private String makeSpaceLine() {
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		for (int i = 0; i < getWidth() - 2; i++) {
			sb.append(" ");
		}
		sb.append(str);
		return sb.toString();
	}

	private String makeLine() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < getWidth(); i++) {
			sb.append(str);
		}
		return sb.toString();
	}
}

class VerticalSharpWindow extends Window {
	private String str = "#";
	private Window window;

	public VerticalSharpWindow(Window window) {
		this.window = window;
	}

	public int getWidth() {
		return window.getWidth();
	}

	public int getHeight() {
		return window.getHeight() + 2;
	}

	public String getText(int row) {
		if (row == 1)
			return makeShapLine();
		else if (row == getHeight())
			return makeShapLine();
		else
			return window.getText(row - 1);
	}

	private String makeShapLine() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < getWidth(); i++) {
			sb.append(str);
		}
		return sb.toString();
	}
}

class HorizontalMinusWindow extends Window {
	private String str = "-";
	private Window window;

	public HorizontalMinusWindow(Window window) {
		this.window = window;
	}

	public int getWidth() {
		return window.getWidth() + 2;
	}

	public int getHeight() {
		return window.getHeight();
	}

	public String getText(int row) {
		return str + window.getText(row) + str;
	}
}

public class DecoratorTest {
	public static void main(String args[]) {
		StarWindow sw = new StarWindow(10, 5);
		sw.draw();
		System.out.println("");
		System.out.println("");

		VerticalSharpWindow vsw = new VerticalSharpWindow(sw);
		vsw.draw();
		System.out.println("");
		System.out.println("");

		HorizontalMinusWindow hmw = new HorizontalMinusWindow(vsw);
		hmw.draw();
	}
}
