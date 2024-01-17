package controlador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import entidad.IngresoDao;
import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class DuenhoServlet
 */
public class DuenhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DuenhoServlet() {
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
		String rut, nombre, apellido, direccion, correo, telefono, nombreMascota, msg="";
		
		rut = request.getParameter("rut");
		nombre = request.getParameter("nombre");
		apellido = request.getParameter("apellido");
		direccion = request.getParameter("direccion");
		correo = request.getParameter("correo");
		telefono = request.getParameter("telefono");
		nombreMascota = request.getParameter("nombreMascota");
		
		try {
			if(IngresoDao.ingresarDuenho(rut,nombre,apellido,direccion,correo,telefono,nombreMascota)>0) {
				msg = "-->Dueño ingresado correctamente<!--";
			} else {
				msg = "-->Ha ocurrido un error al ingresar, revise los campos<!--";
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		msg = msg.toUpperCase();
		
		RequestDispatcher despachador = request.getRequestDispatcher("/agregarDuenho.jsp");
		
		request.setAttribute("mensaje", msg);
		
		despachador.forward(request, response);
	}

}
