package oop5;

public class UFO extends Alien implements Flyer {
	
	public UFO() {
		System.out.println("UFO constructor");
	}
	public String takeOff() {
		return "UFO taking off";	}

	@Override
	public String fly(){
		return "UFO flying";
	}

	@Override
	public void land() {
		System.out.println("UFO landing");
	}
}
