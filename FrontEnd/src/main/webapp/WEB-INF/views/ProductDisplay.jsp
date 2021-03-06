<%@include file="Header.jsp"%>

<div class ="container">
	<table align = "center" class = "table">
		<tr>
			<td rowspan ="10">
				<img src="<c:url value="C:/Users/saairaam prasad/git/niit_ecom_project/FrontEnd/src/main/resources/${productInfo.productId }.jpg"/>" height = "300" width ="200"/>
			</td>
		</tr>	
		<tr>
			<td>Product ID</td>
			<td>${productInfo.productId }</td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td>${productInfo.productName }</td>
		</tr>
		<tr>
			<td>Category</td>
			<td>${categoryName}</td>
		</tr>
		<tr>
			<td>Supplier Name</td>
			<td>${supplierName }</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${productInfo.productPrice }</td>
		</tr>
		<tr>
			<td>Stock</td>
			<td>${productInfo.productQuantity }</td>
		</tr>
		<tr>
			<td>Product Description</td>
			<td>${productInfo.productDescription }</td>
		</tr>
		<form action = "<c:url value="/addToCart/${productInfo.productId }"/>" method="GET">
			<tr>
				<td>Quantity</td>
				<td><input type="text" name="quantity" required/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add To Cart" class="btn btn-info"/></td>
			</tr>
		</form>
	</table>
</div>
<%@include file="Footer.jsp"%>