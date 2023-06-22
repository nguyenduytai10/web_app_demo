package pxu.edu.vn.bai01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class HelloForm
*/
@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public HelloForm() {
	super();
	// TODO Auto-generated constructor stub
	}
	/**
	* @see HttpServlet#doGet(HttpServletRequest request,

	HttpServletResponse response)

	*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String title = "USING POST METHOD TO READ DATA";
	String docType = "<!doctype html public \"-//w3c//dtd html4.0 " + "transitional//en\">\n";
	out.println(docType +

	"<html>\n" +
	"<head><title>" + title + "</title></head>\n" +
	"<body bgcolor=\"#f0f0f0\">\n" +
	"<h1 align=\"center\">" + title + "</h1>\n" +
	"<ul>\n" +
	" <li><b>Text field</b>: "
	+ request.getParameter("txtName") + "\n" +
	" <li><b>hidden text field</b>: "
	+ request.getParameter("txtHidden") + "\n" +
	" <li><b>Check box</b>: "
	+ request.getParameter("Languages") + "\n" +
	" <li><b>List Box</b>: "
	+ request.getParameter("list-box") + "\n" +
	" <li><b>Radio Butto</b>: "
	+ request.getParameter("sex") + "\n" +
	
	
	"</ul>\n" +
	"</body></html>");
	}
}