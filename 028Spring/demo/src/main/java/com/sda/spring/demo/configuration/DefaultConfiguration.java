package com.sda.spring.demo.configuration;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(/*basePackages = "com.sda.spring.demo"*/)
public class DefaultConfiguration extends WebMvcAutoConfiguration {

}
