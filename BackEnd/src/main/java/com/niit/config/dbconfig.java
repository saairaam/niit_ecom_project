package com.niit.config;
import java.util.Properties;

import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.model.User;


@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit")
public class dbconfig 
{   @Bean(name="datasource")
	public DataSource getDataSource()
	{
	  DriverManagerDataSource datasource=new DriverManagerDataSource();
	 
      datasource.setDriverClassName("org.h2.Driver");
      datasource.setUrl("jdbc:h2:tcp://localhost/~/test");
      datasource.setUsername("sa");
      datasource.setPassword("password@123");

      return datasource;
	}

  @Bean(name="sessionfactory")
  public SessionFactory getSessionFactory()
  {  
	  Properties property=new Properties();
	  property.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	  property.setProperty("hibernate.hbm2ddl.auto","update");
	  property.setProperty("hibernate.show_sql","true");
	  
	  LocalSessionFactoryBuilder lsfb=new LocalSessionFactoryBuilder(getDataSource());
	  lsfb.addProperties(property);
	  lsfb.addAnnotatedClass(Category.class);
	  lsfb.addAnnotatedClass(Product.class);
	  lsfb.addAnnotatedClass(Supplier.class);
	  lsfb.addAnnotatedClass(User.class);
	  	  
	 
	  SessionFactory sessionfactory=lsfb.buildSessionFactory();
	  return sessionfactory;  	  	  
	  
  }
  
  
  @Bean(name="txManager")
  public HibernateTransactionManager getHibernateTranscationManager(SessionFactory sessionfactory)
  { 	
	  return new HibernateTransactionManager(sessionfactory);
  }
  
  
}


