package com.prokarma.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.stereotype.Component;


@Configuration
@Component
@EnableResourceServer
public class GatewayConfiguration extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/oauth/**")
		.permitAll()
		.antMatchers("/**")
		.authenticated();
	}
	
	@Bean
	public RemoteTokenServices tokenServices() {
		
		RemoteTokenServices remoteTokenServices = new RemoteTokenServices();
		remoteTokenServices.setCheckTokenEndpointUrl("http://localhost:8888/oauth/check_token");
		remoteTokenServices.setClientId("client");
		remoteTokenServices.setClientSecret("secret");
		
		return remoteTokenServices;

	}
}
