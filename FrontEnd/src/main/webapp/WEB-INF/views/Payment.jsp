<%@include file="Header.jsp"%>
<form action="paymentprocess" method="post">
<div class="container">    
        <div id="paymentbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Payment Process</div>
                        
                    </div>
                    
                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="payment-alert" class="alert alert-danger col-sm-12"></div>
                        
                        <form id="paymentform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                            <input type="radio" name="pmode" value="Credit/Debit Card" required> Credit/Debit Card
                                    	    <input type="radio" name="pmode" value="Cash on Delivery" required> Cash on Delivery
                                        
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
                     

</form>
<%@include file="Footer.jsp"%>