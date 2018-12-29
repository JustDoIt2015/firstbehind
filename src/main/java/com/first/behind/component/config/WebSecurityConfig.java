package com.first.behind.component.config;

import com.first.behind.component.login.handle.MyAuthenctiationFailureHandler;
import com.first.behind.component.login.handle.MyAuthenctiationSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyAuthenctiationFailureHandler failureHandler;
    @Autowired
    private MyAuthenctiationSuccessHandler successHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().permitAll()
                .and().csrf().disable();
                /*.antMatchers("/static/**").permitAll()
                .antMatchers("/auth").permitAll()
                .antMatchers("/authentication/require").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/auth").loginProcessingUrl("/login")
                .successHandler(successHandler)
                .failureHandler(failureHandler);*/
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
