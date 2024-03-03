package com.itwill.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginAuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();

		if (session.getAttribute("employee") == null) {
			String url = request.getRequestURI().substring(request.getContextPath().length());
			String query = request.getQueryString();
			if (query == null) {
				query = "";
			} else {
				query = "?" + query;
			}

			if (request.getMethod().equals("GET")) {
				session.setAttribute("destURI", url + query);
			}

			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}

		return true;
	}
}
