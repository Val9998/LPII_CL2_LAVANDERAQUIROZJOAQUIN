package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoCL2Imp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProductoCL2
 */
public class ControladorProductoCL2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProductoCL2() {
        super();
        // TODO Auto-generated constructor stub
    }	//fin del controldaor

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}	//fin del metodo doget

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//recuperamos los valores del formulario
		String nombre=request.getParameter("nombre");
		String precio=request.getParameter("precio");
		String precioven=request.getParameter("precioven");
		String estado=request.getParameter("estado");
		String descrip=request.getParameter("descrip");
		
		//instanciar las entidades
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoCL2Imp crud=new ClassProductoCL2Imp();
		//asignamos valores
		producto.setNombrecl2(nombre);
		producto.setPreciocompcl2(precio);
		producto.setPrecioventacl2(precioven);
		producto.setEstadocl2(estado);
		producto.setDescripcl2(descrip);
		//invocamos metodo registrar
		crud.RegistrarProductoCL2(producto);
		//redireccionamos
		request.getRequestDispatcher("/Listado.jsp").forward(request, response);
	}	//fin del metodo dopost
	

}	//fin de la clase
