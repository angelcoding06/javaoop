package oop3;

public class Test {
	public static void main(String[] args){
		Car c = new Car();
		c.accelerate();
		System.out.println(c.getCurrentSpeed());
		c.accelerate(80);
		System.out.println(c.getCurrentSpeed());
		int limit = 100;
		c.accelerate(80, limit);
		System.out.println(c.getCurrentSpeed());
	}
}
