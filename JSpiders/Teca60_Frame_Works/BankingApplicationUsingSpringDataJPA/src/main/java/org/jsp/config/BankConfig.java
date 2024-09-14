package org.jsp.config;


import java.util.Scanner;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class BankConfig {
	
	@Bean(name = "entityManagerFactory")
	public LocalEntityManagerFactoryBean localEntityManagerFactory()
	{
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("BankingApplication");
		return bean;
	}
	
	@Bean(name="transaction")
	public JpaTransactionManager jpaTransactionManager(EntityManagerFactory emf)
	{
		
		JpaTransactionManager manager=new JpaTransactionManager();
		manager.setEntityManagerFactory(emf);
		return manager;
		
	}
	
	@Bean
	public Scanner scanner()
	{
		Scanner scanner=new Scanner(System.in);
		return scanner;
	}

}
