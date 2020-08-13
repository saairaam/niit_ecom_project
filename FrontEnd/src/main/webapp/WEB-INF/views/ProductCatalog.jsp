<%@include file="Header.jsp"%>

<div class ="container">
<div class = "row">
<c:forEach items="${productList }" var="product">
		<div class = "col-md-4 col-xs-12 col-sm-6">
			<div class = "thumbnail">
			<h4>
			<span data-toggle ="tooltip" title="Bootstrap version">${product.productName} &nbsp;RS.${product.productPrice }/-</span>
			</h4>
			<img src="<c:url value="C:/Users/saairaam prasad/git/niit_ecom_project/FrontEnd/src/main/resources/${product.productId }.jpg"/>" class="img-thumbnail" height="100" width="100"/>
			<a href="<c:url value="/productDisplay/${product.productId }"/>"class = "btn btn-primary col-xs-12" role="button">View</a>
			<div class = "clearfix"></div>
			</div>
		</div>
</c:forEach>
</div>

</div>
<%@include file="Footer.jsp"%>