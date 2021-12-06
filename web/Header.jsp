<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="header-top">
    <div class="wrap">
        <c:if test="${sessionScope.acc == null}">
            <div class="cssmenu">
                <ul>
                    <li><a href="login">Đăng Nhập</a></li> |
                    <li><a href="register.jsp">Đăng Ký</a></li>
                </ul>
            </div>
        </c:if>
        <c:if test="${sessionScope.acc != null}">   
            <div class="cssmenu">
                <ul>
                    <li><a href="#">Hello ${sessionScope.acc.getUserName()} ! </a></li> |                   
                    <li><a href="logout">Đăng Xuất</a></li> 
                </ul>
            </div>
        </c:if>
        <c:if test="${sessionScope.acc.getIsAdmin() == 1}">
            <div class="cssmenu">
                <ul>
                    <li><a href="managebrand">Quản Lý Thương Hiệu</a></li> |
                    <li><a href="manageproduct">Quản Lý Sản Phẩm</a></li> |
                    <li><a href="manageacc">Quản Lý Tài Khoản</a></li> |
                </ul>
            </div>
        </c:if>
        <div class="clear"></div>
    </div>
</div>
<div class="header-bottom">
    <div class="wrap">
        <div class="header-bottom-left">
            <div class="logo">
                <a href="Home"><img src="images/logo1.jpg" alt=""/></a>
            </div>
            <div class="menu">
                <ul class="megamenu skyblue">
                    <li class="active grid"><a href="Home">Trang Chủ</a></li>
                    <li><a class="color4" href="nike?ID=1">Giày Nike</a></li>				
                    <li><a class="color5" href="adidas?ID=2">Giày Adidas</a></li>
                    <li><a class="color6" href="mizuno?ID=3">Giày Mizuno</a></li>
                    <li><a class="color7" href="kamito?ID=4">Giày Kamito</a></li>
                </ul>
            </div>
        </div>
        <div class="header-bottom-right">
            <form action="search" method="POST">
                <div class="search">	  
                    <input type="text" name="name" class="textbox" value="Tìm kiếm" onfocus="this.value = '';" onblur="if (this.value == '') {
                            this.value = 'Search';
                        }">
                    <button type="submit" value="Subscribe" id="submit" name="submit"></button>
                    <div id="response"> </div>
                </div>
            </form>
            <div class="tag-list">
                <ul class="icon1 sub-icon1 profile_img">
                    <li><a class="active-icon c2" href="#"> </a>
                        <ul class="sub-icon1 list">
                            <li><h3>No Products</h3><a href=""></a></li>
                            <li><p>Lorem ipsum dolor sit amet, consectetuer  <a href="">adipiscing elit, sed diam</a></p></li>
                        </ul>
                    </li>
                </ul>
                <ul class="last"><li><a href="checkout.jsp">Giỏ Hàng(0)</a></li></ul>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
