<%@include file="Header.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="addProduct" modelAttribute="product" method="post" enctype="multipart/form-data"> 
<div class="container">    
        <div id="product form" style="margin-top:50px;" class="mainbox col-md-8 col-md-offset-4 col-sm-8 col-sm-offset-4">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title" align="center"><b>product  Detail</div>

                    </div>
                    
                    <div style="padding-top:30px" class="panel-body" >

                        
                        
                            
<table align ="center">

		
	<tr>
		<td>Product Name</td>
		<td><form:input path="productName"/></td>
	</tr>
	
	<tr>
		<td>Price</td>
		<td><form:input path="productPrice"/></td>
	</tr>
	
	<tr>
		<td>Stock</td>
		<td><form:input path="productQuantity"/></td>
	</tr>
	
	<tr>
		<td>Category</td>
		<td><form:select path="categoryId">
				<form:option value="0" label="--Select List--"/>
				<form:options items="${categoryList }" />
			</form:select>
		</td>
	</tr>
	
	<tr>
		<td>Supplier</td>
		<td><form:select path="supplierId">
				<form:option value="0" label="--Select List--"/>
				<form:options items="${supplierList }"/>
		</form:select>
		</td>
	</tr>
	
	<tr>
		<td>Product Description</td>
		<td><form:input path="productDescription"/></td>
	</tr>
	<tr>
		<td>Product Image</td>
		<td><form:input type="file" path="productImage"/></td>
	</tr>
	
	
	
</table>

                            <div style="margin-top:10px" class="form-group" align="center">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                      <input type="submit" class="btn btn-success" value="Submit">
                                      <input type="reset" class="btn btn-success" value="Reset">
                                    </div>
                                </div>
                                </div>
                                </div>
                                </div>
                               </div>
                               </form>
</form:form>
<div class="container">
 <table align="center" class="table table-dark table-striped" class="table table-bordered">
	<tr>
		<td colspan = "9"><center> Product Detail</center></td>
	</tr>
	</tr>
	<tr>
		<td>Product Image</td>
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Product Desc</td>
		<td>Price</td>
		<td>Stock</td>
		<td>Edit</td>
		<td>Delete</td>
	</tr>
	<c:forEach items="${productList }" var = "product">
		<tr>
			<td><img src="<c:url value="C:/Users/saairaam prasad/git/niit_ecom_project/FrontEnd/src/main/resources/${product.productId}.jpg"/>" class="img-thumbnail" height="50" width="50"/></td>
			<td>${product.productId }</td>
			<td>${product.productName }</td>
			<td>${product.productDescription }</td>
			<td>${product.productPrice }</td>
			<td>${product.productQuantity }</td>
			
			<td><a href="<c:url value="/editProduct/${product.productId}"/>" class="glyphicon glyphicon-pencil"></a></td>
			<td><a href="<c:url value="/deleteProduct/${product.productId}" />" class="glyphicon glyphicon-trash"></a></td>
		</tr>
	</c:forEach>
</table>

</div>
<%@include file="Footer.jsp"%>