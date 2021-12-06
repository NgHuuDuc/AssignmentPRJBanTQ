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
                                Sản Phẩm
                            </h1>
                            <form action="update" method="post">
                                <div class="form-group">
                                    <label for="inputEmail">Tên sản phẩm</label>
                                    <input value="${product.getName()}" type="text" name="Name" class="form-control" id="inputEmail" required>
                            </div>
                            <div class="row">
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label for="inputFirstName">Mã sản phẩm</label>
                                        <input value="${product.getProductID()}" type="text" name="ID" class="form-control" id="inputFirstName" required>
                                    </div>
                                </div>
                                <div class="col-sm-9">
                                    <div class="form-group">
                                        <label for="inputLastName"> Mã Thương Hiệu (1:Nike, 2:Adidas, 3:Mizuno, 4:Kamito)</label>
                                        <input value="${product.getBrandID()}" type="text" name="BrandID" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                                <div class="col-sm-9">
                                    <div class="form-group">
                                        <label for="inputLastName">Phân loại (TF: Sân nhân tạo, FG: Sân cỏ tự nhiên) </label>
                                        <input value="${product.getCategory()}" type="text" name="Category" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label for="inputLastName">Giá</label>
                                        <input value="${product.getPrice()}" type="text" name="Price" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="inputLastName">Số lượng</label>
                                        <input value="${product.getQuantity()}" type="text" name="Quantity" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="inputLastName">Cỡ</label>
                                        <input value="${product.getSize()}" type="text" name="Size" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="inputLastName">Màu sắc</label>
                                        <input value="${product.getColor()}" type="text" name="Color" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label for="inputLastName">Ngày nhập hàng (yyyy/mm/dd)</label>
                                        <input value="${product.getDateAdd()}" type="text" name="DateAdd" class="form-control" id="inputLastName" required>
                                    </div>
                                </div>
                            </div>            
                            <div class="form-group">
                                <label for="inputEmail">Ảnh</label>
                                <input value="${product.getImage()}" type="text" name="Image" class="form-control" id="inputEmail" required>
                            </div>
                            <div class="form-group">
                                <label for="inputMessage">Chi tiết sản phẩm</label>
                                <input value="${product.getDescription()}" name="Description" class="form-control" id="inputMessage" rows="5" required>
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