package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Nico on 11/02/2016.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * Ajout de la vue login, pas besoin de code côté controller
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");

    }
}

