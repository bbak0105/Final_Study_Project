<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Blooming ERP</title>

        <!-- Vendor CSS -->
        <link rel="stylesheet" href="${pageContext.request.contextPath }/vendors/fullcalendar/fullcalendar.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/vendors/animate-css/animate.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/vendors/sweet-alert/sweet-alert.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/vendors/sweet-alert/sweet-alert.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/vendors/material-icons/material-design-iconic-font.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/vendors/socicon/socicon.min.css">
      
        <!-- CSS -->
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/app.min.1.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/app.min.2.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/productlist.css">
        
         
       
    </head>
    
    <body>
    <!-- header 부분 -->
     <header id="header">
   		<tiles:insertAttribute name="header"/>
   	</header>
        
        <section id="main">
        	<!-- 사이드바 부분 -->
        	 <aside id="sidebar">
   				<tiles:insertAttribute name="sidebar"/>
        	</aside>
        	
        	<!-- chatting 바 부분 -->
           	<aside id="chat">
   				<tiles:insertAttribute name="chat"/>
        	</aside>
            
            <section id="content">
                      <!-- content부분 -->
                      <!-- <div id="content"> -->
			          	<tiles:insertAttribute name="content"/>
                      <!-- </div> -->
                   <!--  </div>
                </div> -->
            </section>
        </section>
        
        <!-- Javascript Libraries -->
        
        <!-- Javascript Libraries -->
        <!-- 공통 JS -->
        <script src="${pageContext.request.contextPath }/js/jquery-2.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
        
        <script src="${pageContext.request.contextPath }/vendors/moment/moment.min.js"></script>
		<script src="${pageContext.request.contextPath }/vendors/bootstrap-select/bootstrap-select.min.js"></script> 
        <script src="${pageContext.request.contextPath }/vendors/chosen/chosen.jquery.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/noUiSlider/jquery.nouislider.all.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/input-mask/input-mask.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/farbtastic/farbtastic.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/summernote/summernote.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/fileinput/fileinput.min.js"></script>
           
        <script src="${pageContext.request.contextPath }/vendors/flot/jquery.flot.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/flot/jquery.flot.resize.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/flot/plugins/curvedLines.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/sparklines/jquery.sparkline.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/easypiechart/jquery.easypiechart.min.js"></script>
        
        <script src="${pageContext.request.contextPath }/vendors/fullcalendar/lib/moment.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/fullcalendar/fullcalendar.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/simpleWeather/jquery.simpleWeather.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/auto-size/jquery.autosize.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/nicescroll/jquery.nicescroll.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/waves/waves.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/bootstrap-growl/bootstrap-growl.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/bootgrid/jquery.bootgrid.min.js"></script>
        <script src="vendors/sparklines/jquery.sparkline.min.js"></script>
        <script src="vendors/easypiechart/jquery.easypiechart.min.js"></script>
        <script src="${pageContext.request.contextPath }/vendors/sweet-alert/sweet-alert.min.js"></script>
        
        <!-- chart --> 
        <script src="${pageContext.request.contextPath }/js/charts.js"></script>
        
        <!-- 공통 JS -->
        <script src="${pageContext.request.contextPath }/js/functions.js"></script>
        <script src="${pageContext.request.contextPath }/js/demo.js"></script>

        

    </body>
  </html>