<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link type="text/css" href="./public/styles/style.css" rel="stylesheet" />
    <link type="text/css" href="./public/styles/div.css" rel="stylesheet" />
    <script defer src="./public/scripts/script.js"></script>
    <title>La granja</title>
  </head>
  <body>
    <div id="cierreCompra">
      <h1 class="Titulos2">¡COMPRA EXITOSA!</h1>
      <p class="parrafos">
        Recuerde que tiene un plazo de 72 horas para realizar el pago con el
        banco asociado, de lo contrario generará una multa por incumpliendo
      </p>
      <button class="btAtras" onclick="mostrar('inicio', 'cierreCompra')">
        <img src="public/images/casa.png" class="imagenAtras" />
      </button>
    </div>
  </body>
</html>
<!-- Cierre exitoso de compra -->
