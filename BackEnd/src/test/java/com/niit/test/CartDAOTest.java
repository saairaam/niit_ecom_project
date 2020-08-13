package com.niit.test;

import com.niit.model.CartItem;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;
import java.util.List;
import com.niit.dao.CartDAO;

public class CartDAOTest 
{
	static CartDAO cartDAO; 
	@BeforeClass
	public static void intialize()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		cartDAO = (CartDAO)context.getBean("cartDAO");
	}
	

	@Test
	public void addCartItemTest()
	{
		CartItem cartItem = new CartItem();
		cartItem.setProductId(81);
		cartItem.setProductName("Chicken briyani");
		cartItem.setPrice(130);
		cartItem.setQuantity(50);
		cartItem.setUsername("sakthi");
		cartItem.setPstatus("NP");
		assertTrue("problem in adding to cart:",cartDAO.addCartItem(cartItem));
	}
	
	
	@Test
	public void listCartItemTest() 
	{
		List<CartItem> listCartItem = cartDAO.listCartItem("sakthi");
		
		assertTrue("problem in listing cart item:",listCartItem.size()>0);
		
		for(CartItem cartItem:listCartItem) 
		{
		 	System.out.println(cartItem.getProductId());
			System.out.println(cartItem.getProductName());
			System.out.println(cartItem.getQuantity());
		}
	}
	
}
