package com.mycompany.servlets;

import com.mycompany.daos.InmobiliariaDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.mycompany.models.Inmobiliaria;

@WebServlet("/formulario-registro-inmueble")
public class inmuebleServlet extends HttpServlet {

    private InmobiliariaDAO inmobiliariaDAO;

    public inmuebleServlet() {
        this.inmobiliariaDAO = new InmobiliariaDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int matricula = Integer.parseInt(request.getParameter("matricula"));
        String tipo = request.getParameter("tipo");
        String pais = request.getParameter("pais");
        String direccion = request.getParameter("direccion");
        String descripcion = request.getParameter("descripcion");
        double precio = Double.parseDouble(request.getParameter("precio"));

        Inmobiliaria nuevoInmueble = new Inmobiliaria(matricula, tipo, pais, direccion, descripcion, precio);
        System.out.println("He llegado hasta aca");
        inmobiliariaDAO.insertarInmueble(nuevoInmueble);
        System.out.println(nuevoInmueble.getTipo());
        HttpSession session = request.getSession();
        session.setAttribute("tipo", nuevoInmueble.getTipo());
        session.setAttribute("matricula", nuevoInmueble.getMatricula_inmueble());

        // Request es el lugar donde se guardan los datos
        request.getSession().setAttribute("tipo", tipo);
        request.getSession().setAttribute("matricula", matricula);

        // Redireccionamos a la página de registro exitoso
        response.sendRedirect("registro-exitoso.inmueble.jsp");
    }

}
