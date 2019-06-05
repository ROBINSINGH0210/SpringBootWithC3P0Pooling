package com.base.SpringBootWithC3P0Pooling;

import java.beans.PropertyVetoException;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableAutoConfiguration
public class SpringBootWithC3P0PoolingConfiguration {
//	private static final Logger log = LoggerFactory.getLogger(SpringBootWithC3P0PoolingConfiguration.class);
	@Autowired
	private DataSource dataSource;

	@Autowired
	Environment env;

	@Bean
	public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
		ComboPooledDataSource ds = (ComboPooledDataSource) dataSource;
		ds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
		System.out.println("Connection Polling datasource : " + dataSource); // check connection pooling
		System.out.println("Instace of data source: " + ds);
		System.out.println("Connection Pool size : " + ds.getMaxPoolSize());
		System.out.println("Min connection pool size: " + ds.getMinPoolSize());
		System.out.println("Max statements: " + ds.getMaxStatements());
		System.out.println("Url: " + ds.getJdbcUrl());
		return jdbcTemplate;
	}
}
