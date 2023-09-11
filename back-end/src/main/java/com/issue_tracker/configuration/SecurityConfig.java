package com.issue_tracker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeHttpRequests(auth -> {
//                    auth.antMatchers("/abc").permitAll();
//                    auth.anyRequest().authenticated();
//                })
//                .oauth2Login(Customizer.withDefaults())
////                .oauth2Login( oauth2Login ->                      //Custom login page
////                        oauth2Login.loginPage("/customLoginPage"))
//                .logout(logout ->
//                        logout
////                                .logoutSuccessUrl("/")
//                                .invalidateHttpSession(true)
//                                .clearAuthentication(true)
//                                .deleteCookies("JSESSIONID")
////                                .logoutSuccessUrl("http://localhost:8080")
//                                .logoutUrl("http://localhost:8080/logout"))
//                .build();
//    }
}
