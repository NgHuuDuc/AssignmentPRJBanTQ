<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
    <head>
        <title>HD Sport</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
        <!-- start details -->
        <script src="js/slides.min.jquery.js"></script>
        <script>
            $(function () {
                $('#products').slides({
                    preload: true,
                    preloadImage: 'img/loading.gif',
                    effect: 'slide, fade',
                    crossfade: true,
                    slideSpeed: 350,
                    fadeSpeed: 500,
                    generateNextPrev: true,
                    generatePagination: false
                });
            });
        </script>
        <link rel="stylesheet" href="css/etalage.css">
        <script src="js/jquery.etalage.min.js"></script>
        <script>
            jQuery(document).ready(function ($) {

                $('#etalage').etalage({
                    thumb_image_width: 360,
                    thumb_image_height: 360,
                    source_image_width: 900,
                    source_image_height: 900,
                    show_hint: true,
                    click_callback: function (image_anchor, instance_id) {
                        alert('Callback example:\nYou clicked on an image with the anchor: "' + image_anchor + '"\n(in Etalage instance: "' + instance_id + '")');
                    }
                });

            });
        </script>	
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>       
            <div class="mens">    
                <div class="main">
                    <div class="wrap">
                        <ul class="breadcrumb breadcrumb__t"><a class="home" href="#">Home</a> / <a href="#">Dolor sit amet</a> / Lorem ipsum dolor sit amet</ul>
                        <div class="cont span_2_of_3">
                            <div class="grid images_3_of_2">
                                <ul id="etalage">
                                    <li>
                                        <a href="optionallink.html">
                                            <img class="etalage_thumb_image" src="${product.getImage()}" class="img-responsive" />
                                        <img class="etalage_source_image" src="${product.getImage()}" class="img-responsive" title="" />
                                    </a>
                                </li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="desc1 span_3_of_2">
                            <h3 class="m_3">${product.getName()}</h3>
                            <p class="m_5">
                                <fmt:formatNumber pattern="#,##0" value="${product.getPrice()}" /> đ
                            </p>
                            <div class="btn_form">
                                <form>
                                    <input type="submit" value="Mua Hàng" title="">
                                </form>
                            </div>

                            <p class="m_text2">${product.getDescription()}</p>
                        </div>
                        <div class="clear"></div>	
                        <div class="clients">
                            <h3 class="m_3">10 sản phẩm tương tự</h3>
                            <ul id="flexiselDemo3">
                                <c:forEach items="${list}" var="o">
                                    <li>
                                        <img src="${o.getImage()}" />
                                        <a id="${o.getProductID()}" href="single?ID=${o.getProductID()}">${o.getName()}</a>
                                        <p> 
                                            <fmt:formatNumber pattern="#,##0" value="${o.getPrice()}" /> đ
                                        </p>
                                       
                                        <img src onerror="xulychuthua('${o.getProductID()}')">
                                        <script>
                                        function xulychuthua(ID){
                                            var element = document.getElementById(ID);
                                            element.innerHTML = element.innerHTML.substring(0,20) + '...';
                                            
                                        }
                                        </script>
                                    </li>
                                </c:forEach>                                                               
                            </ul>
                            <script type="text/javascript">
                                $(window).load(function () {
                                    $("#flexiselDemo1").flexisel();
                                    $("#flexiselDemo2").flexisel({
                                        enableResponsiveBreakpoints: true,
                                        responsiveBreakpoints: {
                                            portrait: {
                                                changePoint: 480,
                                                visibleItems: 1
                                            },
                                            landscape: {
                                                changePoint: 640,
                                                visibleItems: 2
                                            },
                                            tablet: {
                                                changePoint: 768,
                                                visibleItems: 3
                                            }
                                        }
                                    });

                                    $("#flexiselDemo3").flexisel({
                                        visibleItems: 5,
                                        animationSpeed: 1000,
                                        autoPlay: false,
                                        autoPlaySpeed: 3000,
                                        pauseOnHover: true,
                                        enableResponsiveBreakpoints: true,
                                        responsiveBreakpoints: {
                                            portrait: {
                                                changePoint: 480,
                                                visibleItems: 1
                                            },
                                            landscape: {
                                                changePoint: 640,
                                                visibleItems: 2
                                            },
                                            tablet: {
                                                changePoint: 768,
                                                visibleItems: 3
                                            }
                                        }
                                    });

                                });
                            </script>
                            <script type="text/javascript" src="js/jquery.flexisel.js"></script>
                        </div>                        
                    </div>
                    <div class="rsingle span_1_of_single">                  
                        <script src="js/jquery.easydropdown.js"></script>
                    </div
                    <div class="clear"></div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>