package lambdaExpressions;

import java.util.function.Predicate;

class Employee{
	String name;
	int salary;
	int experience;
	
	public Employee(String name, int salary, int experience) {
		super();
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
	
}

public class PredicateDemo2 {

	public static void main(String[] args) {
		Employee emp = new Employee("Vipul", 50000, 5);
		
		Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 3);
		
		System.out.println(pr.test(emp));
	}

}
