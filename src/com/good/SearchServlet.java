package com.good;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		ServletContext context = request.getServletContext();
		List<Good> list = (List)context.getAttribute("goods");
		List<Good> searchList = new ArrayList<Good>();
		for(Good good:list) {
			String goodId = good.getgNo().toString();
			if(id.equals(goodId)) {
				searchList.add(good);
			}
		}
		context.setAttribute("searchList", searchList);
		request.getRequestDispatcher("/searchById.jsp").forward(request, response);
		
	}

}
