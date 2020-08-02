package com.niit.test;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.dao.ProductDAO;
import com.niit.model.Product;


public class ProductDAOTest
{
    static ProductDAO productdao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();		
		
		context.scan("com.niit");
	    context.refresh();
	    
	    productdao=(ProductDAO)context.getBean("productDAO");
	    
	}	

	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductDescription("All Mobiles are Available");
		product.setProductName("Mobile");
		product.setProductPrice(2000);
		product.setProductQuantity(20);
		product.setSupplierId(33);
		product.setCategoryId(55);
		assertTrue("Problem in Addding Product!",productdao.addProduct(product));
				
	}
	
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productdao.getProductId(41);
		product.setProductName("Beverages");
		product.setProductDescription("Coffee");
		product.setProductPrice(0);
		product.setProductQuantity(0);
		product.setSupplierId(0);
		product.setCategoryId(0);		
		assertTrue("Problem in Updating Product!",productdao.updateProduct(product));
	
	}
	
	
	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product product=productdao.getProductId(41);
		assertTrue("Problem in Deleting Product!",productdao.deleteProduct(product));
		
	}
	 
	
	@Ignore
	@Test
	public void listProduct()
	{
		List<Product> listproduct=productdao.listProduct();
		assertNotNull("Problem in Listing Product!",listproduct);
		
		for(Product p:listproduct)
		{
            System.out.println(p.getProductId()+"::::::"+p.getProductName()+"::::::"+p.getProductDescription()+"::::::"+p.getProductPrice()+"::::::"+p.getProductQuantity()+"::::::"+p.getCategoryId()+"::::::"+p.getSupplierId());
		}	
	}

}
