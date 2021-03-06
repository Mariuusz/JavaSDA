package pl.sda.userdata.user;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditUserAction extends HttpServlet {

	private UserDAO userDAO = new UserDAO();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorMsg = "";
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		Integer userId = Integer.valueOf(id);
		if (null == userId) {
			errorMsg += "Nie podano parametru id.";
		}

		if (null == name || name.isEmpty()) {
			errorMsg += "Nie podano parametru name.";
		}
		if (!errorMsg.isEmpty()) {
			request.setAttribute("_ERROR", errorMsg);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/edituser.html");
			requestDispatcher.forward(request, response);
			return;
		}

		boolean result = userDAO.editUser(userId, name);
		if (!result) {
			request.setAttribute("_ERROR", "Problem z edycja usera o id=" + id + " i name=" + name);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/error.jsp");
			requestDispatcher.forward(request, response);
			return;
		}

		request.setAttribute("_OK", "Wyedytowano usera o id=" + userId + " i name=" + name);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/users.html");
		requestDispatcher.forward(request, response);
	}
}
