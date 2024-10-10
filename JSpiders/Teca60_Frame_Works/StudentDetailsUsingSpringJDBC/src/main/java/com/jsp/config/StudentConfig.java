package com.jsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages = "com.jsp")
public class StudentConfig {
	
	@Bean
	public DriverManagerDataSource driverManagerDataSourceBean()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/teca61?");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplateBean()
	{
		JdbcTemplate template=new JdbcTemplate(driverManagerDataSourceBean());
		return template;
	}

}
