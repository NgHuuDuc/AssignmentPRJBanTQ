<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
    <head>
        <title>HD Sport</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/form.css" rel="stylesheet" type="text/css" media="all" />
        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
        <script src="js/jquery1.min.js"></script>
        <!-- start menu -->
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/megamenu.js"></script>
        <script>$(document).ready(function () {
                $(".megamenu").megamenu();
            });</script>
        <script type="text/javascript" src="js/jquery.jscrollpane.min.js"></script>
        <script type="text/javascript" id="sourcecode">
            $(function ()
            {
                $('.scroll-pane').jScrollPane();
            });
        </script>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
        <div class="mens">    
            <div class="main">
                <div class="wrap">
                    <div class="cont span_2_of_3">
                        <h2 class="head">Kết quả tìm kiếm: </h2>
                        <div class="row top-box">
                            <%
                                List<Product> products = (List<Product>) request.getAttribute("listP");
                                if (products != null) {
                                    for (Product product : products) {
                            %>
                            <div class="col-md-4 khung equal"> 
                                <div class="border">
                                    <a href="single?ID=<%=product.getProductID()%>">
                                        <div class="inner_content clearfix">
                                            <div class="product_image">
                                                <img src="<%=product.getImage()%>" alt=""/>
                                            </div>
                                            <div class="price">
                                                <div class="cart-left">
                                                    <p class="title"><%=product.getName()%></p>
                                                    <div class="price1">
                                                        <fmt:formatNumber pattern="#,##0" value="<%=Integer.toString(product.getPrice())%>" /> đ
                                                    </div>
                                                </div>
                                                <div class="cart-right"> </div>
                                                <div class="clear"></div>
                                            </div>				
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <%
                                    }
                                }
                            %>
                            <div class="clear"></div>
                        </div>	                      	                        		 							 			    
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
        <script src="js/jquery.easydropdown.js"></script>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>