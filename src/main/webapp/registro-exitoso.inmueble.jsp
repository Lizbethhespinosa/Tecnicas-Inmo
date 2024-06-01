<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ page
import="jakarta.servlet.http.HttpSession" %>
<html>
  <head>
    <link
      type="text/css"
      href="./public/styles/registro-exitoso.inmueble.css"
      rel="stylesheet"
    />
    <title>Registro Exitoso</title>
    <script>
      // Función para redireccionar a la página principal
      function redireccionar() {
        setTimeout(function () {
          window.location.href = "index.jsp";
        }, 5000); // El tiempo se mide en ms, por lo que 5000 ms = 5 segundos
      }

      // Se llama a la función de redireccionar cuando la página se cargó completamente
      window.onload = redireccionar;
    </script>
  </head>
  <body>
    <div class="inicio">
      <h2>Registro de inmueble exitoso</h2>
      <% String tipo = (String) session.getAttribute("tipo"); int matricula =
      (int) session.getAttribute("matricula");%>
      <p>
        El inmueble con matrícula <strong><%= matricula %></strong> de tipo
        <strong><%= tipo %></strong> ha sido registrado exitosamente ✅
      </p>
      <p>Serás redirigido a la página principal en unos momentos...</p>
    </div>
  </body>
</html>
