package com.yuriib.springboot.auth.google.springboot_auth_google;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .logout(l -> l.logoutSuccessUrl("/").permitAll())
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/notrestricted").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
    }
}
