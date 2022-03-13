package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Processos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Servlet implementation class Cadastro
 */
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("DanielAdvogados");
	//private static EntityManager entityManager = entityManagerFactory.createEntityManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("cadastro.jsp");
		Processos proc = new Processos();
		proc.setTitulo("teste");
		proc.setRequerentes("REQ teste");
		proc.setNumProcesso("123NUM");
		proc.setNumPedidoInternacional("internacional123");
		proc.setDataPublicacao("2020-10-31");
		
		/*
		entityManager.getTransaction().begin();
		entityManager.persist(proc);
		entityManager.getTransaction().commit();*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
