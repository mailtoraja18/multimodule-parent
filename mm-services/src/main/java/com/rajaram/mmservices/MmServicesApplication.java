package com.rajaram.mmservices;

import org.hibernate.annotations.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.rajaram")
@EntityScan("com.rajaram")
@EnableJpaRepositories("com.rajaram.mmdb")
public class MmServicesApplication {

    public static void main(String[] args) {
        System.out.println("MM Services" + MmServicesApplication.class.getPackage().getImplementationVersion());
        SpringApplication.run(MmServicesApplication.class, args);
    }
}
