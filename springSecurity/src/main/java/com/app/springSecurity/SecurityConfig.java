package com.app.springSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@EnableWebSecurity
@ComponentScan(basePackages = "com.app")
public class SecurityConfig implements WebMvcConfigurer {
     
  /*  @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }*/
	
	@Bean
	public UserDetailsService userDetailsService() throws Exception
	{
		InMemoryUserDetailsManager manager =new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder().username("shri").password("123").roles("USER").build());
		return manager;
	}
	
	 protected void configure(HttpSecurity http) throws Exception {  
         
	        http  
	        .antMatcher("/")                                 
	        .authorizeRequests()  
	            .anyRequest().hasRole("ADMIN")  
	            .and()  
	        .httpBasic();  
	    }  
	
     
}