package batch;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Servlet implementation class Batch
 */
@WebServlet("/Batch")
public class Batch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Batch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter p=response.getWriter();
//		String s=request.getParameter("name");
//		p.print("<h1> Welcome "+s);
		
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		String a[]=request.getParameterValues("ck");
//		for(String i:a)
//		{
//			out.print(i);
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			out.print(a[i]);
//		}
		
//		PrintWriter out=response.getWriter();
//		String s=request.getHeader("User-Agent");
//		out.print(s);
		
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		HttpSession ss=request.getSession();
//		ss.setAttribute("user","kokila");
//		String s=(String) ss.getAttribute("user");
//		out.print(s);
		
//		PrintWriter out=response.getWriter();
//		try
//		{
//		int a=10,b=0;
//		int c=a/b;
//		out.print(c);
//		}
//		catch(Exception e)
//		{
//			out.print(e);
//		}
		
//		PrintWriter out=response.getWriter();
//		response.setContentType("text/html");
//		HttpSession ss=request.getSession(true);
//		Date create=new Date(ss.getCreationTime());
//		Date last=new Date(ss.getLastAccessedTime());
//		
//		String user="kokila";
//		String msg;
//		if(ss.isNew())
//		{
//			msg="Welcome...";
//		}
//		else
//		{
//			msg="Welcome back...";
//		}
//		
//		
//		out.println("<h2>"+msg+" "+user+"<h1>");
//		out.println("<h2> create:"+create+"<h2>");
//		out.println("<h2> Last Occurence:"+last+"<h2>");
		
//		response.sendRedirect("batch2.html");
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		response.setIntHeader("refresh", 10);
		Format df=new SimpleDateFormat("dd.MM.yyyy.hh.mm.ss");
		Date d=new Date();
		String s=df.format(d);
		out.print("<h1>"+d+"<h1>");
		
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
