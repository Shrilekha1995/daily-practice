package com.app.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class EmployeeDao {
	
	public void saveEmployee(Employee emp)
	{
		Transaction transaction = null;
		 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(emp);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }
	
	public List<Employee> getAllEmployees(){
		Transaction transaction = null;
		 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            Query query=session.createQuery("from Employee");
	            List<Employee>empList=query.getResultList();
	            // commit transaction
	            transaction.commit();
	            return empList;
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
		return null;
		
		
		
	}
	
	

	}


