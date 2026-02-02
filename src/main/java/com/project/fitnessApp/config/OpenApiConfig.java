package com.project.fitnessApp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customApi(){
        return new OpenAPI()
                .info(new Info().title("Fitness Tracker APIs.")
                        .version("v1.0")
                        .description("Production Ready APIs.")
                        .contact(new Contact()
                                .name("Adarsh Raj")
                                .email("itsadarshraj17@gmail.com")
                                .url("https://www.linkedin.com/in/adarsh-raj-450756280/")
                        )
                );
    }

}
