package com.example.apicreation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

 @Bean
 @Override
 public UserDetailsService userDetailsService() {
  UserDetails user = User.withDefaultPasswordEncoder()
    .username("janaki")
    .password("123")
    .roles("ADMIN")
    .build();
  return new InMemoryUserDetailsManager(user);
 }
 
 @Override
 protected void configure(HttpSecurity http) throws Exception {
  http.httpBasic().and().authorizeRequests()
   .antMatchers("/home/**").hasRole("ADMIN")
   .and().csrf().disable().headers().frameOptions().disable();
 }
}