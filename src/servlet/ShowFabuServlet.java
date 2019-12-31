package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.FabuDaoImpl;
import dao.impl.ProductDaoImpl;
import model.Product;

/**
 * Servlet implementation class ShowFabuServlet
 */
@WebServlet("/ShowFabuServlet")
public class ShowFabuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowFabuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FabuDaoImpl fabuDaoImpl = new FabuDaoImpl();
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Product> proList = new ArrayList<Product>();
		try {
			arrayList = fabuDaoImpl.findpidBysid("17020031108");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i:arrayList) {
			Product product = new Product();
			try {
				product = productDaoImpl.findProductByPid(i);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			proList.add(product);
		}
		System.out.println(proList);
		request.setAttribute("proList", proList);
		request.getRequestDispatcher("/user_jsp/myproduct_list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
