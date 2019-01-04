
package com.hsbc.mx.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>
 * <b> Configuration class. </b>
 * </p>
 */
@Configuration
@SpringBootApplication
@ImportResource("classpath:additional-config-local.xml")
public class ApplicationLocal extends SpringBootServletInitializer {


    /**
     * Main class to run in local environment. uncomment to run in local
     *
     * @param args
     *            .
     */
    public static void main(final String[] args) {
        SpringApplication.run(ApplicationLocal.class, args);
    }


}
