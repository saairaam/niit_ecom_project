package com.niit.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;


public class SupplierDAOTest 
{
 
static SupplierDAO supplierdao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();		
		
		context.scan("com.niit");
	    context.refresh();
	    
	    supplierdao=(SupplierDAO)context.getBean("supplierDAO");
				
	}
	
	
	
	@Test
	public void addSupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierAddress("600033");
		supplier.setSupplierName("Xiaomi");
		assertTrue("Problem in Adding Supplier!",supplierdao.addSupplier(supplier));
		
	}
	
	
	@Ignore
	@Test
	public void updateSupplierTest()
	{
		Supplier supplier=supplierdao.getSupplierId(43);
		supplier.setSupplierName("600033");
		supplier.setSupplierAddress("Xiaomi");
		assertTrue("Problem in Updating Supplier!",supplierdao.updateSupplier(supplier));
	
	}
	
	
	@Ignore
	@Test
	public void deleteSupplierTest()
	{
		Supplier supplier=supplierdao.getSupplierId(43);
		assertTrue("Problem in deleting",supplierdao.deleteSupplier(supplier));
		
	}
	 
	
	@Ignore
	@Test
	public void listSupplier()
	{
		List<Supplier> listsupplier=supplierdao.listSupplier();
		assertNotNull("Problem in Listing.",listsupplier);
		
		for(Supplier s:listsupplier)
		{
            System.out.println(s.getSupplierId()+"::::::"+s.getSupplierName()+"::::::"+s.getSupplierAddress());
		}	
	}
	
}
