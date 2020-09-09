

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TodayServlet")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    public void init(ServletConfig config) throws ServletException {
		System.out.println("init test!!");
	}

	
	public void destroy() {
		System.out.println("destroy !!");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d HH:mm");
		String formatDateTime = now.format(formatter);
		
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		out.println("<form method='post' action='/firstweb/LifecycleServlet'>");
		out.println("name : <input type='text' name='name'><br>");
		out.println("<a href='index.html'");
		out.println("<li>main page");
	    out.println("</li>");
		out.println("</a>");
		out.println("<li>현재시간:" + formatDateTime);
		out.println("</li>");
		
		out.println("<input type='submit' value='ok'><br>");                                                 
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<h1> hello " + name + "</h1>");
		out.close();
		
		
	}

}
