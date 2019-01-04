
package com.hsbc.mx.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.WebApplicationInitializer;

/**
 * <p>
 * <b> Configuration class. </b>
 * </p>
 */
@Configuration
@SpringBootApplication
@ImportResource("classpath:additional-config.xml")
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {


    /**
     * Main class to run in local environment. uncomment to run in local
     *
     * @param args
     *            .
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }


    // for run in WAS 8.5. Verify that main method is deleted or comment to
    // deploy in was
    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}