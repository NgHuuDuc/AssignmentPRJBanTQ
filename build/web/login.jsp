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
            <div class="login">
                <div class="wrap">
                    <div class="col_1_of_login span_1_of_login">
                        <h4 class="title">Khách hàng mới</h4>
                        <p>
                            Bằng cách tạo một tài khoản với cửa hàng của chúng tôi , bạn sẽ có thể thực hiện những quy trình mua hàng nhanh hơn , lưu trữ nhiều địa chỉ gửi hàng , xem và theo dõi đơn đặt hàng của bạn trong tài khoản của bạn và nhiều hơn nữa .
                        </p>
                        <div class="button1">
                            <a href="register.jsp"><input type="submit" name="Submit" value="Tạo tài khoản"></a>

                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="col_1_of_login span_1_of_login">
                        <div class="login-title">
                            <form action="login" method="post" name="login" id="login-form">
                                <h4 class="title">Đăng Nhập</h4>
                                <div id="loginbox" class="loginbox">
                                    <fieldset class="input">
                                        <p id="login-form-username">
                                            <label for="modlgn_username">Email</label>
                                            <input id="modlgn_username" type="text" value="${email}" name="email" class="inputbox" size="18" autocomplete="off">
                                    </p>
                                    <p id="login-form-password">
                                        <label for="modlgn_passwd">Mật Khẩu</label>
                                        <input id="modlgn_passwd" type="password" value="${password}" name="password" class="inputbox" size="18" autocomplete="off">
                                    </p>
                                    <p style="margin-top: 15px;">
                                        <input name="remember"  type="checkbox"> Nhớ mật khẩu ?
                                    </p>
                                    <div class="remember" value="1">
                                        <div class="alert-danger" role="alert">
                                            <p style="color: red;">
                                                ${mess}
                                            </p>
                                        </div>
                                        <button class="button" type="submit">Đăng Nhập</button>
                                        <div class="clear"></div>
                                    </div>
                                </fieldset>
                            </div>
                        </form>
                    </div> 
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>