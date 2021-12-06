<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>HD Sport</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link href="css/manageproduct.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="js/megamenu.js"></script>
        <!--        <link href="css/form.css" rel="stylesheet" type="text/css" media="all" />-->
        <script>
            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });
        </script>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="container-xl">
                <div class="table-responsive">
                    <div class="table-wrapper">
                        <div class="table-title">
                            <div class="row">
                                <div class="col-sm-5">
                                    <h2><b style="color: #ffc82e;">Quản Lý Tài Khoản</b></h2>
                                </div>
                                <!--                                <div class="col-sm-7">
                                                                    <a href="AddProduct.jsp" class="btn btn-secondary"><i class="material-icons">&#xE147;</i> <span>Thêm Sản Phẩm</span></a>					
                                                                </div>-->
                            </div>
                        </div>
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>Mã</th>
                                    <th>Tên Người Dùng</th>
                                    <th>Email</th>						
                                    <th>Mật Khẩu</th>
                                    <th>SĐT</th>
                                    <th>Chức Vụ</th>
                                    <th>Tùy Chọn</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${listAcc}" var="a">
                                <tr>
                                    <td>${a.getCusID()}</td>
                                    <td>${a.getUserName()}</td>
                                    <td>${a.getEmail()}</td>                        
                                    <td>${a.getPassword()}</td>
                                    <td>${a.getPhone()}</td>
                                    <td>
                                        <c:if test="${a.getIsAdmin() == 1}">
                                            Admin
                                        </c:if>
                                        <c:if test="${a.getIsAdmin() != 1}">
                                            User
                                        </c:if>
                                    </td>
                                    <td>
                                        <a href="updateacc?ID=${a.getCusID()}" class="settings" title="Settings" data-toggle="tooltip"><i class="material-icons">&#xE8B8;</i></a>
                                        <a href="#" class="delete" onclick="ShowMess(${a.getCusID()})" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <!--                    <div class="clearfix">
                                            <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
                                            <ul class="pagination">
                                                <li class="page-item disabled"><a href="#">Previous</a></li>
                    <c:forEach begin="1" end="${endPage}" var="i">
                    <a href="#" class="page-link">${i}</a>
                    </c:forEach>                            
                <li class="page-item"><a href="#" class="page-link">Next</a></li>
            </ul>
        </div>   -->
                </div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
    <script>
        function ShowMess(ID) {
            var option = confirm('Bạn có muốn xóa sản phẩm này không ?');
            if (option === true) {
                window.location.href = 'deleteacc?cid=' + ID;
            }
        }
    </script>
</html>
