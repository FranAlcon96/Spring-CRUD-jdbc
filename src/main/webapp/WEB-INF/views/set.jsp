<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
 <title>TP6</title>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
  <div class="row-fluid">
   <div class="col-md-6">
    <h4 class="text-center">Modificar Empleado </h4>
    <h5 class="text-center">Introduzca el id del empleado a modificar.</h5>
    <hr>
    <form method="post" action="empformset" commandName="set">
     <div class="form-group">
      <label for = "id">Id: </label>
      <input name="id" class="form-control"/>
     </div>
     <div class="form-group">
      <label for = "nombre">Nombre: </label>
      <input name="nombre" class="form-control"/>
     </div>
     <div class="form-group">
      <label for = "profesion">Profesión: </label>
      <input name="profesion" class="form-control"/>
     </div>
     <div class="form-group">
      <label for ="departamento">Departamento:</label>
      <input name="departamento" class="form-control"/>
     </div>
     <div class="form-group">
      <input type="submit" value="Guardar" class="btn btn-success"/>
     </div>
    </form>
   </div>
  </div>
 </div>
</body>
</html>