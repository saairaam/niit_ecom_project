<%@include file="Header.jsp"%>

<table align = "center" class = "table table-bordered">
	
	<tr>
		<td>ProductName</td>
		<td>Price</td>
		<td>Quantity</td>
		<td>Total Price</td>
		<td>Edit</td>
		<td>Delete</td>
	</tr>
	<c:forEach items="${cartItem }" var="cartItem">
	<form action="<c:url value="/updateCartItem/${cartItem.cartItemId }"/>" method="get">
	<tr>
		<td>${cartItem.productName }</td>
		<td>${cartItem.price }</td>
		<td><input type = "text" value="${cartItem.quantity}" name="quantity" required></td>
		<td>${cartItem.quantity * cartItem.price }</td>
		<td><input type = "submit" value="Edit" class="glyphicon glyphicon-pencil"></td>
		<td><a href="<c:url value="/deleteCartItem/${cartItem.cartItemId}" />"><span class="glyphicon glyphicon-trash"></span></a></td>
		
	</tr>
	</form>
	</c:forEach>
	<tr>
		<td colspan="4" align="center">Total</td>
		<td colspan="2">${grandTotal }</td>
	</tr>
	<tr>
		<td colspan="3"><a href="<c:url value="/productCatalog"/>" class= "btn btn-info" >Continue Shopping</a></td>
		<td colspan="3"><a href="<c:url value="/checkout"/>" class= "btn btn-info" >Proceed to Payment</a></td>
	</tr>
	

</table>
<%@include file="Footer.jsp"%>