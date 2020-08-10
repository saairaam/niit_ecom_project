<%@include file="Header.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="addProduct" modelAttribute="product" method="post" enctype="multipart/form-data"> 
<table align ="center">
	<tr>
		<td colspan="2">Product Detail</td>
	</tr>
	
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
	<tr>
		<td colspan="2">
			<center>
				<input type="submit" value="Insert"/>
			</center>
		</td>
	</tr>
</table>
</form:form>
<div class="container">
 <table align="center" class="table table-dark table-striped" class="table table-bordered">
	<tr>
		<td colspan = "9"><center>Product Detail</center></td>
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
			<td><img src="<c:url value="/resources/images/${product.productId }.jpg"/>" class="img-thumbnail" height="50" width="50"/></td>
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