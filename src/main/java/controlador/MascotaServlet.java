package controlador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import entidad.IngresoDao;
import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class MascotaServlet
 */
public class MascotaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MascotaServlet() {
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
		String rutDuenho, tipoMascota, nombreMascota, msg="";
		int edad;
		
		rutDuenho = request.getParameter("rutDuenho");
		tipoMascota = request.getParameter("tipoMascota");
		edad = Integer.parseInt(request.getParameter("edad"));
		nombreMascota = request.getParameter("nombreMascota");
		
		try {
			if(IngresoDao.ingresarMascota(rutDuenho, tipoMascota, edad ,nombreMascota)>0) {
				msg = "-->Mascota ingresada correctamente<!--";
			} else {
				msg = "-->Ha ocurrido un error al ingresar, revise los campos<!--";
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		msg = msg.toUpperCase();
		
		RequestDispatcher despachador = request.getRequestDispatcher("/agregarMascota.jsp");
		
		request.setAttribute("mensaje", msg);
		
		despachador.forward(request, response);
	}

}
