  <%@include file="Header.jsp"%>

<table align = "center" class = "table table-bordered">
	<tr>
		<td colspan ="5"><h2 align = "center">Your Order</h2></td>
	</tr>	
	<tr>
		<td>ProductName</td>
		<td>Price</td>
		<td>Quantity</td>
		<td>Total Price</td>
	</tr>
	<c:forEach items="${cartItem }" var="cartItem">
	<form action="<c:url value="/updateCartItem/${cartItem.cartItemId }"/>" method="get">
	<tr>
		<td>${cartItem.productName }</td>
		<td>${cartItem.price }</td>
		<td><input type = "text" value="${cartItem.quantity}" name="quantity" required></td>
		<td>${cartItem.quantity * cartItem.price }</td>
	</tr>
	</form>
	</c:forEach>
	<tr>
		<td colspan="4" align="center">Total</td>
		<td colspan="2">${grandTotal }</td>
	</tr>
	<tr>
		<td colspan="3"><a href="<c:url value="/cart"/>" class= "btn btn-info" >Move to Cart</a></td>
		<td colspan="3"><a href="<c:url value="/payment"/>" class= "btn btn-info" >Make a Payment</a></td>
	</tr>
	

</table>
<%@include file="Footer.jsp"%>