package oop4;

public class Employee extends Person{
	protected int salary;

	public Employee(){

	}

	public Employee(int salary){
		this.salary = salary;
	}

	public Employee(String name, int id, int salary){
		super(name, id);
		this.salary = salary;
	}

	public int getVacationPeriod(){
		if(salary < 2000){
			return 21;
		} else{
			return 15;
		}
	}
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}

	public String greet(){
		return super.greet() + " and I work as an employee " + this.name;
	}

	public String toString(){
		return super.toString() + " Salary: " + this.salary + "\n";
	}
}
