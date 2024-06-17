package Q4;

public class Employee {
	int id;
	String name;
	double sal;
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.sal = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + sal + "]";
	}
	
	

}
