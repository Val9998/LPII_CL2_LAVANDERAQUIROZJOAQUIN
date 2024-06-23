package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoCL2;
import model.TblProductocl2;

public class ClassProductoCL2Imp implements IProductoCL2{

	@Override
	public void RegistrarProductoCL2(TblProductocl2 producto) {
		//establecer conexion con la unidad de persistencia...
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_LAVANDERAQUIROZJOAQUIN");
			    //permite gestionar entidades
				EntityManager em=fabr.createEntityManager();
				//iniciar transaccion
				em.getTransaction().begin();
				//registramos
				em.persist(producto);
				//emitimos mensaje por consola
				System.out.println("producto registrado en la BD correctamente");
				//confirmamos
				em.getTransaction().commit();
				//cerramos la transaccion
				em.close();
			}  //fin del metodo registrar...
		
	

	@Override
	public List<TblProductocl2> ListadoProductoCL2() {
		//esatblecemos la conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_LAVANDERAQUIROZJOAQUIN");
		//gestionamos las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la trancision
		em.getTransaction().begin();
		//recuperamos los productos de la bd
		List<TblProductocl2> listadoproductos=em.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
		//confirmamos transaccion
		em.getTransaction().commit();
		//cerramos
		em.close();
		return listadoproductos;
	}//fin del metodo listado producto


}
