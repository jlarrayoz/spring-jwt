package uy.org.curso.spring.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
public class SecurityConfig {
	
	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests((authz) -> 
	            	authz
	            	.requestMatchers(HttpMethod.OPTIONS).permitAll() //necesario para cors y angular
	            	.requestMatchers(HttpMethod.GET, "rest-api/**").hasAuthority("SCOPE_pruebas")
	            )
	            .oauth2ResourceServer((oauth2ResourceServer) ->
	            	oauth2ResourceServer.jwt(Customizer.withDefaults())
	            );
	          
	        return http.build();
	    }
}
