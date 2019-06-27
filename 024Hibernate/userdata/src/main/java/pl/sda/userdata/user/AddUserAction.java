package pl.sda.userdata.user;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUserAction extends HttpServlet {

	private UserDAO userDAO = new UserDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorMsg = "";
		String name = request.getParameter("name");

		if (null == name || name.isEmpty()) {
			errorMsg += "Nie podano parametru name.";
		}

		if (!errorMsg.isEmpty()) {
			request.setAttribute("_ERROR", errorMsg);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/adduser.html");
			requestDispatcher.forward(request, response);
			return;
		}

		User user = userDAO.addUser(name);
		if (user.getId() == 0) {
			request.setAttribute("_ERROR", "Problem z dodaniem usera o name=" + name);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/error.jsp");
			requestDispatcher.forward(request, response);
			return;
		}

		request.setAttribute("newId", user.getId());
		request.setAttribute("_OK", "Dodano usera o id=" + user.getId() + " i name=" + name);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/users.html");
		requestDispatcher.forward(request, response);
	}
}
