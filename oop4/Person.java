package oop4;

public class Person {
	protected String name;
	protected int id;

	public Person(){

	}

	public Person(String nombre, int id){
		this.name = nombre;
		this.id = id;
	}
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String greet(){
		return "Hello, my name is " + this.name;
	}

	public String toString(){
		return "Name: " + this.name + " Id: " + this.id ;
	}
}
