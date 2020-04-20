package com.alexis.contoladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alexis.Dao.productodao;
import com.alexis.model.Producto;
import com.google.gson.Gson;

/**
 * Servlet implementation class ServeleteController
 */
public class ServeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Producto pr=new Producto();
		productodao prd=new productodao();
		
		String id=request.getParameter("id");
		String nombrepr=request.getParameter("nproductos");
		String preciopr=request.getParameter("pproductos");
		String cantidadpr=request.getParameter("cproductos");
		String totalpr=request.getParameter("tproductos");
		
		try{
			
		
		String action=request.getParameter("btn");
		
		if(action.equals("save")) {
                                             		
		pr.setIdproducto(Integer.parseInt(id));
		pr.setNombreProducto(nombrepr);
		pr.setPrecioProducto(Double.parseDouble(preciopr));
		pr.setCantidadProducto(Integer.parseInt(cantidadpr));
		pr.setTotalProducto(Double.parseDouble(totalpr));
		
		
		
		prd.agregarDatos(pr);
		}else if(action.equals("update")) {
			pr.setIdproducto(Integer.parseInt(id));
			pr.setNombreProducto(nombrepr);
			pr.setPrecioProducto(Double.parseDouble(preciopr));
			pr.setCantidadProducto(Integer.parseInt(cantidadpr));
			pr.setTotalProducto(Double.parseDouble(totalpr));
			
			prd.actualizar(pr);
			
		}
		
		
		else if(action.equals("delete")){
			
		}
		response.sendRedirect("index.jsp");
		pr.setIdproducto(Integer.parseInt(id));
		prd.eliminar(pr);
		
		}
		
catch(Exception e) {
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		productodao prdao=new productodao();  
		 
		
		Gson json=new Gson();
		
		 try {
			 
			 response.getWriter().append(json.toJson(prdao.productolista()));
			 
			 
		 }catch(Exception  e){
			 System.out.println(e);
		 }
		
	}

}
