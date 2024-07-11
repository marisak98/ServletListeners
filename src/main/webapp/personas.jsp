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
     <form class="row g-3 needs-validation" novalidate action="conexion" method="POST">
    <div class="col-md-4">
        <label for="nombre" class="form-label">Nombre</label>
        <input type="text" class="form-control" id="nombre" name="nombre" required>
        <div class="valid-feedback">
            Looks good!
        </div>
    </div>
    <div class="col-md-4">
        <label for="apellido" class="form-label">Apellido</label>
        <input type="text" class="form-control" id="apellido" name="apellido" required>
    </div>
    <div class="col-md-4">
        <label for="cedula" class="form-label">Cedula</label>
        <input type="text" class="form-control" id="cedula" name="cedula" required>
        <div class="valid-feedback">
            Looks good!
        </div>
    </div>
    <div class="col-md-4">
        <label for="direccion" class="form-label">Direccion</label>
        <input type="text" class="form-control" id="direccion" name="direccion" required>
        <div class="valid-feedback">
            Looks good!
        </div>
    </div>
    <div class="col-md-4">
        <label for="telefono" class="form-label">Telefono</label>
        <input type="text" class="form-control" id="telefono" name="telefono" required>
        <div class="valid-feedback">
            Looks good!
        </div>
    </div>
    <div class="col-md-4">
        <label for="correo" class="form-label">Correo</label>
        <input type="text" class="form-control" id="correo" name="correo" required>
        <div class="valid-feedback">
            Looks good!
        </div>
    </div>
    <div class="col-12">
        <input class="btn btn-primary" type="submit" value="Guardar" name="accion"/>
    </div>
</form>
</div>
   </body>
</html>
