<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Servlet Context</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="./styles/bootstrap.min.css">
<style>
.full-screen{
  height: 100vh;
}
</style>
  </head>
  <body>
    <div class="container full-screen flex justify-content-center align-items-center">
    <h1>Bienvenido a mi applicacion Web</h1>
    <p class="lead">Nombre de la applicacion: <%=application.getAttribute("projectjd")%></p>
    <p >Admin Email: <%=request.getAttribute("adminEmail")%></p>
    <div style="height: 100px width: 100px">
    <img alt="Javaimg" src="https://raw.githubusercontent.com/cat-milk/Anime-Girls-Holding-Programming-Books/master/Java/Kurumizawa_Satanichia_Intro_To_Java_Programming.png">
    </div>
    </div>
      </body>
</html>
