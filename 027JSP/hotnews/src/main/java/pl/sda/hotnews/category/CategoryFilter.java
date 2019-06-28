package pl.sda.hotnews.category;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class CategoryFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Inicjalizacja filtra");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		long start = System.currentTimeMillis();

		chain.doFilter(request, response);

		long end = System.currentTimeMillis();

		String servletPath = ((HttpServletRequest) request).getServletPath();
		System.out.println("Czas wykonania: ["+servletPath+"] " + (end - start) + "ms");

	}

	@Override
	public void destroy() {
		System.out.println("Zabicie filtra");
	}
}
