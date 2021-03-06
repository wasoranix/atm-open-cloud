package com.hsbc.mx.atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * <b> SwaggerConfig. </b>
 * </p>
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any())
            .paths(Predicates.not(PathSelectors.regex("/error.*"))).build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("ATM").description("API to Find near ATM's").termsOfServiceUrl("http://hsbc.com.mx")
            .contact(
                new Contact("POD IMAGING SOLITION", "pod_imaging_solutions@noexternalmail", "pod_imaging_solutions@noexternalmail"))
            .license("MEXICO-LAM").licenseUrl("pod_imaging_solutions@noexternalmail").version("1.4").build();
    }
}
