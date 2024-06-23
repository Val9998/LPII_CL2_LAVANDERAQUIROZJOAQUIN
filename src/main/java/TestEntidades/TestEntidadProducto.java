package TestEntidades;

import Dao.ClassProductoCL2Imp;
import model.TblProductocl2;

public class TestEntidadProducto {
	
	public static void main(String[] args) {
		//realizamos la respectiva instancia de las clases...
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoCL2Imp crud=new ClassProductoCL2Imp();
		//asignamos valores
		producto.setNombrecl2("mesa");
		producto.setPrecioventacl2(13);
		producto.setPreciocompcl2(12);
		producto.setEstadocl2("estadocl2");
		producto.setDescripcl2("descripcl2");

		//invocamos al metodo registrar...
		crud.RegistrarProductoCL2(producto);

	}   //fin del metodo main...

}//fin de la clase
