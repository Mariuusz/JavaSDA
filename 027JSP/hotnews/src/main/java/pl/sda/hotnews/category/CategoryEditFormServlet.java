package pl.sda.hotnews.category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class CategoryEditFormServlet extends HttpServlet {

	private CategoryDAO categoryDAO = new CategoryDAO();

	/**
	 * Prezentuje formularz edycji
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idStr = req.getParameter("id");
		int id = Integer.parseInt(idStr);
		Optional<Category> optionalCategory = categoryDAO.getById(id);

		if (optionalCategory.isPresent()) {
			Category category = optionalCategory.get();
			req.setAttribute("category", category);
			req.getRequestDispatcher("category/category_edit_form.jsp").forward(req, resp);
			return;
		}
	}

	/**
	 * Obsluguje edycje ketegori
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idStr = req.getParameter("id");
		int id = Integer.parseInt(idStr);
		String name = req.getParameter("name");

		if (null == name || name.isEmpty()) {
			req.setAttribute("_ERROR", "Nazwa nie może być pusta!");
			req.setAttribute("category", categoryDAO.getById(id).get());
			req.getRequestDispatcher("category/category_edit_form.jsp").forward(req, resp);
			return;
		}

		int result = categoryDAO.edit(id, name);
		if (result > 0) {
			req.setAttribute("_OK", "Wyedytowano kategorię: " + name);
			req.setAttribute("lastModified", id);
			req.setAttribute("categories", categoryDAO.getAll());
			req.getRequestDispatcher("category/categories.jsp").forward(req, resp);
			return;
		}
	}
}
