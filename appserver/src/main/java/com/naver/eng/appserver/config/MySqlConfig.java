package com.naver.eng.appserver.config;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MySqlConfig {
	
	@Bean
	public JdbcTemplate datasource() throws Exception {
		Properties properties = new Properties();

		properties.setProperty("username", "fever");
		//jjjj
		properties.setProperty("password", "1234");
		properties.setProperty("url",
				"jdbc:mysql://192.168.99.101:32803/sample?autoReconnect=true&useTimezone=true&serverTimezone=UTC&cacheServerConfiguration=true&elideSetAutoCommits=true&connectTimeout=5000&socketTimeout=3000&useUnicode=true&characterEncoding=utf-8");

		BasicDataSource createDataSource = BasicDataSourceFactory.createDataSource(properties);
		
		return new JdbcTemplate(createDataSource);

	}
	


}
