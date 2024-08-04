package refactoring.lab01.five;

/* Inline Method, Replace Constructor with Factory Method */
public class PrinterExample {

	public static void main(String[] args) {

		InkjetPrinter iPrinter = new InkjetPrinter("101");
		DotPrinter dPrinter = new DotPrinter("102");
		LaserPrinter lPrinter = new LaserPrinter("103");
		PDFWriter pWriter = new PDFWriter("Test.pdf");

		printWelcome(iPrinter);
		printWelcome(dPrinter);
		printWelcome(lPrinter);
		printWelcome(pWriter);		
	}
	
	public static void printWelcome(Printable printableObject) {
		printableObject.print("환영합니다. 프린터를 테스트중입니다.");
		System.out.println("");
	}	
}

interface Printable {
	public void print(Object msg);
}

abstract class Printer implements Printable {
	private String ID;

	public Printer(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void print(Object msg) {
		 if ( isPrintable() ) {
			printing(msg);		
		} else 
			alert();			
	}
	
	abstract public void printing(Object msg);	
	abstract public boolean isPrintable();
	abstract public void alert();	
	
	public void testPrinting() {
		print("아아~ 프린트 테스트. 프린트 테스트");												 
	}			
	
}

class InkjetPrinter extends Printer {
	private PrintCartridge cartridge;
	
	public InkjetPrinter(String ID) {
		super(ID);
		cartridge = new PrintCartridge(100, 0.5);	
	}

	public void printing(Object msg) {
		System.out.println("*잉크젯 방식으로 프린트를 시작합니다.*");
		System.out.println(msg.toString());
		System.out.println("*잉크젯 방식으로 프린트를 종료합니다.*");	
			
		cartridge.consume();															
	}
	
	public void alert() {
		System.out.println("잉크가 부족합니다. 빨간 램프를 깜박깜박~ ");
	}
	
	public boolean isPrintable() { // 한장을 찍을 분량이 남아있으면,
		return cartridge.isAvailable();
	}	
}

class DotPrinter extends Printer {
	
	public DotPrinter(String ID) {
		super(ID);
	}	
	
	public void printing(Object msg) {
		System.out.println("*도트 방식으로 프린트를 시작합니다.*");
		System.out.println(msg.toString());
		System.out.println("*도트 방식으로 프린트를 종료합니다.*");								 				
	}
	
	public void alert() {}
		
	public boolean isPrintable() { 
		return true;		
	}
}

class LaserPrinter extends Printer {
	private PrintCartridge cartridge;
		
	public LaserPrinter(String ID) {
		super(ID);
		cartridge = new PrintCartridge(100, 0.2);		
	}	
	
	public void printing(Object msg) {
		System.out.println("*레이저 방식으로 프린트를 시작합니다.*");
		System.out.println(msg.toString());
		System.out.println("*레이저 방식으로 프린트를 종료합니다.*");	
			
		cartridge.consume();								
	}
	
	public void alert() {
		System.out.println("토너가 부족합니다. 노란 램프를 깜박깜박~ ");
	}
	
	public boolean isPrintable() { // 한장을 찍을 분량이 남아있으면,
		return cartridge.isAvailable();		
	}		
}

class PrintCartridge {
	private double capacity;
	private double reductionRate;
	
	public PrintCartridge(double capacity, double reductionRate) {
		this.capacity = capacity;
		this.reductionRate = reductionRate;
	}
	
	public boolean isAvailable () {
		return capacity - reductionCapacity() >= 0;
	}
	
	public void consume() {
		capacity -= reductionCapacity();	
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	/* Inline Method */
	private double reductionCapacity() {
		return reductionRate;
	}
}

class PDFWriter implements Printable {
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

