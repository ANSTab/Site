package com.tabachenko.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/np").setViewName("NovaPoshta");
        registry.addViewController("/mapGoogle").setViewName("mapGoogle");
        registry.addViewController("/NullTitle").setViewName("NullTitle");
        registry.addViewController("/contacts").setViewName("contacts");
        registry.addViewController("/inco").setViewName("incoterms");

    }


}
