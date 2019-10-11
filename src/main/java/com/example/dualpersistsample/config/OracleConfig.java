package com.example.dualpersistsample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.example.dualpersistsample.db.oracle.repositories",
        entityManagerFactoryRef = "oracleEntityManagerFactory",
        transactionManagerRef = "oracleTransactionManager"
)
public class OracleConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean oracleEntityManagerFactory(final DataSource oracleDataSource){

        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(oracleDataSource);
        em.setPackagesToScan("com.example.dualpersistsample.db.oracle.entities");

        final JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        final Properties properties =  new Properties();
        properties.setProperty("hibernate.show_sql", "true");
        em.setJpaProperties(
                properties
        );
        return em;
    }

    @Bean
    public PlatformTransactionManager oracleTransactionManager(final EntityManagerFactory oracleEntityManagerFactory){
        return new JpaTransactionManager(oracleEntityManagerFactory);
    }

}
