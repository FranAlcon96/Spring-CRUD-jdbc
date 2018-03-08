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
   <h4 class="text-center">Empleados</h4>
   <hr>
   <table class="table table-bordered table-striped">
    <thead>
    <tr>
    <th>ID</th>
     <th>Nombre</th>
     <th>Profesión</th>
     <th>Departamento</th>
     <th>Eliminar</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="emp" items="${list}">
     <tr>
 	  <td>${emp.id}</td>
      <td>${emp.nombre}</td>
      <td>${emp.profesion}</td>
      <td>${emp.departamento}</td>
      <td><a href="delete/${emp.id}" class="btn btn-danger btn-xs"><i class="glyphicon glyphicon-trash"></i> Eliminar</a></td>
     </tr>
    </c:forEach>    
    </tbody>
   </table>
   <br />
   <a href="save" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i> Nuevo Empleado</a>
   <br>
   <br>
   <a href="set" class="btn btn-primary"><i class="glyphicon glyphicon-edit"></i> Modificar Empleado</a>
   <br>
   <br>
   
  </div>
 </div>
</div>
</body>
</html>