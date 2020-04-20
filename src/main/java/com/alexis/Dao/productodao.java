package com.alexis.Dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alexis.model.Producto;; 


public class productodao {
	
	public List<Producto> productolista(){
		List<Producto> listapr=new ArrayList<>();
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("tutorial");
		em=emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			listapr=em.createQuery("from Producto").getResultList();
			em.getTransaction().commit();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return listapr ;
		
	}
	
	
	public void agregarDatos(Producto pr) {
		EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("tutorial");
		em=emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(pr);
		em.flush();
		em.getTransaction().commit();
		
	}
  public void actualizar(Producto pr) {
	  EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("tutorial");
		em=emf.createEntityManager();
		pr.getIdproducto();
		pr.getNombreProducto();
		pr.getIdproducto();
		pr.getCantidadProducto();
		pr.getTotalProducto();
		
		
		em.getTransaction().begin();
		em.merge(pr);
		em.flush();
		em.getTransaction().commit();
  }
  
  public void eliminar(Producto pr){
	  EntityManager em;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("tutorial");
		em=emf.createEntityManager();
		pr=em.getReference(Producto.class, pr.getIdproducto());
		em.getTransaction().begin();
		em.remove(pr);
		em.flush();
		em.getTransaction().commit();
	  
  }
}
