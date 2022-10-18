package com.example.login_retgister.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    @Value("${user.image.path}")
    private String userImagesFolder;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
         .addResourceHandler("/user/image/**")
                .addResourceLocations("file:\\C:\\OfelyaProJava\\Nune16\\app_resources\\");

//        registry.addResourceLocations(userImagesFolder);
    }
}

