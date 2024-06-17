package Q4;

import java.util.ArrayList;

public class SearchEmployee {
	public static int linearSearch(ArrayList<Employee> empList,int N, int key) {
		int count=0;
		for (Employee emp : empList) {
			count++;
			if(emp.id==key) {
				return count;
			}
		}
		return count;
	}
	public static int linearSearch(ArrayList<Employee> empList,int N, String key) {
		int count=0;
		for (Employee emp : empList) {
			count++;
			if(emp.name==key) {
				return count;
			}
		}
		return count;
	}
	public static int linearSearch(ArrayList<Employee> empList,int N, double key) {
		int count=0;
		for (Employee emp : empList) {
			count++;
			if(emp.sal==key) {
				return count;
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1,"vishal",8000));
		empList.add(new Employee(2,"suyog",6000));
		empList.add(new Employee(3,"akshay",7000));
		empList.add(new Employee(4,"adi",5000));
		int kid =5;
		String kname ="akshay";
		double ksal =5000;
		System.out.println("Empid: "+kid+" at "+linearSearch(empList,empList.size(),kid));
		System.out.println("EmpName: "+kname+" at "+linearSearch(empList,empList.size(),kname));
		System.out.println("EmpSlary: "+ksal+" at "+linearSearch(empList,empList.size(),ksal));
		
		
		

	}

}
