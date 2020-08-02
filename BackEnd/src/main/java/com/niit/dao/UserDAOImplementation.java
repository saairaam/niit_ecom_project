package com.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImplementation implements UserDAO
{
	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public boolean addUser(User user)
	{   
		try
		{
			sessionfactory.getCurrentSession().save(user);
			return true;
		}
		
		catch(Exception e)
		{
		 return false;
		}
	}

	@Override
	public boolean updateUser(User user)
	{
		try 
		{
		  sessionfactory.getCurrentSession().update(user);
		  return true;
		}

		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteUser(User user) 
	{
		try 
		{
		  sessionfactory.getCurrentSession().delete(user);
		  return true;
		}

		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public User getUserId(int userId)
	{
		Session session=sessionfactory.openSession();
		User user=(User)session.get(User.class,userId);
		session.close();
		return user;
	}

	@Override
	public List<User> listUser()
	{
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from User");
		List<User> listuser=query.list();
		session.close();
		return listuser;
		
	}
}
