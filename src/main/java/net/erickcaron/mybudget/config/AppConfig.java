package net.erickcaron.mybudget.config;

import net.erickcaron.mybudget.currency.CurrencyConverter;
import net.erickcaron.mybudget.shop.ShopConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.*;

import javax.persistence.EntityManagerFactory;
import javax.validation.Validator;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.erickcaron.mybudget")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "net.erickcaron.mybudget")

public class AppConfig implements WebMvcConfigurer {

    @Override //pour la prise en charge des css/js/img sans mapping!
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean entityManagerFactoryBean
                = new LocalEntityManagerFactoryBean();
        entityManagerFactoryBean.setPersistenceUnitName("myBudgetPersistenceUnit");
        return entityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager jpaTransactionManager =
                new JpaTransactionManager(entityManagerFactory);
        return jpaTransactionManager;
    }

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }

    @Override
    public void addFormatters(FormatterRegistry registry){
        registry.addConverter(getShopConverter());
        registry.addConverter(getCurrencyConverter());
    }

    @Bean
    public ShopConverter getShopConverter(){
        return new ShopConverter();
    }

    @Bean CurrencyConverter getCurrencyConverter(){
        return new CurrencyConverter();
    }
}