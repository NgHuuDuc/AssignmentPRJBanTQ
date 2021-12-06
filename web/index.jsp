<%@page import="entity.Product"%>
<%@page import="java.util.List"%>
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
        <script type="text/javascript" src="js/jquery1.min.js"></script>
        <!-- start menu -->
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/megamenu.js"></script>


        <script>$(document).ready(function () {
                $(".megamenu").megamenu();
            });</script>
        <!--start slider -->
        <link rel="stylesheet" href="css/fwslider.css" media="all">
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/css3-mediaqueries.js"></script>
        <script src="js/fwslider.js"></script>
        <!--end slider -->
        <script src="js/jquery.easydropdown.js"></script>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
        <jsp:include page="Slider.jsp"></jsp:include>   
            <div class="main">
                <div class="wrap">
                    <h2 class="head tieude"> <span>Sản Phẩm Hot</span></h2>
                    <div class="row top-box">
                    <%
                        List<Product> products = (List<Product>) request.getAttribute("listP");
                        if (products != null) {
                            for (Product product : products) {
                    %>
                    <div class="col-md-3 khung equal"> 
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
                <h2 class="head tieude"><span>Giày Bóng Đá Sân Cỏ Tự Nhiên</span></h2>
                <div class="top-box1">
                    <div id="prev"> <img src="images/left-arrow.png" alt=""/> </div>
                    <div  id="next"> <img src="images/right-arrow.png" alt=""/>  </div>
                    <div class="carousel" id="carousel">
                        <%
                            List<Product> listGiayTuNhien = (List<Product>) request.getAttribute("listGiayTuNhien");
                            if (listGiayTuNhien != null) {
                                for (Product GiayTuNhien : listGiayTuNhien) {
                        %>

                        <div class="khung carousel__slide">
                            <div class="border">
                                <a href="single.html">
                                    <div class="inner_content clearfix">
                                        <div class="product_image">
                                            <img src="<%=GiayTuNhien.getImage()%>" alt=""/>
                                        </div>
                                        <!--                                            <div class="sale-box"><span class="on_sale title_shop">New</span></div>	-->
                                        <div class="price">
                                            <div class="cart-left">
                                                <p class="title"><%=GiayTuNhien.getName()%></p>
                                                <div class="price1">
<!--                                                            <span class="actual">$<%=GiayTuNhien.getPrice()%></span>-->
                                                    <fmt:formatNumber pattern="#,##0" value="<%=Integer.toString(GiayTuNhien.getPrice())%>" /> đ
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
                    </div>
                    <div class="clear"></div>
                </div>	
                <h2 class="head tieude"><span>Giày Bóng Đá Sân Cỏ Nhân Tạo</span></h2>	
                <div class="top-box1">
                    <div id="prev1"> <img src="images/left-arrow.png" alt=""/> </div>
                    <div  id="next1"> <img src="images/right-arrow.png" alt=""/> </div>
                    <div class="carousel" id="carousel1">
                        <%
                            List<Product> listGiayNhanTao = (List<Product>) request.getAttribute("listGiayNhanTao");
                            if (listGiayNhanTao != null) {
                                for (Product GiayNhanTao : listGiayNhanTao) {
                        %>

                        <div class="khung carousel__slide">
                            <div class="border">
                                <a href="single.html">
                                    <div class="inner_content clearfix">
                                        <div class="product_image">
                                            <img src="<%=GiayNhanTao.getImage()%>" alt=""/>
                                        </div>
                                        <!--                                            <div class="sale-box"><span class="on_sale title_shop">New</span></div>	-->
                                        <div class="price">
                                            <div class="cart-left">
                                                <p class="title"><%=GiayNhanTao.getName()%></p>
                                                <div class="price1">
<!--                                                            <span class="actual">$<%=GiayNhanTao.getPrice()%></span>-->
                                                    <fmt:formatNumber pattern="#,##0" value="<%=Integer.toString(GiayNhanTao.getPrice())%>" /> đ
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
                    </div>
                    <div class="clear"></div>
                </div>			 						 			    
                <div class="clear"></div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>  
        <script type="module">

            import InfiniteCarousel from './js/carousel.js';


            console.log("asagsdhjasd");
            let slider = new InfiniteCarousel({
            carousel: document.getElementById("carousel"),
            displacement: "calc(100% / 12 - 10px)"
            });
            slider.setDurationPerSlide(10000);
            //slider.enableAutoSlide(true);
            slider.run();

            document.getElementById("prev").onclick = slider.prevSlide.bind(slider);
            document.getElementById("next").onclick = slider.nextSlide.bind(slider);

            let slider1 = new InfiniteCarousel({
            carousel: document.getElementById("carousel1"),
            displacement: "calc(100% / 12 - 10px)"
            });
            slider1.setDurationPerSlide(10000);
            //slider.enableAutoSlide(true);
            slider1.run();

            document.getElementById("prev1").onclick = slider1.prevSlide.bind(slider1);
            document.getElementById("next1").onclick = slider1.nextSlide.bind(slider1);


        </script>
    </body>
</html>