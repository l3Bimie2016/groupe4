package config;

import fr.auth.AuthClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Nico on 10/02/2016.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true) //prePostEnabled = true
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    public static String USER_NAME = "toto";
    public static String USER_NAME_ADMIN = "admin";
    public static String PASSWORD = new BCryptPasswordEncoder().encode("toto");

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Active ou déscative le csrl (si désactivé, plus besoin du champ hidden correspond dans la page de login
        http.csrf().disable();
        http.authorizeRequests().anyRequest().permitAll();
        //http.authorizeRequests().antMatchers("/*","index", "/fail", "fail2").permitAll();
                //.antMatchers("/private/admin/**").hasRole("ROLE_ADMIN") // Si on souhaites restraindre l'URL pour le role ADMIN
              /*  .antMatchers("/private/**").fullyAuthenticated()    // l'accès aux URLs private/** sera restrainte à un utilisateur authentifié
                .and()
                .formLogin()                        // utilisation du mode FormLogin pour l'authentification
                .loginPage( "/login" )              // Définition d'une page custom pour le login (si non présent authomatiquement généré)
                .loginProcessingUrl( "/login.do" )  // Url à utiliser pour poster l'authenfication, donc l'action dans la page custom de login
                .defaultSuccessUrl( "/" )           // Url par défaut à utiliser en cas d'authentification réussie
                .failureUrl( "/login?err=1" )
                .usernameParameter( "username" )    // Nom du champs pour le username dans la page de login
                .passwordParameter( "password" )    // Nom du champs pour le mot de passe dans la page de login
                .and()
                .exceptionHandling()
                .accessDeniedPage( "/403" )
                .and()
                // Configuration du logout
                .logout()
                .logoutRequestMatcher( new AntPathRequestMatcher( "/logout" ) ) // URL à appeler pour se délogguer
                .logoutSuccessUrl( "/" )                                        // URL vers laquelle renvoyer lorsqu'on s'est bien déloggué
                .deleteCookies( "JSESSIONID" )                                  // COOKIE à supprimer
                .invalidateHttpSession( true )                                  // Invalider la session HTTP
                .and()
                // The session management is used to ensure the user only has one session. This isn't
                // compulsory but can add some extra security to your application.
                .sessionManagement()
                .invalidSessionUrl( "/" )
                .maximumSessions( 1 );
                */
    }

    /**
     * Service d'authentification
     */
    @Autowired
    private AuthClientService authClientService;

    /**
     * Surcharge de la configuration
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal( AuthenticationManagerBuilder auth ) throws Exception
    {
        auth.userDetailsService(authClientService).passwordEncoder(new BCryptPasswordEncoder());

    }


}
