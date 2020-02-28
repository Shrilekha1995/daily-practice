package com.yash.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.springmvc.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
 
    @Autowired
    private SessionFactory sessionFactory;
    
   public Employee findById(int id) {
	  // Query query = sessionFactory.getCurrentSession().createQuery("from Employee where id= :id");
     //  query.setInteger(id, id);
     //  query.
	   Employee e=(Employee) sessionFactory.getCurrentSession().byId(Employee.class).getReference(id);
	   //Employee e2=(Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
       return e;
       
    }
 
    public void saveEmployee(Employee employee) {
    	sessionFactory.getCurrentSession().persist(employee);
    }
 
    public void deleteEmployeeBySsn(String ssn) {
        Query query = sessionFactory.getCurrentSession().createQuery("delete from Employee where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployees() {
    	   Query query = sessionFactory.getCurrentSession().createQuery("from Employee");
    	   List <Employee>empList=query.list();
    	   return empList;
    }
 
    public Employee findEmployeeBySsn(String ssn) {
		return null;
       /* Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Employee) criteria.uniqueResult();*/
    }
}