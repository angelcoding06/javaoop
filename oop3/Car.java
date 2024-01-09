package oop3;

public class Car {
	private int currentSpeed;
	
	public Car(){

	}

	public int accelerate(){
		// now we can use the new method defined below
		// this.currentSpeed += 10;
		// return this.currentSpeed;
		return this.accelerate(10);	
	}
	// Accelerete method that receives a parameter, in this case is the pedal
	public int accelerate(int pedal){
		this.currentSpeed += pedal;
		return this.currentSpeed;
	}
	// Accelerete method that receives two parameters, in this case is the pedal and the limit
		public int accelerate(int pedal, int limit){
		this.currentSpeed += pedal;
		if(this.currentSpeed > limit){
			this.currentSpeed = limit;
		}
		return this.currentSpeed;
	}
	public int deaccelerate(){
		this.currentSpeed -= 10;
		return this.currentSpeed;
	}

	public int getCurrentSpeed(){
		return currentSpeed;
	}
}
