package com.niit.dao;

import com.niit.model.CartItem;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;

@Repository("CartDAO")
@Transactional
public class CartDAOImplementation implements CartDAO
{
	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public boolean addCartItem(CartItem cartItem)
	{
		try
		{
			sessionfactory.getCurrentSession().save(cartItem);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean deleteCartItem(CartItem cartItem)
	{
		try
		{
			sessionfactory.getCurrentSession().delete(cartItem);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean updateCartItem(CartItem cartItem) 
	{
		try
		{
			sessionfactory.getCurrentSession().update(cartItem);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public List<CartItem> listCartItem(String username) 
	{
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from CartItem where username=:uname and pstatus='NP'");
		query.setParameter("uname", username);
		List<CartItem> listCartItem = query.list();
		return listCartItem;
	}

	@Override
	public CartItem getCartItem(int cartItemId) 
	{
		Session session =  sessionfactory.openSession();
		CartItem cartItem= session.get(CartItem.class,cartItemId);
		session.close();
		return cartItem;
	}
	
}
