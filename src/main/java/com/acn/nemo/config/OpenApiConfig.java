package com.acn.nemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAp() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Region Web Service API")
                        .description("Spring Boot Rest Api Region")
                        .termsOfService("terms")
                        .license(new License()
                                .name("GNU General Public License")
                                .url("https://www.gnu.org/licenses/gpl-3.0.en.html")
                        )
                        .version("1.0")
                        .contact(new Contact()
                                .name("Massimo Caputo")
                                .email("massimo.caputo@accenture.com")
                                .url("http://wwww.google.com")
                        )
                );

    }

}
