package oop1_6;
public class Car {

	private String brand;
	private	String model;
	private Engine engine;

	public Car (Engine e){
		this.engine = e;
	}

	public String getBrand(){
		return brand;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getModel(){
		return model;
	}

	public void setModel(String model){
		this.model = model;
	}

	public void goFaster(){
		this.engine.increaseRpm();
	}

	public String getCurrentSpeed(){
		return "Current speed is: " + this.calcCurrentSpeed()+" RPM";
	}

	private int calcCurrentSpeed(){
		return (int)(this.engine.getCurrentRpm() * 0.017);
	}
}
