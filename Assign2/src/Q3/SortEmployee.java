package Q3;

import java.util.ArrayList;

public class SortEmployee {

	public static void empSort(ArrayList<Employee> arr,int N) {
		for (int i = 1; i < N; i++) {
			Employee temp = arr.get(i);
			int j = i - 1;
			while (j >= 0 && arr.get(j).getSal() > temp.getSal()) {
				//comps++;
				//arr.get(j+1).getSal()=;
				arr.set(j+1,arr.get(j));
				j--;
			}
			arr.set(j+1,temp);
			
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,"vishal",6000));
		emplist.add(new Employee(2,"ak",4000));
		emplist.add(new Employee(3,"adi",3000));
		emplist.add(new Employee(4,"nilesh",7000));
		emplist.add(new Employee(5,"suyog",5000));
		System.out.println("before"+emplist.toString().toString());
		empSort(emplist,emplist.size());
		
		System.out.println("after"+emplist.toString().toString());

	}

}
