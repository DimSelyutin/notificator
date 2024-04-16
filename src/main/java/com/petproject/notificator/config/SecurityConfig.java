package com.petproject.notificator.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http.authorizeHttpRequests((requests) -> requests
                                .requestMatchers("/", "/home", "/registration").permitAll()
                                .anyRequest().authenticated())
                                .formLogin((form) -> form
                                                .loginPage("/login")
                                                .permitAll())

                                .logout((logout) -> logout.permitAll());

                return http.build();
        }

        @Autowired
        private UserDetailsService userDetailsService;

        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
                auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
        }

        @Bean
        public PasswordEncoder passwordEncoder() {

                return new BCryptPasswordEncoder();
        }

}