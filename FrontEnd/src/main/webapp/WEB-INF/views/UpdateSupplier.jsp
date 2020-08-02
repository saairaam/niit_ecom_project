<%@include file="Header.jsp"%>
<html>
<body>
<h2>Welcome to Category Page!</h2>
<form action="<c:url value="/updateSupplier"/>" method="post">

	<table align="center" class="table-bordered">
		<tr>
			<td>Supplier ID</td>
			<td><input type="text" name="supplierID" value="${supplierData.supplierID }"/ readonly></td>
		</tr>
		<tr>
			<td colspan ="2">Supplier Detail</td>
		</tr>
		<tr>
			<td>Supplier Name</td>
			<td><input type="text" name="supplierName" value="${supplierData.supplierName }"/></td>
		</tr>
		<tr>
			<td>Supplier Address</td>
			<td><input type="text" name="supplierAddress" value="${supplierData.supplierAddress }"/></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="Update Supplier"/></td>
		</tr>
	</table>
</form>
<%@include file="Footer.jsp"%>