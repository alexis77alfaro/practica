<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<%
String idBus=request.getParameter("idBus");
String nombre=request.getParameter("Npr");
String precio=request.getParameter("preciopr");
String cantidad=request.getParameter("catidadpr");
String total1=request.getParameter("total");

%>
<body>
<form action="ServeleteController">
<table align="center">
    
 <thead></thead>
    <tbody>
        <tr>
            <td>
                 
                    <p>id</p><input type="text" name="id" id="carga" value="<%
                    =idBus;
                    %>">
                    <p>Nombre Producto</p> <input type="text" name="nproductos" id="Nproductos" value="<%=nombre%>">
                    <p>Precio producto</p> <input type="text" name="pproductos" id="Pproductos" value="<%=precio%>">
                    <p>Cantidad de productos</p> <input type="text" name="cproductos" id="Cproductos" value="<%=cantidad %>">
                    <p>Total productos</p> <input type="text" name="tproductos" id="Tproductos" value="<%=total1%>">
                    <br>
                     <br>
                     
                 

              
            </td> 
        </tr>
    </tbody>
</table>  
<input type="submit" name="btn" value="Guardar" class="btn btn-info" name="save">
<input type="submit" name="btn" value="Actualizar" class="btn btn-info" name="update">
<input type="submit" name="btn" value="Actualizar" class="btn btn-info" name="delete">
</form>

</body>
</html>