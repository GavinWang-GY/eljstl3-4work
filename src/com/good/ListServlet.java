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
		// ����get����tmomcat8.x�汾�Ѿ�Ĭ��utf-8������
		ServletContext context = request.getServletContext();
		if(context.getAttribute("goods") == null) {
			List<Good> list = new ArrayList<Good>();
			list.add(new Good(1001,"�����յ�","���õ���",3000f,"�������ʣ��վ���һ"));
			list.add(new Good(1002,"LV","��װ",18888f,"�����һ�����У�ÿ�����ж������ս�"));
			context.setAttribute("goods", list);		
		}
		request.getRequestDispatcher("/goods.jsp").forward(request, response);
	}

}
