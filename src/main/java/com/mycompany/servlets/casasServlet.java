package com.mycompany.servlets;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.mycompany.daos.InmobiliariaDAO;
import com.mycompany.models.Inmobiliaria;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mostrar_inmuebles")
public class casasServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    InmobiliariaDAO inmobiliariaDAO = new InmobiliariaDAO();
    String tipo = request.getParameter("tipo");

    if (tipo != null && !tipo.isEmpty()) {
      Inmobiliaria inmueble = inmobiliariaDAO.seleccionarUsuarioPorTipo(tipo);

      // Pasar el usuario al archivo JSP 
      request.setAttribute("inmuebles", Collections.singletonList(inmueble));
    } else {
      List<Inmobiliaria> inmuebles = inmobiliariaDAO.seleccionarTodosInmuebles();
      // Pasar la lista de usuarios al archivo JSP
      request.setAttribute("inmuebles", inmuebles);
    }

    request.getRequestDispatcher("/mostrar_inmuebles.jsp").forward(request, response);
  }
}
