<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <jsp:include page="header.jsp"></jsp:include>
        
        
    </head>
    
    <body class="page-header-fixed">
        
        <jsp:include page="navbar.jsp"></jsp:include>
         
        <!-- BEGIN CONTAINER ************************************************************* -->
        <div class="page-container">
            
            <jsp:include page="menu.jsp"></jsp:include>
             
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                
                <div class="page-content">
                    
                    <jsp:include page="tools.jsp"></jsp:include>
                    
                    <jsp:include page="dashboard.jsp"></jsp:include>
                    
                    <jsp:include page="submenu.jsp"></jsp:include>
                    
                </div>
                
            </div>
            <!-- END CONTENT -->
            
        </div>
	<!-- END CONTAINER *************************************************************** -->
        
        <jsp:include page="footer.jsp"></jsp:include>
        <jsp:include page="library.jsp"></jsp:include>
        
    </body>
    
</html>
