package refactoring.lab01.two;

/* Form Template Method */

public class PrinterExample {

	public static void main(String[] args) {

		InkjetPrinter iPrinter = new InkjetPrinter("101");
		DotPrinter dPrinter = new DotPrinter("102");
		LaserPrinter lPrinter = new LaserPrinter("103");
		PDFWriter pWriter = new PDFWriter("Test.pdf");

		iPrinter.print("환영합니다. 프린터를 테스트중입니다.");
		dPrinter.print("환영합니다. 프린터를 테스트중입니다.");
		lPrinter.print("환영합니다. 프린터를 테스트중입니다.");
		pWriter.print("환영합니다. 프린터를 테스트중입니다.");
	}
}

abstract class Printer {
	private String ID;

	public Printer(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	abstract public void print(Object msg);

	public void testPrinting() {
		print("아아~ 프린트 테스트. 프린트 테스트");
	}
}

class InkjetPrinter extends Printer {
	private double inkCapacity;
	private double inkReductionRate;

	public InkjetPrinter(String ID) {
		super(ID);
		inkCapacity = 100;
		inkReductionRate = 0.5;
	}

	public void print(Object msg) {
		if (isPrintable()) {
			System.out.println("*잉크젯 방식으로 프린트를 시작합니다.*");
			System.out.println(msg.toString());
			System.out.println("*잉크젯 방식으로 프린트를 종료합니다.*");

			inkCapacity -= inkReductionRate;
		} else
			alert();
	}

	public void alert() {
		System.out.println("잉크가 부족합니다. 빨간 램프를 깜박깜박~ ");
	}

	public boolean isPrintable() { // 한장을 찍을 분량이 남아있으면,
		return (inkCapacity - inkReductionRate) >= 0;
	}
}

class DotPrinter extends Printer {

	public DotPrinter(String ID) {
		super(ID);
	}

	public void print(Object msg) {
		if (isPrintable()) {
			System.out.println("*도트 방식으로 프린트를 시작합니다.*");
			System.out.println(msg.toString());
			System.out.println("*도트 방식으로 프린트를 종료합니다.*");
		}
	}

	public boolean isPrintable() {
		return true;
	}
}

class LaserPrinter extends Printer {
	private double tonerCapacity;
	private double tonerReductionRate;

	public LaserPrinter(String ID) {
		super(ID);
		tonerCapacity = 100;
		tonerReductionRate = 0.2;
	}

	public void print(Object msg) {
		if (isPrintable()) {
			System.out.println("*레이저 방식으로 프린트를 시작합니다.*");
			System.out.println(msg.toString());
			System.out.println("*레이저 방식으로 프린트를 종료합니다.*");

			tonerCapacity -= tonerReductionRate;
		} else
			alert();
	}

	public void alert() {
		System.out.println("토너가 부족합니다. 노란 램프를 깜박깜박~ ");
	}

	public boolean isPrintable() { // 한장을 찍을 분량이 남아있으면,
		return (tonerCapacity - tonerReductionRate) >= 0;
	}
}

class PDFWriter {
	private String fileName; // PDF 문서 파일 이름

	public PDFWriter(String fileName) {
		this.fileName = fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void print(Object document) {
		System.out.println("*문서내용을 " + fileName + " 파일에 PDF 포맷으로 출력하기 시작합니다.*");
		System.out.println(document);
		System.out.println("*문서내용을 PDF 포맷으로 출력을 완료했습니다.");
	}
}
