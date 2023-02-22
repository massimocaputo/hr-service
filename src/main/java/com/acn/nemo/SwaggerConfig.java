package com.acn.nemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig {
	
	
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())
          .build()
          .apiInfo(metaData()
        		  );                                           
    }

	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Region Service Example")
				.description("Spring Boot Rest Api Example")
				.version("1.0.0")
				.license("GNU General Public License")
				.licenseUrl("https://www.gnu.org/licenses/gpl-3.0.en.html")
				.contact(new Contact("Massimo Caputo", "http://www.google.com", "massimo.caputo@accenture.com"))
				.build()
				;
	}
}
