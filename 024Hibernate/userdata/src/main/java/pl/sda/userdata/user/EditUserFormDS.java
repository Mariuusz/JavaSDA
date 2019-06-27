package pl.sda.userdata.user;

import pl.sda.userdata.database.JPAUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class EditUserFormDS extends HttpServlet {

	private UserDAO userDAO = new UserDAO();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Optional<User> optionalUser = getUserById(id);
		if (optionalUser.isPresent()) {
			request.setAttribute("user", optionalUser.get());

			RequestDispatcher requestDispatcher =
					getServletContext().getRequestDispatcher("/view/editUser.jsp");
			requestDispatcher.forward(request, response);
		} else {
			request.setAttribute("_ERROR", "Brak usera o id=" + id);
			RequestDispatcher requestDispatcher =
					getServletContext().getRequestDispatcher("/view/error.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	private Optional<User> getUserById(String id) {
		int userId = Integer.parseInt(id);
		return userDAO.getUserById(userId);
	}
}
