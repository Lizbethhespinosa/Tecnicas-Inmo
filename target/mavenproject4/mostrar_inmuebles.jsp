<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <link
      type="text/css"
      href="./public/styles/mostrar_inmuebles.css"
      rel="stylesheet"
    />
    <title>Casas</title>
  </head>
  <body>
    <div class="inicio">
      <h1>Oferta de inmuebles</h1>

      <table class="tabla">
        <tr>
          <th>Matrícula</th>
          <th>Tipo</th>
          <th>País</th>
          <th>Dirección</th>
          <th>Descripción</th>
          <th>Precio</th>
        </tr>
        <tbody>
          <!-- var, lista servlet  -->
          <c:forEach items="${inmuebles}" var="inmueble">
            <tr>
              <td><c:out value="${inmueble.matricula_inmueble}" /></td>
              <td><c:out value="${inmueble.tipo}" /></td>
              <td><c:out value="${inmueble.pais}" /></td>
              <td><c:out value="${inmueble.direccion}" /></td>
              <td><c:out value="${inmueble.descripcion}" /></td>
              <td><c:out value="${inmueble.precio}" /></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
        <form action="mostrar_inmuebles" method="get">
          <input type="text" name="tipo" placeholder="Tipo" class="input"/>
          <input type="submit" value="Buscar" class="btGeneral" />
        </form>
      <a href="index.jsp">
        <button class="btAtras">
          <img src="public/images/atras.png" class="imagenAtras" />
        </button>
      </a>
    </div>
  </body>
</html>
