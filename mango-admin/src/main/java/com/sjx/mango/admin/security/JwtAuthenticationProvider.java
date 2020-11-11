package com.sjx.mango.admin.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author sjx
 */
public class JwtAuthenticationProvider extends DaoAuthenticationProvider{
    public JwtAuthenticationProvider(UserDetailsService service) {
        setUserDetailsService(service);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        if (authentication.getCredentials() == null){
            logger.debug("Authentication failed: no credentials provided.");
            throw new BadCredentialsException(messages.getMessage("AbstractUserDetailsAuthenticationProvider" +
                    ".badCredentials","Bad credentials"));
        }
        String presentedPassword = authentication.getCredentials().toString();
        String salt = ((JwtUserDetails)userDetails).getSalt();

        if (!new MyPasswordEncoder(salt).matches(userDetails.getPassword(),presentedPassword)){
            logger.debug("Authentication failed: password doesn't match");
            throw new BadCredentialsException(messages.getMessage("AbstractUserDetailsAuthenticationProvider" +
                    ".badCredentials","Bad credentials"));
        }
    }
}
