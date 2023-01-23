package de.jaenner.naw.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import de.jaenner.naw.dao.NawDao;

@Configuration
public class NawRootConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		dataSource.setUsername("postgres");
		return dataSource;
	}
	
	@Bean
	public NawDao nawDao(DataSource dataSource) {
		NawDao dao = new NawDao();
		dao.setDataSource(dataSource);
		return dao;
	}
}
