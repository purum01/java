package cleancode.section03.inheritanceORdelegation3;

public class PrinterExample {

	public static void main(String[] args) {

		Printer[] printers = new Printer[3];
		
		printers[0] = new Printer(new InkjetPrinterImpl("101"));
		printers[1] = new Printer(new DotPrinterImpl("102"));
		printers[2] = new Printer(new LaserPrinterImpl("103"));

		for (int i = 0; i < printers.length; i++) {
			if (printers[i].getId().equals("101")) {
				System.out.println("101 프린터는 단종되어 사용할 수 없습니다. \n");
				continue;
			}

			printWelcome(printers[i]); 
		}
	}

	public static void printWelcome(Printer printer) {
		System.out.println("이 프린터의 ID는 " + printer.getId() + " 입니다.");
		printer.print("프린터의 세계에 초대합니다.");
		System.out.println("");
	}
}
