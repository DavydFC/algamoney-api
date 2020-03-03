package com.example.algamoney.api.cors;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter {

	private String originPermitida = "http://localhost:8000"; // TODO: Configurar para diferentes ambientes
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpServletResponse response2 = (HttpServletResponse) response;
		
		//O CORS basicamente é incluir esses Headers HTTP com os Access-Control
		response2.setHeader("Access-Control-Allow-Origin", originPermitida);
		response2.setHeader("Access-Control-Allow-Credentials", "true");
		
		if("OPTIONS".equals(request2.getMethod()) && originPermitida.equals(request2.getHeader("Origin"))) {
			response2.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT, OPTIONS");
			response2.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
			response2.setHeader("Access-Control-Max-Age", "3600");
			response2.setStatus(HttpServletResponse.SC_OK);
		} else {
			chain.doFilter(request, response);
		}
	}
}
