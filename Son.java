package abstraction.interfac;

public class Son implements Grandfather , Father{

	@Override
	public void fatherInfo() {
	    System.out.println("Hellow i am father is rahul");
		
	}

	@Override
	public void grandfatherInfo() {
		System.out.println("Helloe i am grandfather");
		
	}
	
	public void sonInfo() {
		System.out.println("Hi i am rahul");
	}

	@Override
	public void age() {
		System.out.println("Age of father is 55");
		
	}

}
