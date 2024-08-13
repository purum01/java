package edu.design.adapter.test1;


//Target interface
interface Target {
	void request();
}

//Adaptee class
class Adaptee {
	public void specificRequest() {
		System.out.println("Adaptee's specificRequest()");
	}
}

//Adapter class
class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}

//Client code
public class AdapterDemo {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.request(); // Output: Adaptee's specificRequest()
	}
}
