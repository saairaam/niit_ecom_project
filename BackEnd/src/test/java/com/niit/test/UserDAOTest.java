package com.niit.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.dao.UserDAO;
import com.niit.model.User;

public class UserDAOTest
{

static UserDAO userdao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();		
		
		context.scan("com.niit");
	    context.refresh();
	    
	    userdao=(UserDAO)context.getBean("userDAO");
				
	}
	

	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setUsername("user");
		user.setPassword("password");
		user.setCustomerName("customer");
		user.setMobileno("1234567890");
		user.setMailid("customer@gmail.com");
		user.setRole("business");
		user.setEnabled("on");
		assertTrue("problem in Addding User!",userdao.addUser(user));
		
	}
	
	
	@Ignore
	@Test
	public void updateUserTest()
	{
		User user=userdao.getUserId(46);
		user.setUsername("upuser");
		user.setPassword("uppassword");
		user.setCustomerName("upcustomer");
		user.setMobileno("up1234567890");
		user.setMailid("update@gmail.com");
		user.setRole("upbusiness");
		user.setEnabled("upOn");
		assertTrue("Problem in Updating!",userdao.updateUser(user));
	
	}
	
	
	@Ignore
	@Test
	public void deleteUserTest()
	{
		User user=userdao.getUserId(46);
		assertTrue("Problem in Deleting!",userdao.deleteUser(user));
		
	}
	 
	
	@Ignore
	@Test
	public void listUser()
	{
		List<User> listuser=userdao.listUser();
		assertNotNull("Problem in Listing!",listuser);
		
		for(User u:listuser)
		{
            System.out.println(u.getUserId()+"::::::"+u.getUsername()+"::::::"+u.getPassword()+"::::::"+u.getCustomerName()+"::::::"+u.getMobileno()+"::::::"+u.getMailid()+"::::::"+u.getRole()+"::::::"+u.getEnabled());
		}	
	}
	
}