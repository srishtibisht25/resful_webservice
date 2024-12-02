package com.rest.webservices.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource)
	{
		this.messageSource = messageSource;
	}
	

	@GetMapping(path = "/hello-world")
	public String helloWorld()
	{
		return "Hello World!";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public helloWorldBean helloWorldBean()
	{
		return new helloWorldBean("hello world bean");
	}
	
	@GetMapping(path = "/hello-world-bean-internationalization")
	public String helloWorldBeaninternationalization()
	{
		
		
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "defaultMessage", locale);
	}
	
	
}
