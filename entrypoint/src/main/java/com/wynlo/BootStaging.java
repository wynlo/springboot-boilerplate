package com.wynlo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication(
        exclude = { DataSourceAutoConfiguration.class }
)
@ComponentScan(
        basePackages = "com.wynlo",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {
                BootLocal.class, BootProduction.class
        })
)
public class BootStaging {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BootStaging.class);
        springApplication.setAdditionalProfiles("staging");
        springApplication.run(args);
    }

}
