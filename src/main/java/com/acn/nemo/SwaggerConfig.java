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

/**
 * The Class SwaggerConfig.
 */
@Configuration
@EnableWebMvc
public class SwaggerConfig {
	
	
	
	/**
	 * Api.
	 *
	 * @return the docket
	 */
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

	/**
	 * Meta data.
	 *
	 * @return the api info
	 */
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Region Web Service API")
				.description("Spring Boot Rest Api Region")
				.version("1.0.0")
				.license("GNU General Public License")
				.licenseUrl("https://www.gnu.org/licenses/gpl-3.0.en.html")
				.contact(new Contact("Massimo Caputo", "http://www.google.com", "massimo.caputo@accenture.com"))
				.build()
				;
	}
}
