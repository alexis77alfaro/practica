<html>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="http://code.jquery.com/jquery-latest.js">
</script>

<script type="text/javascript">
    $(document).ready(function(){
      //  $('#carga').click(function(event){
            var btn=$('#carga').val();
            $.post('ServeleteController',{

            },function(respose){
                let datos=JSON.parse(respose);
                console.log(datos);

                var tablad=document.getElementById('tabladatos');
                for(let item of datos){
                    tabladatos.innerHTML+=`
                    <tr>
                    <td>${item.id}</td>
                    <td>${item.nombreProducto}</td>
                    <td>${item.precioProducto}</td>
                    <td>${item.cantidadProducto}</td>
                    <td>${item.totalProducto}</td>
                    <td>
                    <a href="ServeleteController?btn=Eliminar&idEliminar=${item.id}"class="btn btn-warning">Eliminar</a> 
                    <a href="funciones.jsp?idBus=${item.id}&Npr=${item.nombreProducto}&preciopr=${item.precioProducto}&catidadpr=${item.cantidadProducto}&total=${item.totalProducto}"class="btn btn-danger">Actualizar</a> 
                    </td>
                     
                    </tr>
                    
                    `
                }
           // });

        });

    }) ;

</script>


<body>
<h2>Agregando datos</h2>
<a href="funciones.jsp"class="btn btn-info">AGREGAR</a>

  
 <table class="table table-dark" id="tabladatos">
     <thead>
         <th>Id</th>
         <th>nombre</th>
         <th>Precio</th>
         <th>Cantidad</th>
         <th>Total</th>
         <th>Opciones</th>

     </thead>

     <tbody>

     </tbody>

 </table>
  
  



   

</body>
</html>
 