package com.student.student_management.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/login.html",
                                "/register.html",
                                "/navbar.html",
                                "/auth/register",
                                "/css/**",
                                "/js/**"
                        ).permitAll()

                        .requestMatchers(
                                "/navbar.html",
                                "/index.html",
                                "/students.html",
                                "/add-student.html",
                                "/update-student.html",
                                "/students/**",
                                "/api/**",
                                "/current-user"
                        ).authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login.html")
                        .loginProcessingUrl("/login")
                        .usernameParameter("email")
                        .passwordParameter("password")
                        .defaultSuccessUrl("/index.html", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login.html")
                        .permitAll());

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
