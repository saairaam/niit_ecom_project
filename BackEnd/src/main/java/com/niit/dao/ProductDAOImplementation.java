package com.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;


@Repository("productDAO")
@Transactional
public class ProductDAOImplementation implements ProductDAO
{

	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public boolean addProduct(Product product)
	{   
		try
		{
			sessionfactory.getCurrentSession().save(product);
			return true;
		}
		
		catch(Exception e)
		{
		 return false;
		}
	}

	@Override
	public boolean updateProduct(Product product)
	{
		try 
		{
		  sessionfactory.getCurrentSession().update(product);
		  return true;
		}

		catch(Exception e)
		{
		return false;
		}
	}
	

	@Override
	public boolean deleteProduct(Product product) 
	{
		try 
		{
		  sessionfactory.getCurrentSession().delete(product);
		  return true;
		}

		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public Product getProductId(int productId)
	{
		Session session=sessionfactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.close();
		return product;
	}

	@Override
	public List<Product> listProduct() 
	{
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> listproduct=query.list();
		session.close();
		return listproduct;
	}
	

}
