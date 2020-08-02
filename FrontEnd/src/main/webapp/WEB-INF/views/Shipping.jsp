<%@include file="Header.jsp"%>
<div class="container">    
        <div id="shippingaddress" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Shipping Address</div>
                        
                    </div>
                    
                    <div style="padding-top:30px" class="panel-body" >

                        
                        
                        <form id="shippingform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                        <input id="address1" type="text" name="address1" class="form-control" value="" placeholder="Door/Flat no, Street Name"  required>
                                                                           
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-road"></i></span>
                                        <input id="address2" type="text" name="address1" class="form-control" value="" placeholder="Landmark">
                                                                           
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
                                        <input id="city" type="text" name="city" class="form-control" value="" placeholder="city name" required>
                                                                           
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
                                        <input id="pincode" type="text" name="pincode" class="form-control" value="" placeholder="postal code" pattern="[0-9]{,6}" required>
                                                                           
                            </div>
                                
                                                     
                            <div style="margin-top:10px" class="form-group" align="center">
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