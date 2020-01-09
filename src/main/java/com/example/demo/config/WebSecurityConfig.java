package com.example.demo.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	

@Autowired
private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

//@Autowired
//private JwtRequestFilter jwtRequestFilter;

//@Autowired 
//UserDetailsService userDetailservice;

@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
// configure AuthenticationManager so that it knows from where to load
// user for matching credentials
// Use BCryptPasswordEncoder
 //auth.userDetailsService(this.userDetailservice).passwordEncoder(passwordEncoder());
}
/*@Bean
public PasswordEncoder passwordEncoder() {
return new BCryptPasswordEncoder();
}*/
@Bean
@Override
public AuthenticationManager authenticationManagerBean() throws Exception {
return super.authenticationManagerBean();
}
@Autowired
JwtRequestFilter jwtRequestFilter;
//@Bean
//public JwtRequestFilter jwtRequestFilterBean(){
	//return new JwtRequestFilter();

@Override
protected void configure(HttpSecurity httpSecurity) throws Exception {
// We don't need CSRF for this example
httpSecurity
.csrf().disable()
// dont authenticate this particular request

//.authorizeRequests().antMatchers("/user/add","/user/decrypt","/user/addouv", "/user/login","/service/updateservices/{id}","/service/deleteservices/{id}","/user/pwdCheck").permitAll().

//.authorizeRequests().antMatchers("/reservation/reserveClt/{idclient}","/reservation/reserveServ/{id}","/reservation/reserveOuv/{id}","/reservation/finishReservation/{id}","/reservation/getinitial","/reservation/getencours","/reservation/getterminer","/reservation/validateReservation/{id}","/ouvrier/update/{id}","/ouvrier/getOne/{id}","/ouvrier/available","/ouvrier/notavailable","/client/allclient","/client/oneclient/{id}","/client/add","/ouvrier/allouvrier","/user/add","/ouvrier/add/{id}","/ouvrier/update" , "/user/login","/service/updateservices/{id}","/service/deleteservices/{id}", "/ouvrier/deleteouvrier/{id}","/client/deleteclient/{id}","/service/reserveservice","/service/adds","/service/allservice").permitAll().
.authorizeRequests().antMatchers("/user/**","/service/**","/ouvrier/**", "/reservation/**","/client/**").permitAll().
// all other requests need to be authenticated


anyRequest().authenticated().and().
// make sure we use stateless session; session won't be used to
// store user's state.

exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)


.and()
// don't create session (REST)
.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
// Add a filter to validate the tokens with every request
httpSecurity.cors();
httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
}

}
