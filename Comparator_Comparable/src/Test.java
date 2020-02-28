import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		
		List<Employee>empList=Arrays.asList(new Employee(1,"abc",500),new Employee(5,"pqr",250),new Employee(3,"xyz",700));
        empList.forEach(System.out::println);
        
        System.out.println("---------------------------------");
        
        Collections.sort(empList);
        
        empList.forEach(System.out::println);
        
        System.out.println("---------------------------------");
        Collections.sort(empList, new CompareByName());
        empList.forEach(System.out::println);
        System.out.println("-------------------------------");
        Collections.sort(empList, new Comparator<Employee>(){

			@Override
			public int compare(Employee e1, Employee e2) {
				
				if(e1.getSalary()>e2.getSalary())
					return 1;
				else return -1;
				
			}

			
        	
        });
        
        empList.forEach(System.out::println);
        System.out.println("-----------------------------------");
        
       //empList.sort((Employee e1,Employee e2)->e1.getId()-e2.getId());
        
 	
        	Collections.sort(empList,(Employee e1,Employee e2)->e1.getId()-e2.getId() );
            empList.forEach(System.out::println);
            
            List<Employee> EmployeesList = new ArrayList<Employee>();  
            //Adding Employees  
            EmployeesList.add(new Employee(1,"HP Laptop",25000));  
            EmployeesList.add(new Employee(2,"Dell Laptop",30000));  
            EmployeesList.add(new Employee(3,"Lenevo Laptop",28000));  
            EmployeesList.add(new Employee(4,"Sony Laptop",28000));  
            EmployeesList.add(new Employee(5,"Apple Laptop",90000));  
            Set<Employee> EmployeePriceList2 =EmployeesList.stream()  
                                         .filter(p -> p.getSalary() > 30000).collect(Collectors.toSet());
                                              
                               // collecting as list  
            System.out.println(EmployeePriceList2);  
	}

}
