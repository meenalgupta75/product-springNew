package com.cts.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Login;

@Repository("loginDAO")
@Transactional
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	//@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Transactional(readOnly=true)
	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		org.hibernate.Session session = null;
		String query = "from Login where userName=? and password=?";
		org.hibernate.query.Query<Login> query2 = null;
		Login login=new Login(userName, password);
		if(login==null){
			return null;
		}
		else{
		
		
		try {
			session = sessionFactory.getCurrentSession();
			
			query2 = session.createQuery(query);
			query2.setParameter(0, login.getUserName());
			query2.setParameter(1, login.getPassword());
			 login = query2.getSingleResult();
			return login;
			// TODO: handle exception
			
		}
		finally {
			
		}
		
	}}
	
	//@Transactional(readonly="true")
	
	
}
	/*public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		org.hibernate.Session session = null;
		String query = "from login_table where userName=? and password=?";
		org.hibernate.query.Query<Login> query2 = null;
		try {
			session = sessionFactory.getCurrentSession();
			query2 = session.createQuery(query);
			query2.getParameter(userName);
			query2.getParameter(password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(session!=null){
				session.close();
			}
		}
		return null;
	}*/


