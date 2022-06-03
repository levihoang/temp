package com.pts.findInternship.Config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebSecurity
public class SpringSecurityConfig 
//extends WebSecurityConfigurerAdapter 
{
//	@Autowired
//    private UserDetailsService userDetailsService;
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//		super.configure(auth);
//	}
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
////		http.formLogin().loginPage("/login")
////		.usernameParameter("username").passwordParameter("password");
////		http.exceptionHandling().accessDeniedPage("/login?accessDenied");
//		http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated();
//		http.csrf().disable();
//	}
}
