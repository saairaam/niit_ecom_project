package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Table
public class CartItem 
{	
	@Id
	@GeneratedValue
	int cartItemId;
	int productId;
	String productName;
	float price;
	int quantity;
	String username;
	String pstatus;
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float price) 
	{
		this.price = price;
	}
	
	public int getCartItemId() 
	{
		return cartItemId;
	}
	
	public void setCartItemId(int cartItemId) 
	{
		this.cartItemId = cartItemId;
	}
	
	public int getProductId() 
	{
		return productId;
	}
	
	public void setProductId(int productId) 
	{
		this.productId = productId;
	}
	
	public String getProductName() 
	{
		return productName;
	}
	
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public String getPstatus() 
	{
		return pstatus;
	}
	
	public void setPstatus(String pstatus) 
	{
		this.pstatus = pstatus;
	}	

}