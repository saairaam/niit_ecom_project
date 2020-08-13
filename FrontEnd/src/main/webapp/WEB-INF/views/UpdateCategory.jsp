<%@include file="Header.jsp"%>
<html>
<body>
<h2>Welcome to Category Page!</h2>
<form action="<c:url value="/updateCategory"/>" method="post">

<div class="container">    
        <div id="categoryform" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title" align="center"><b>Category Detail</div>

                    </div>
                    
                    <div style="padding-top:30px" class="panel-body" >

                        
                        <form id="categoryform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon">Category ID</span>
                                        <input id="categoryname" type="text" class="form-control" name="categoryID" value="${categoryData.categoryId }" readonly>
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon">Category Name</span>
                                        <input id="categoryname" type="text" class="form-control" name="categoryName" value="${categoryData.categoryName }" required>
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon">Category Desc</span>
                                        <input id="categoryname" type="text" class="form-control" name="categoryDesc" value="${categoryData.categoryDescription }" required>
                            </div>
                            
                            <div style="margin-top:10px" class="form-group" align="center">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                      <input type="submit" class="btn btn-success" value="Submit">
                                      <input type="reset" class="btn btn-success" value="Reset">
                                    </div>
                            </div>
                        </form>
                     </div>
              </div>
          </div>
</div>
		
</form>
<%@include file="Footer.jsp"%>