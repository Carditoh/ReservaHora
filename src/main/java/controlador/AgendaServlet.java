package controlador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import entidad.IngresoDao;
import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class AgendaServlet
 */
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaServlet() {
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
		String rutDuenho, nombreMascota, hora, fecha, msg="";
		int idMascota;
		
		idMascota = Integer.parseInt(request.getParameter("idMascota"));
		rutDuenho = request.getParameter("rutDuenho");
		nombreMascota = request.getParameter("nombreMascota");
		hora = request.getParameter("hora");
		fecha = request.getParameter("fecha");
		
		try {
			if(IngresoDao.ingresarAgenda(idMascota,rutDuenho,nombreMascota,hora,fecha)>0) {
				msg = "-->Agenda ingresada correctamente<!--";
			} else {
				msg = "-->Ha ocurrido un error al ingresar, revise los campos<!--";
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		msg = msg.toUpperCase();
		
		RequestDispatcher despachador = request.getRequestDispatcher("/agregarAgenda.jsp");
		
		request.setAttribute("mensaje", msg);
		
		despachador.forward(request, response);
	}

}
