<%@include file="Header.jsp"%>
<html>
<head></head>
<body>
<h2><center>Welcome ${sessionScope.username } !</center></h2>
<div class="row">
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="<c:url value="/productCatalog"/>">
        <img src="<c:url value="C:/Users/saairaam prasad/git/niit_ecom_project/FrontEnd/src/main/resources/images/81.jpg"/>" alt="Lights" style="width:100%">
        <div class="caption">
          <p><h2>Redmi</h2></p>
        </div>
      </a>
    </div>
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="<c:url value="/productCatalog"/>">
        <img src="<c:url value="C:/Users/saairaam prasad/git/niit_ecom_project/FrontEnd/src/main/resources/images/1.jpg"/>" alt="Lights" style="width:100%">
        <div class="caption">
          <p><h2>Realme</h2></p>
        </div>
      </a>
    </div>
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="<c:url value="/productCatalog"/>">
        <img src="<c:url value="C:/Users/saairaam prasad/git/niit_ecom_project/FrontEnd/src/main/resources/images/84.jpg"/>" alt="Lights" style="width:100%">
        <div class="caption">
          <p><h2>Vivo</h2></p>
        </div>
      </a>
    </div>
  </div>
 </div>

</body>
<%@include file="Footer.jsp"%>
</html>