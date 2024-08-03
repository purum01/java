package cleancode.section02.polymorphism3;

public class BeanFactory {
	public TV getBean(String name) {
		if(name.equals("lg")) {
			return new LgTV();
		} else if(name.equals("samsung")) {
			return new SamsungTV();
		} 
		return null;
	}
}


