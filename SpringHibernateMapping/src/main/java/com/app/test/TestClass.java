package com.app.test;

import java.util.ArrayList;
import java.util.List;

import com.app.dao.AccountDao;
import com.app.dao.EmployeeDao;
import com.app.model.Account;
import com.app.model.Employee;

public class TestClass {

	public static void main(String[] args) {
		
		AccountDao accDao=new AccountDao();
		Account acc= new Account();
		acc.setAccNumber("555-345-65454");
		Account acc1= new Account();
		acc.setAccNumber("777-345-65454");
		 
		
		EmployeeDao empDao=new EmployeeDao();
		Employee emp=new Employee("pqr");
		
		emp.addAccount(acc);
		emp.addAccount(acc1);
		Employee emp2=new Employee("xyz");
		
		emp2.addAccount(acc);
		emp2.addAccount(acc1);
		List <Employee> el=new ArrayList<>();
		el.add(emp);
		el.add(emp2);
		
	
		
		empDao.saveEmployee(emp);
		empDao.saveEmployee(emp2);
		System.out.println(empDao.getAllEmployees());
		
		
		
		
		
		
		
		
		

	}

}
