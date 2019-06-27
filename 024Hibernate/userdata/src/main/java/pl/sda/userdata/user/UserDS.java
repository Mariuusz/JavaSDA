package pl.sda.userdata.user;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class UserDS extends HttpServlet {

	private UserDAO userDAO = new UserDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Optional<User> optionalUser = getUserById(id);

		if (optionalUser.isPresent()) {
			request.setAttribute("user", optionalUser.get());

			RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/view/user.jsp");
			requestDispatcher.forward(request, response);
		} else {
			request.setAttribute("_ERROR", "Brak usera o id=" + id);
			RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/view/error.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	private Optional<User> getUserById(String id) {
		int userId = Integer.parseInt(id);
		return userDAO.getUserById(userId);
	}
}
