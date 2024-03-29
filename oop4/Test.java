package oop4;

public class Test {
	public static void main(String[] args) {
		// Employee e = new Employee("Jhon", 1, 1000);
		// System.out.println(e.greet());
		// System.out.println(e.getVacationPeriod());
		// System.out.println(e.toString());
		// Person p = new Person("Jhon", 1);
		// System.out.println(p.greet());
		// System.out.println(p.toString());
		String[] employees = new String[3];
		employees[0] = new Employee("Jhon", 1, 1000).toString();
		employees[1] = new Employee("Jhon", 2, 1000).toString();
		employees[2] = new Employee("Jhon", 3, 1000).toString();
		for (String employee : employees) {
			System.out.println(employee);
		}
		for ( int i=0; i<employees.length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println("---------");
		Person someone = new Person("Jhon", 1);
		System.out.println(someone);
		String text = "Hello, my Im " + someone;
		System.out.println(text);

		System.out.println(someone.greet());
		System.out.println("---------");
		Person someone2 = new Employee("Jhon", 1, 1000);
		System.out.println(someone2.greet());

		// System.out.println(someone2.getSalary()); This raise an error because its casted as a Person 
		// The error below is a compiler error
		System.out.println(((Employee) someone2).getSalary());

		if(someone instanceof Employee){
			System.out.println(((Employee) someone).getVacationPeriod());

		}

	}
}
