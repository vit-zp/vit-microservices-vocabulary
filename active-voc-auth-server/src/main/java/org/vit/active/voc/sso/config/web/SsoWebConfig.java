package org.vit.active.voc.sso.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(1)
public class SsoWebConfig extends WebSecurityConfigurerAdapter {
	
	

}
