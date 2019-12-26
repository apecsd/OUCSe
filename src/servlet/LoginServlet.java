package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.impl.UserDaoImpl;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid = request .getParameter("sid");
		String password = request.getParameter("password");
		User user = new User();
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		user = userDaoImpl.findByidAndPwd(sid, password);
		HttpSession session = request.getSession();
		if(user!=null) {
			session.setAttribute("sid", user.getSid());
			session.setAttribute("userName",user.getUserName());
			//response.sendRedirect("index.jsp");
			
		}
		else {
			response.sendRedirect("login.jsp");
		}
			
	
	}
}
