package com.sprboot.project_3.DXCSPRBOOT_3_REST;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class ProductConfig {
	
	@Autowired
	EntityManagerFactory  entityManagerFactory;
	
	@Bean
	public SessionFactory getSessionFactory()
	{
	return entityManagerFactory.unwrap(SessionFactory.class);
	}

}
