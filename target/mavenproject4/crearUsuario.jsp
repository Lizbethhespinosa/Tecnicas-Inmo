<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html lang="es">
  <head>
    <link
      type="text/css"
      href="./public/styles/crearUsuario.css"
      rel="stylesheet"
    />
    <script defer src="./public/scripts/script.js"></script>
    <title>La granja</title>
  </head>
  <body>
    <div class="inicio">
      <h1 class="titulosIngreso">Crear usuario</h1>
      <div class="opciones">
        <form action="formulario-registro" method="post">
          <input
            type="text"
            name="primer_nombre"
            placeholder="Nombre"
            class="input"
            required
          />
          <input
            type="text"
            name="primer_apellido"
            placeholder="Apellido"
            class="input"
            required
          />
          <input
            type="text"
            name="documento"
            placeholder="Cédula"
            class="input"
            required
          />
          <input
            type="text"
            name="usuario"
            placeholder="Usuario"
            class="input"
            required
          />
          <input
            type="password"
            name="contrasenha"
            placeholder="Contraseña"
            class="input"
            required
          />
          <button class="btGeneral" type="submit">Registrar</button>
          <a href="ingreso.jsp">
          <button class="btAtras">
            <img src="public/images/atras.png" class="imagenAtras" />
          </button>
        </a>
        </form>
      </div>
    </div>
  </body>
</html>
<!--Crear usuario -->
