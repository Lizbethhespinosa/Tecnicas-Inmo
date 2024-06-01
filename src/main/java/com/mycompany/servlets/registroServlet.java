package com.mycompany.servlets;

import com.mycompany.daos.ClienteDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import com.mycompany.models.Cliente;

/**
 *
 * @author lizbe
 */
@WebServlet("/formulario-registro")
public class registroServlet extends HttpServlet {

    private ClienteDAO clienteDAO;

    public registroServlet() {
        this.clienteDAO = new ClienteDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("primer_nombre");
        String apellido = request.getParameter("primer_apellido");
        String documento = request.getParameter("documento");
        String usuario = request.getParameter("usuario");
        int contraseña = Integer.parseInt(request.getParameter("contrasenha"));

        Cliente nuevoCliente = new Cliente(nombre, apellido, documento, usuario, contraseña);
        System.out.println("He llegado hasta aca");
        clienteDAO.insertarUsuario(nuevoCliente);
        System.out.println(nuevoCliente.getPrimer_nombre());
        HttpSession session = request.getSession();
        session.setAttribute("nombreUsuario", nuevoCliente.getPrimer_nombre());
        session.setAttribute("apellidoUsuario", nuevoCliente.getPrimer_apellido());

        // Request es el lugar donde se guardan los datos
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("apellido", apellido);

        // Redireccionamos a la página de registro exitoso
        response.sendRedirect("registro-exitoso.jsp");
    }

}
