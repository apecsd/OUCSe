package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.impl.ProductDaoImpl;
import dao.impl.ShoppingCartDaoImpl;
import model.Product;
import model.ShoppingCart;

/**
 * Servlet implementation class ShoppingCartServlet
 */
@WebServlet("/ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShoppingCartDaoImpl shoppingCartDaoImpl = new ShoppingCartDaoImpl();
	ProductDaoImpl productDaoImpl = new ProductDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

    protected void findBySid(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String sid = request.getParameter("sid");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		ArrayList<ShoppingCart> shoppingCartsList = shoppingCartDaoImpl.findShoppingCartsBySid(sid);
		request.setAttribute("shoppingCartsList", shoppingCartsList);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.getRequestDispatcher("/user_jsp/shop_cart.jsp").forward(request, response);
		
	}
    
    protected void add(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException, ServletException {
		String pidStr = request.getParameter("pid");
		String numStr = request.getParameter("num");
		int num = Integer.parseInt(numStr);
		int pid = Integer.parseInt(pidStr);
		HttpSession session = request.getSession();
		//Users users = (Users) session.getAttribute("users");
		PrintWriter out = response.getWriter();
//		if(users==null){
//			out.print("<script>" + "alert('请先登录');" + "window.location.href='" + request.getContextPath()
//			+ "/qiantai/login.jsp'" + "</script>");
//		}else {
//			
//		}
		Product product = new Product();
		product = productDaoImpl.findProductByPid(pid);
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setSid("17020031108");
		shoppingCart.setPid(pid);
		shoppingCart.setNum(num);
		shoppingCart.setIssueName(product.getIssueName());
		shoppingCart.setPrice(product.getPrice());
		shoppingCart.setTotalPrice(product.getPrice()*num);
		shoppingCart.setIntroduction(product.getIntroduction());
		shoppingCartDaoImpl.addShoppingCart(shoppingCart);
		System.out.println(shoppingCart.toString());
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.getRequestDispatcher("/user_jsp/index1.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String method = request.getParameter("method");
		if(method.equals("add")) {
			try {
				add(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(method.equals("findBySid")) {
			findBySid(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
