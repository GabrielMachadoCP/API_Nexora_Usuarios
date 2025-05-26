package br.com.fiap.checkpoint1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desativa CSRF (necessário para testes via Postman)
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Libera acesso a todas as rotas
                )
                .formLogin(Customizer.withDefaults()); // Deixa o formLogin habilitado, mas você pode desativar se quiser

        return http.build();
    }
}
