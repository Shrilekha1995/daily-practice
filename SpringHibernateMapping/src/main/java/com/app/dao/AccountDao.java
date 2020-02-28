package com.app.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Account;
import com.app.util.HibernateUtil;

public class AccountDao {

	public void saveAccount(Account acc) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(acc);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}
