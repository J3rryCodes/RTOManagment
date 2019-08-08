package om.rtosystem.filter;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.rtosystem.service.RTOSystem;
import com.rtosystem.service.RTOSystemImpl;

@WebFilter(urlPatterns = { "/*" })
public class FilterClass implements Filter {

	private ArrayList<String> ipAddress;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String remoteIp = request.getRemoteAddr();

		for (String s : ipAddress) {
			if (s.equals(remoteIp))
				request.setAttribute("admin", "Admin");
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		RTOSystem rs = RTOSystemImpl.getInstence();
		ipAddress = rs.getAdmingIp();
		for (String s : ipAddress)
			System.out.println("Admin IP : " + s);
	}

}
