package uy.org.curso.spring.jwt;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RestConfig implements WebMvcConfigurer  {

	
	/**
	 * Le setea un base path a todos los servicios rest (En este caso "rest-api")
	 */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix("rest-api", HandlerTypePredicate.forAnnotation(RestController.class));
    }
}