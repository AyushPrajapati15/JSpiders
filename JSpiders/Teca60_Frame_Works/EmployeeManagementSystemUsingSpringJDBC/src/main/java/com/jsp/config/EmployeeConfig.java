package com.jsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "com.jsp")
public class EmployeeConfig {
	
	@Bean
	public DriverManagerDataSource driverManagerDataSourceBean()
	{
		
		DriverManagerDataSource dataSource =new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/teca60?");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
		
	}
	
	
	@Bean
	public JdbcTemplate jdbcemplatesBean()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate(driverManagerDataSourceBean());
		return jdbcTemplate;
	}
	
}
