package com.skill_connect.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//	before this default security chain is working now we will configure
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////		disabling csrf because
//		http.csrf(customizer -> customizer.disable());
//		//access denied
//		http.authorizeHttpRequests(request ->request.anyRequest().authenticated());
//		//default form login for browser
//		http.formLogin(Customizer.withDefaults());
////		for rest controller work through basic auth
//		http.httpBasic(Customizer.withDefaults());
//		//session management
////		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
////		
//		
//		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//		
//		

////		thiss all ==http.csrf(customizer -> customizer.disable());
//		
//		Customizer<CsrfConfigurer<HttpSecurity>> custCsrf=new Customizer<CsrfConfigurer<HttpSecurity>>() {
//			
//			@Override
//			public void customize(CsrfConfigurer<HttpSecurity> customizer) {
//				// TODO Auto-generated method stub
//				customizer.disable();
//				
//			}
//		};
//		http.csrf(custCsrf);
		
//		new way do do same

		return http.csrf(customizer -> customizer.disable())
				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
				.formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();

	}

}
