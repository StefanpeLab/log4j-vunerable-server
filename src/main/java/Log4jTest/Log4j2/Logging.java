package Log4jTest.Log4j2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class Logging
 */
public class Logging extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(Logging.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Logging() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
		logger.trace("Entering application...");

		logger.info("Hello Log4j2...");
		//logger.error("Something is wrong with this code", new Exception("Invalid message"));
		logger.info("User-Agent: --- "+request.getHeader("User-Agent"));
		logger.info("Hi" + System.getProperty("jndiUrl"));
		//logger.info("${jndi:ldap://log4shell.huntress.com:1389/457a238d-91cc-44a1-9976-234aa0e22248}");
		logger.trace("Exiting application...");
		response.getWriter().append("Served At: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
