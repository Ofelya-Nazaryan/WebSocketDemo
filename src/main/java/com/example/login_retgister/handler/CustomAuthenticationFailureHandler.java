package com.example.login_retgister.handler;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        if (exception.getClass().isAssignableFrom(DisabledException.class)) {
            response.sendRedirect("/verifyError");
        }
        if(exception.getClass().isAssignableFrom(BadCredentialsException.class)){
            response.sendRedirect("/login?loginError=bad-credentials&email="+request.getParameter("email")+"&password="+request.getParameter("password"));
        }
        if(exception.getClass().isAssignableFrom(LockedException.class)){ //todo for students

        }

    }
}