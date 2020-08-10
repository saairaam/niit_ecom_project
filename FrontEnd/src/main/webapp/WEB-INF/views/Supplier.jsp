<%@include file="Header.jsp"%>
<html>
<body>
<h2 align = "center">Welcome to Supplier Page!</h2>
<form action="addSupplier" method="post">

	<div class="container">    
        <div id="supplierform" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                    	<div class="panel-title" align="center"><b>Supplier Detail</div>
					</div>
					
					<div style="padding-top:30px" class="panel-body" >
						<form id="supplierform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon">Supplier Name</span>
                                        <input id="suppliername" type="text" class="form-control" name="supplierName" value="" placeholder="" required>
                                                                           
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon">Supplier Address</span>
                                        <input id="supplieraddress" type="text" class="form-control" name="supplierAddress" value="" placeholder="" required>
                                                                           
                            </div>
                            
                            <div style="margin-top:10px" class="form-group" align="center">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                      <input type="submit" class="btn btn-success" value="Submit">
                                      <input type="reset" class="btn btn-success" value="Reset">
                                    </div>
                            </div>
                                
                            </form>
			</div>
		</div>
	</div>

		
		
</form>
<div class="container">
<table align="center" class="table table-dark table-striped" class="table table-bordered">
	<tr>
		<td colspan = "5"><center>Supplier Detail</center></td>
	</tr>
	</tr>
	<tr>
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Supplier Address</td>
		<td>Edit</td>
		<td>Delete</td>
	</tr>
	<c:forEach items="${supplierList }" var = "supplier">
		<tr>
		
			<td>${supplier.supplierId }</td>
			<td>${supplier.supplierName }</td>
			<td>${supplier.supplierAddress }</td>
			<td><a href="<c:url value="/editSupplier/${supplier.supplierId}"/>" class="glyphicon glyphicon-pencil"></a></td>
			<td><a href="<c:url value="/deleteSupplier/${supplier.supplierId}" />" class="glyphicon glyphicon-trash"></a></td>
		</tr>
	</c:forEach>
</table>
</div>
</body>

</html>
