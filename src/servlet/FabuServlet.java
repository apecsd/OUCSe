package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.PrimitiveIterator.OfDouble;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.FabuDaoImpl;
import dao.impl.ProductDaoImpl;
import model.Fabu;
import model.Product;

/**
 * Servlet implementation class FabuServlet
 */
@WebServlet("/FabuServlet")
public class FabuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FabuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = -1;
		request.setCharacterEncoding("UTF-8");
		String issueNameString = request.getParameter("proName");
		System.out.println(issueNameString);
		
		String tidString = request.getParameter("classifyId");
		System.out.println(tidString);
		int tid = Integer.parseInt(tidString);
		
		String sellOrPurStr = request.getParameter("type");
		System.out.println(sellOrPurStr);
		int sellOrPur = Integer.parseInt(sellOrPurStr);
		
		String priceString = request.getParameter("proPrice");
		float price = Float.parseFloat(priceString);
		System.out.println(priceString);
		
		String descString = request.getParameter("proDesc");
		System.out.println(descString);
		
		String sellNumString = request.getParameter("proHassum");
		int sellNum = Integer.parseInt(sellNumString);
		System.out.println(sellNum);
		
		String pictureSRC = request.getParameter("proPictureFile");
		System.out.println(pictureSRC);
		
		Fabu fabu = new Fabu();
		FabuDaoImpl fabuDaoImpl = new FabuDaoImpl();
		int result = -1;
		if(sellOrPur == 0) {//求购
			 Product product = new Product();
			  ProductDaoImpl productDaoImpl = new ProductDaoImpl();
			  product.setCurrentNum(sellNum);
			  product.setFabuTime("2019/12/29");
			  product.setIntroduction(descString);
			  product.setIssueName(issueNameString);
			  product.setPictureSRC(pictureSRC);
			  product.setPrice(price);
			  product.setSid("17020031108");
			  product.setTid(tid);
			  try {
				pid = productDaoImpl.addProduct(product);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fabu.setPid(pid);
			fabu.setSellOrPur(sellNum);
			fabu.setSid("17020031108");
			fabu.setSum(sellNum);
			fabu.setTid(tid);
			try {
				result = fabuDaoImpl.addFabu(fabu);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(result == 1) 
				System.out.println("插入发布成功！");
		}
		else if(sellOrPur == 1) {//求售
		  Product product = new Product();
		  ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		  product.setCurrentNum(sellNum);
		  product.setFabuTime("2019/12/29");
		  product.setIntroduction(descString);
		  product.setIssueName(issueNameString);
		  product.setPictureSRC(pictureSRC);
		  product.setPrice(price);
		  product.setSid("17020031108");
		  product.setTid(tid);
		  try {
			pid = productDaoImpl.addProduct(product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    fabu.setPid(pid);
			fabu.setSellOrPur(sellNum);
			fabu.setSid("17020031108");
			fabu.setSum(sellNum);
			fabu.setTid(tid);
			try {
				result = fabuDaoImpl.addFabu(fabu);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(result == 1) 
				System.out.println("插入发布成功！");
		}
		request.getRequestDispatcher("/user_jsp/index1.jsp").forward(request, response);
	}

}
