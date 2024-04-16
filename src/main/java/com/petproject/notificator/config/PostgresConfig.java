package com.petproject.notificator.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PostgresConfig {

    @Value("${spring.datasource.postgres.url}")
    private String url;

    @Value("${spring.datasource.postgres.username}")
    private String username;

    @Value("${spring.datasource.postgres.password}")
    private String password;

    @Bean
    public DataSource postgresDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
