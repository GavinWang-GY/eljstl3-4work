package com.good;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddGoodServlet
 */
@WebServlet("/add")
public class AddGoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String gNo = request.getParameter("goodsId");
		String gName = request.getParameter("goodsName");
		String gType = request.getParameter("goodsType");
		String gPrice = request.getParameter("price");
		String remark = request.getParameter("description");
		ServletContext context = request.getServletContext();
		List<Good> list = (List)context.getAttribute("goods");
		list.add(new Good(Integer.parseInt(gNo),gName,gType,Float.parseFloat(gPrice),remark));
		context.setAttribute("goods", list);
		request.getRequestDispatcher("/goods.jsp").forward(request, response);;		
	}

}
