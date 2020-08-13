<%@include file="Header.jsp"%>
<html>
<body>
<h2>Welcome to Product Page!</h2>
<form action="<c:url value="/updateProduct"/>" method="POST">

	<table align="center" class="table-bordered">
		<tr>
			<td>Product ID</td>
			<td><input type="text" name="productID" value="${productData.productId }"/></td>
		</tr>
		<tr>
			<td colspan ="2">Product Detail</td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><input type="text" name="productName" value="${productData.productName }"/></td>
		</tr>
		<tr>
			<td>Product Desc</td>
			<td><input type="text" name="productDesc" value="${productData.productDescription }"/></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><input type="text" name="price" value="${productData.productPrice }"/></td>
		</tr>
		<tr>
			<td>Stock</td>
			<td><input type="text" name="quantity" value="${productData.productQuantity }"/></td>
		</tr>
		<tr>
			<td>image</td>
			<td><input type="file" name="image" value="${productData.productImage }"/></td>
		</tr>
		<tr>
			<td colspan="3">
			<input type="submit" value="Update Product"/></td>
		</tr>
	</table>
</form>
<%@include file="Footer.jsp"%>