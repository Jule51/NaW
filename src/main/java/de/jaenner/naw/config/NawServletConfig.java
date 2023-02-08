package de.jaenner.naw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="de.jaenner.naw.controller")
public class NawServletConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(600);
		registry.addResourceHandler("/js/**" ).addResourceLocations("/js/" ).setCachePeriod(600);
		registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(600);
		registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/").setCachePeriod(600);
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
