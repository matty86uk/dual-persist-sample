package com.example.dualpersistsample.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties
public class DatasourceConfig {

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.one")
    public DataSource oracleDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.two")
    public DataSource db2DataSource(){
        return DataSourceBuilder.create().build();
    }

}
