package controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddNumTotal;

/**
 * Servlet implementation class getTotalServlet
 */
@WebServlet("/getTotalServlet")
public class getTotalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTotalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userNum1 = request.getParameter("userNum1");
		String userNum2 = request.getParameter("userNum2");
		String userNum3 = request.getParameter("userNum3");
		String userNum4 = request.getParameter("userNum4");
		
		AddNumTotal userNum = new AddNumTotal(Integer.parseInt(userNum1),Integer.parseInt(userNum2),Integer.parseInt(userNum3),Integer.parseInt(userNum4));
		
		request.setAttribute("userNumPouch", userNum);
				
		getServletContext().getRequestDispatcher("/addResult.jsp").forward(request, response);
		
		/*****
		 * PrintWriter writer = response.getWriter();
		 * writer.println("You entered this four numbers: " + userNum1.toString() + " " + userNum2.toString() + " " + userNum3.toString() + " " + userNum4.toString());
		 * writer.println(userNum.toString());
		 * writer.close();
		*****/
	}

}
