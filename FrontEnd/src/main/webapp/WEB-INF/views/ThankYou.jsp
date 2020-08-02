<%@include file="Header.jsp"%>
<h2 align = "center">Thank You for purchasing!</h2>
<table align = "center" class = "table table-bordered">
	<tr>
		<td colspan ="5"><h2 align = "center">Receipt</h2></td>
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
		<td>${cartItem.quantity}</td>
		<td>${cartItem.quantity * cartItem.price }</td>
	</tr>
	</form>
	</c:forEach>
	<tr>
		<td colspan="4" align="center">Total</td>
		<td colspan="2">${grandTotal }</td>
	</tr>
	<tr>
		<td align = "center"><a href="<c:url value="/"/>" class= "btn btn-info" >Okay</a></td>
	</tr>
	
</table>
</body>
<%@include file="Footer.jsp"%>