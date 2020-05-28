package com.yuriib.springboot.auth.google.springboot_auth_google;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String notRestrictedUrl = "/notrestricted";

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .logout(l -> l.logoutSuccessUrl("/").permitAll())
                .antMatcher("/**").authorizeRequests()
                .antMatchers(notRestrictedUrl).permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
    }
}
