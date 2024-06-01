<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
  <head>
    <link type="text/css" href="./public/styles/venta.css" rel="stylesheet" />
    <title>La granja</title>
  </head>
  <body>
    <div class="inicio">
      <h1 class="Titulos2">Venta inmueble</h1>
      <h1 class="Titulos3">Datos del inmueble</h1>
      <div class="opciones">
        <form action="formulario-registro-inmueble" method="post">
          <input
            type="number"
            name="matricula"
            placeholder="matricula"
            class="input"
            required
          />
          <input
            type="text"
            name="tipo"
            placeholder="Tipo"
            class="input"
            required
          />
          <input
            type="text"
            name="pais"
            placeholder="Pais"
            class="input"
            required
          />
          <input
            type="text"
            name="direccion"
            placeholder="Direccion"
            class="input"
            required
          />
          <input
            type="text"
            name="descripcion"
            placeholder="Descripcion"
            class="input"
            required
          />
          <input
            type="number"
            name="precio"
            placeholder="Precio"
            class="input"
            required
          />
          <button class="btGeneral" type="submit">Ofertar</button>
        </form>
        <a href="index.jsp">
          <button class="btAtras">
            <img src="public/images/casa.png" class="imagenAtras" />
          </button>
        </a>
      </div>
    </div>
  </body>
</html>
<!-- Venta -->
