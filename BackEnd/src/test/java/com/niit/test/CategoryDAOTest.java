package com.niit.test;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.dao.CategoryDAO;
import com.niit.model.Category;


public class CategoryDAOTest 
{
    
	static CategoryDAO categorydao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(); 		
		
		context.scan("com.niit");
	    context.refresh();
	    
	    categorydao=(CategoryDAO)context.getBean("categoryDAO");				
	}
	
	
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
		category.setCategoryDescription("All Mobiles are Available");
		category.setCategoryName("Mobile");
		assertTrue("problem in Addding Category!",categorydao.addCategory(category));
	}
	
	
	@Ignore
	@Test
	public void updateCategoryTest()
	{
		Category category=categorydao.getCategoryId(1);
		category.setCategoryName("Beverages");
		category.setCategoryDescription("Coffee");
		assertTrue("Problem in Updating!",categorydao.updateCategory(category));
	}
	
	
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category=categorydao.getCategoryId(7);
		assertTrue("Problem in Deleting!",categorydao.deleteCategory(category));
	}
	 
	
	@Ignore
	@Test
	public void listCategory()
	{
		List<Category> listcategory=categorydao.listCategory();
		assertNotNull("Problem in Listing!",listcategory);
		
		for(Category c:listcategory)
		{
            System.out.println(c.getCategoryId()+"::::::"+c.getCategoryName()+"::::::"+c.getCategoryDescription());
		}	
	}
	
	

}
