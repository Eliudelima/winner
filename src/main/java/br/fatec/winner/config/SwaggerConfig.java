package br.fatec.winner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
    @Bean
     public OpenAPI filmesOpenAPI() {
     return new OpenAPI().info(new Info()
     .title("WinnerSchool")
     .description("Api desenvolvida para avaliação do 2º Bimestre da matéria Desenvolvimento para Servidores II")
     .version("v0.0.1")
     .contact(new Contact()
     .name("Eliude de Lima").email("eliudefelizindo@gmail.com"))
     .license(new License()
     .name("Apache 2.0").url("http://springdoc.org/%22")));
     }
}