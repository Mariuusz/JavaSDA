package pl.sda.userdata.user;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveUserAction extends HttpServlet {

	private UserDAO userDAO = new UserDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorMsg = "";
		String id = request.getParameter("id");
		Integer userId = Integer.valueOf(id);
		if (null == userId) {
			errorMsg += "Nie podano parametru id.";
		}

		if (!errorMsg.isEmpty()) {
			request.setAttribute("_ERROR", errorMsg);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/users.html");
			requestDispatcher.forward(request, response);
			return;
		}

		boolean result = userDAO.removeUser(userId);
		if (!result) {
			request.setAttribute("_ERROR", "Problem z usunieciem usera o id=" + id);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/error.jsp");
			requestDispatcher.forward(request, response);
			return;
		}

		request.setAttribute("_OK", "Usunieto usera o id=" + userId);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/users.html");
		requestDispatcher.forward(request, response);
	}
}
