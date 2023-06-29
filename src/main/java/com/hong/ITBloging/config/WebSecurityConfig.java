package com.hong.ITBloging.config;

import com.hong.ITBloging.config.filter.CustomAuthenticationFilter;
import com.hong.ITBloging.config.filter.JwtAuthorizationFilter;
import com.hong.ITBloging.config.handler.CustomAuthFailureHandler;
import com.hong.ITBloging.config.handler.CustomAuthSuccessHandler;
import com.hong.ITBloging.config.handler.CustomAuthenticationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;


@RequiredArgsConstructor
@Configuration
@EnableWebSecurity(debug = true)
public class WebSecurityConfig {

    private final JwtAuthorizationFilter jwtAuthorizationFilter;
    private final CustomAuthSuccessHandler customAuthSuccessHandler;
    private final CustomAuthFailureHandler customAuthFailureHandler;

    /*
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        //정적 자원에 대해서는 Security 적용 X
        return (web) -> web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
    }




    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        return http
                .authorizeRequests().antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                //서버에 인증을 저장하지 않기 때문에 csrf disable
                .csrf().disable()
                //쿠키-세션을 사용하지 않기 때문에 cors disable
                .cors().disable()
                //form 기반 로그인 비 활성화 -> 커스텀 필터 사용
                .formLogin().disable()
                //jwt filter 추가
                .addFilterBefore(jwtAuthorizationFilter, BasicAuthenticationFilter.class)
                //session 기반의 인증이 아닌 jwt 토큰인증을 진행
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                //custom filter 추가
                .addFilterBefore(customAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(){
        return new ProviderManager(customAuthenticationProvider());
    }


    @Bean
    public CustomAuthenticationProvider customAuthenticationProvider(){
        return new CustomAuthenticationProvider(bCryptPasswordEncoder());
    }


    @Bean
    public CustomAuthenticationFilter customAuthenticationFilter(){

        CustomAuthenticationFilter customAuthenticationFilter = new CustomAuthenticationFilter(authenticationManager());
        customAuthenticationFilter.setFilterProcessesUrl("/login");
        customAuthenticationFilter.setAuthenticationSuccessHandler(customAuthSuccessHandler);
        customAuthenticationFilter.setAuthenticationFailureHandler(customAuthFailureHandler);
        customAuthenticationFilter.afterPropertiesSet();
        return customAuthenticationFilter;
    }


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

*/


}
