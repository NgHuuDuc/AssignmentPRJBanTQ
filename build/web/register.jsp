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
        <script src="js/jquery.easydropdown.js"></script>
    </head>
    <body> 
        <jsp:include page="Header.jsp"></jsp:include>
        <div class="register_account">
            <div class="wrap">
                <h4 class="title">Tạo Tài Khoản</h4>
                <form action="register" method="post">
                    <div class="col_1_of_2 span_1_of_2">
                        <div><input name="username" type="text" value="Tên Người Dùng" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Tên Người Dùng';
                                }"></div>
                        <div><input name="pass" type="text" value="Mật Khẩu" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Mật Khẩu';
                                }"></div>
                        <div><input name="repass" type="text" value="Xác Nhận Mật Khẩu" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Xác Nhận Mật Khẩu';
                                }"></div>
                        <div><input name="email" type="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Email';
                                }"></div>
                        <div><input name="phone" type="text" value="Số Điện Thoại" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'SĐT';
                                }"></div>                                              
                        <button class="grey">Đăng Ký</button>
                    </div>
                </form>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>