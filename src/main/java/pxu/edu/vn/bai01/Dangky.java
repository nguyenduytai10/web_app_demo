package pxu.edu.vn.bai01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dangky
 */
@WebServlet("/Dangky")
public class Dangky extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dangky() {
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
     	String title = "Welcome to web tai dep zai";
     	String docType = "<!doctype html public \"-//w3c//dtd html4.0 " + "transitional//en\">\n";
     	out.println(docType +

     	"<html>\n" +
     	"<head><title>" + title + "</title></head>\n" +
     	"<body bgcolor=\"#f0f0f0\">\n" +
     	"<h1 align=\"center\">" + title + "</h1>\n" +
     	"<ul>\n" +
     	" <li><b>USERNAME</b>: "
     	+ request.getParameter("username") + "\n" +
     	" <li><b>SEX</b>: "
     	+ request.getParameter("Sex") + "\n" +
     	" <li><b>EMAIL</b>: "
     	+ request.getParameter("Email") + "\n" +
     	" <li><b>PHONE NUMBE</b>: "
     	+ request.getParameter("phone numbe") + "\n" +
     	" <li><b>ACCOUNT NAME</b>: "
     	+ request.getParameter("Accont name") + "\n" +
     	" <li><b>PASSWORD</b>: "
     	+ request.getParameter("Password") + "\n" +
     	
     	
     	"</ul>\n" +
     	"</body></html>");
     	}
     }