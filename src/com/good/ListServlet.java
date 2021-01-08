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
 * Servlet implementation class ListServlet
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 对于get请求，tmomcat8.x版本已经默认utf-8编码了
		ServletContext context = request.getServletContext();
		if(context.getAttribute("goods") == null) {
			List<Good> list = new ArrayList<Good>();
			list.add(new Good(1001,"格力空调","家用电器",3000f,"铂金气质，空静合一"));
			list.add(new Good(1002,"LV","服装",18888f,"生活不是一场旅行，每场旅行都会有终结"));
			context.setAttribute("goods", list);		
		}
		request.getRequestDispatcher("/goods.jsp").forward(request, response);
	}

}
