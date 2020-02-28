package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfig.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(104,"shreya",35000));  
	   /* 
	    int status1=dao.updateEmployee(new Employee(102,"Amit",5000));
	    System.out.println(status);  
	    System.out.println(status1); */
	    
	   
	 //   System.out.println( dao.getById(102));
	    
	   // System.out.println(dao.getAllEmp());
	    
}
}
