package com.naver.eng.appserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.naver.eng.appserver.config.MySqlConfig;
import com.naver.eng.appserver.controller.ContentController;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
		
		MySqlConfig bean = run.getBean(MySqlConfig.class);
		JdbcTemplate bean2 = run.getBean(JdbcTemplate.class);
		
		
	}
}
