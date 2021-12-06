<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>HD Sport</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="js/megamenu.js"></script>
        <style>
            body {
                color: #566787;
                background: #fff;
                font-family: "Open Sans", sans-serif;
            }
            .contact-form {
                padding: 50px;
                margin: 30px 0;
            }
            .contact-form h1 {
                text-transform: uppercase;
                margin: 0 0 15px;
            }
            .contact-form .form-control, .contact-form .btn  {
                min-height: 38px;
                border-radius: 2px;
            }
            .contact-form .btn-primary {
                min-width: 150px;
                background: #ffc82e;
                color: #292929;
                border: none;
                margin-left: 38%;
            }
            .contact-form .btn-primary:hover {
                background: #292929;
                color: #ffc82e;
            }
            .contact-form label {
                opacity: 0.9;
            }
            .contact-form textarea {
                resize: vertical;
            }
            .hint-text {
                font-size: 15px;
                padding-bottom: 15px;
                opacity: 0.8;
            }
            .bs-example {
                margin: 20px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="container-xl">
                <div class="row">
                    <div class="col-md-8 mx-auto">
                        <div class="contact-form">
                            <h1 style="
                                font-size: 30px;
                                font-weight: bold;
                                text-align: center;
                                margin-bottom: 15%;
                                background-color: #292929;
                                color: #ffc82e;
                                padding: 10px;
                                border-radius: 5px;">
                                Tài Khoản
                            </h1>
                            <form action="updateacc" method="post">
                                <div class="row">
                                    <div class="col-sm-3">
                                        <div class="form-group">
                                            <label for="inputEmail">Mã Người Dùng</label>
                                            <input value="${customer.getCusID()}" type="text" name="ID" class="form-control" id="inputEmail" required>
                                    </div>
                                </div>
                                <div class="col-sm-9">
                                    <div class="form-group">
                                        <label for="inputFirstName">Tên Người Dùng</label>
                                        <input value="${customer.getUserName()}" type="text" name="UserName" class="form-control" id="inputFirstName" required>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="inputLastName"> Email </label>
                                        <input value="${customer.getEmail()}" type="text" name="Email" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="inputLastName">Mật Khẩu</label>
                                        <input value="${customer.getPassword()}" type="text" name="Password" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>                                                               
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="inputLastName">SĐT</label>
                                        <input value="${customer.getPhone()}" type="text" name="Phone" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                            </div>                                       
                            <button type="submit" class="btn btn-primary" value="Submit">Cập Nhật</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>