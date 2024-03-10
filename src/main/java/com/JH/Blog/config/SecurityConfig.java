package com.JH.Blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;

@Configuration //loc
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig {

    public BCryptPasswordEncoder encodePWD(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
        auth.userDetailsService(null).passwordEncoder(encodePWD());
    }

    @Bean
    BCryptPasswordEncoder encode(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain fliterChain(HttpSecurity http) throws Exception {

        //csrf 토큰 비활성화 (테스트 시 걸어두는게 좋음)
        http.csrf(c -> c.disable());

        http.authorizeHttpRequests(a -> {
            a.requestMatchers(RegexRequestMatcher.regexMatcher("/board/\\d+"+"/dummy/\\d+")).permitAll()
                    .requestMatchers("/users/**", "/board/**").authenticated()
                    .anyRequest().permitAll();
        });

        http.formLogin(
                f -> {
                    f.loginPage("/auth/loginForm").loginProcessingUrl("/auth/loginProc").defaultSuccessUrl("/").failureUrl("/auth/loginForm");

                });

        //인증 주소 설정
        return http.build();
    }

}