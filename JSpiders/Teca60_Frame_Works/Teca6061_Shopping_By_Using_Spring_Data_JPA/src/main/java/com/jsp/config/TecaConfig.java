package com.jsp.config;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.jsp")
@EnableJpaRepositories("com.jsp.repository")
public class TecaConfig {
	
	@Bean(name="entityManagerFactory")
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("Teca6061_Shopping_By_Using_Spring_Data_JPA");
		return bean;
	}
	@Bean(name="transactionManager")
	public JpaTransactionManager jpaTransactionManagerBean(EntityManagerFactory emf ) {
		JpaTransactionManager manager=new JpaTransactionManager();
		manager.setEntityManagerFactory(emf);
		return manager;

	}
	
	@Bean
	public Scanner scannerClassBean() {
		Scanner scanner=new Scanner(System.in);
		return scanner;
	}
	
	

}
