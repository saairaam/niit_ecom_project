<%@include file="Header.jsp"%>
<form action="<c:url value="/cc"/>" method="post">
<div class="container">    
        <div id="paymentbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Credit Card Payment Process</div>
                        
                    </div>
                    
                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="payment-alert" class="alert alert-danger col-sm-12"></div>
                        
                        <form id="paymentform" class="form-horizontal" role="form">
                        
                        	<div style="margin-bottom: 25px" class="input-group">
                            	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input id="Name on Card" type="text" class="form-control" name="username" value="" placeholder="Name on Card" required>
                            </div>
        					
        					<div style="margin-bottom: 25px" class="input-group">
                            	<span class="input-group-addon"><i class="glyphicon glyphicon-credit-card"></i></span>
                                <input id="Card Number" type="text" class="form-control" name="cardnumber" value="" placeholder="0000-0000-0000-0000" 
                                pattern="[0-9]{12}" required>
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                            	<span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                                <input id="Expiry Date" type="text" class="form-control" name="expirydate" value="" placeholder="mm/yyyy" 
                                pattern="[0-9][0-9]/[0-9][0-9][0-9][0-9]" title="Format should be mm/yyyy" required>
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                            	<span class="input-group-addon"><i class="glyphicon glyphicon-credit-card"></i></span>
                            	<input id="cvv" type="text" class="form-control" name="cvv" value="" placeholder="000" pattern="[0-9][0-9][0-9]"
                                title="three digit number behind card" required>
                            </div>
        					
        					<div style="margin-top:10px" class="form-group" align="center">
                                    <div class="col-sm-12 controls">
                                      <input type="submit" class="btn btn-success" value="Pay">
                                      <input type="reset" class="btn btn-success" value="Reset">
                                    </div>
                            </div>
                         </form>
                      </div>
                      </div>
                      </div>
                      </div>
<%@include file="Footer.jsp"%>
</form>