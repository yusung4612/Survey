//package com.example.event.config;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.ObjectPostProcessor;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationFilter;
//import org.springframework.security.web.util.matcher.IpAddressMatcher;
//
//@Configuration
//@EnableWebSecurity
//@RequiredArgsConstructor
//public class WebSecurity {
//
//    private final UserService userService;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//    private final ObjectPostProcessor<Object> objectPostProcessor;
//
//    private static final String[] WHITE_LIST = {
//            "/users/**",
//            "/",
//            "/**"
//    };
//
//    @Bean
//    protected SecurityFilterChain config(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.headers().frameOptions().disable();
//        http.authorizeHttpRequests(authorize -> {
//                    try {
//                        authorize
//                                .requestMatchers(WHITE_LIST).permitAll()
//                                .requestMatchers(PathRequest.toH2Console()).permitAll()
//                                .requestMatchers(new IpAddressMatcher("127.0.0.1")).permitAll()
//                                .and()
//                                .addFilter(getAuthenticationFilter());
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//        );
//        return http.build();
//    }
//
//    public AuthenticationManager authenticationManager(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder);
//        return auth.build();
//    }
//
//    private AuthenticationFilter getAuthenticationFilter() throws Exception {
//        AuthenticationFilter authenticationFilter = new AuthenticationFilter();
//        AuthenticationManagerBuilder builder = new AuthenticationManagerBuilder(objectPostProcessor);
//        authenticationFilter.setAuthenticationManager(authenticationManager(builder));
//        return authenticationFilter;
//    }
//
//}
