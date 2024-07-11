<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Servlet Listeners</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./styles/bootstrap.min.css" />
<style>
.full-screen{
height: 100vh;
}
</style>
    </head>
    <body>
      <div class="container full-screen">
     <form class="row g-3 needs-validation" novalidate action="conexion" method="GET">
            <div class="col-md-4">
                <label for="validationCustom01" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="validationCustom01"  required>
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div class="col-md-4">
                <label for="validationCustom02" class="form-label">Apellido</label>
                <input type="text" class="form-control" id="validationCustom02"  required>
                
            </div>
             <div class="col-md-4">
                <label for="validationCustom01" class="form-label">Cedula</label>
                <input type="text" class="form-control" id="validationCustom01"  required>
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
           <div class="col-md-4">
                <label for="validationCustom01" class="form-label">Direccion</label>
                <input type="text" class="form-control" id="validationCustom01"  required>
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
             <div class="col-md-4">
                <label for="validationCustom01" class="form-label">Telefono</label>
                <input type="text" class="form-control" id="validationCustom01"  required>
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
           <div class="col-md-4">
                <label for="validationCustom01" class="form-label">Correo</label>
                <input type="text" class="form-control" id="validationCustom01"  required>
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
           
            <div class="col-12">
              <input class"btn btn-primary" type="submit" value="Guardar" name="accion"/>
            </div>
            <div class="col-12">
                <button class="btn btn-primary" type="submit">Submit form</button>
            </div>
            <div class="col-12">
                <button class="btn btn-primary" type="submit">Submit form</button>
            </div>
            <div class="col-12">
                <button class="btn btn-primary" type="submit">Submit form</button>
            </div>
            <div>
              <%
             out.println(request.getAttribute("cajitadb"));
              %>
            </div>
            <div>
              <%
             out.println(request.getAttribute("confirm"));
              %>
            </div>
            <div>
              <%
             out.println(request.getAttribute("error"));
              %>
            </div>
        </form>
</div>
   </body>
</html>
