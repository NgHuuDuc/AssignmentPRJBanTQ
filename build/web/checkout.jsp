<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>HD Sport</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="js/jquery1.min.js"></script>
        <!-- start menu -->
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/megamenu.js"></script>
        <script>$(document).ready(function () {
        $(".megamenu").megamenu();
    });</script>
        <!-- dropdown -->
        <script src="js/jquery.easydropdown.js"></script>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
        <div class="register_account">
            <div class="wrap">
                <h4 class="title">Shopping cart is empty</h4>
                <p class="cart">You have no items in your shopping cart.<br>Click<a href="Home"> here</a> to continue shopping</p>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>