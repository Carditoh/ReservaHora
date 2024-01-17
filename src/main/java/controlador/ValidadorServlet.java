package controlador;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import entidad.LoginDao;

/**
 * Servlet implementation class ValidadorServlet
 */
public class ValidadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidadorServlet() {
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
		String username, password, msg="<!-- null -->";
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		
		try {
			if(LoginDao.validar(username,password)>0) {
				msg = "<h2>logeado</h2><br/><br/>";
			} else {
				msg = "<h2>usuario y/o contraseña incorrectos o vacios</h2>";
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		msg = msg.toUpperCase();
		
		RequestDispatcher despachador = request.getRequestDispatcher("/mensaje.jsp");
		
		request.setAttribute("mensaje", msg);
		
		despachador.forward(request, response);
	}

}
