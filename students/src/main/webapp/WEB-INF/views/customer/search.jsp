<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Students</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <link rel="stylesheet" type="text/css" href="${base}/css/style.css">
    
    <link rel="icon" type="image/x-icon" href="${base}/img/logo.jpg">
    
     <jsp:include page="/WEB-INF/views/common/variables.jsp"></jsp:include>
    
</head>
<body>
    <header>
        <div class="students-header">
            <h1>tra cứu thông tin tuyển sinh</h1>
            <img src="${base }/img/icon_ghtk.jpg" width="30%">
        </div>
    </header>
    <section class="students-import">
        <div class="container">
            <form action="search" method="post" class="form" style="display: block;">
                <div class="form-group" style="margin-bottom: 3px;">
                    <label for="name">Họ tên</label>
                    <input type="text" class="form-control" name="name" id="name">
                </div>
                <div class="form-group">
                    <label for="studenCode">Mã học sinh</label>
                    <input type="text" class="form-control" name="studenCode" id="studenCode">
                </div>
                <div style="display: flex ; justify-content: center; padding-top: 5px;">
                	<input type="submit" value="Tìm kiếm">
               	</div>
            </form>
        </div>
        <div class="card-body">
            <h4 class="header-title">Thông tin học sinh</h4>
            <div class="single-table">
                <div class="table-responsive" style="overflow-x: unset;">
                        <table class="table text-center">
                            <thead class="text-uppercase bg-dark">
                                <tr class="text-white">
                                    <th scope="col">Trường Tiểu học</th>
                                    <th scope="col">Quận/Huyện</th>
                                    <th scope="col">Mã học sinh</th>
                                    <th scope="col">Lớp</th>
                                    <th scope="col">Họ và tên</th>
                                    <th scope="col">Ngày sinh</th>
                                    <th scope="col">Giới tính</th>
                                    <th scope="col">Nơi sinh</th>
                                    <th scope="col">Dân tộc</th>
                                    <th scope="col">Hộ khẩu</th>
                                    <th scope="col">Điện thoại</th>
                                    <th scope="col">Điểm tổng năm lớp 1</th>
                                    <th scope="col">Điểm tổng năm lớp 2</th>
                                    <th scope="col">Điểm tổng năm lớp 3</th>
                                    <th scope="col">Điểm tổng năm lớp 4</th>
                                    <th scope="col">Điểm tổng năm lớp 5</th>
                                    <th scope="col">Tổng điểm 5 năm</th>
                                    <th scope="col">Điểm ưu tiên</th>
                                    <th scope="col">Tổng điểm sơ tuyển</th>
                                    <th scope="col">Ghi chú</th>
                                </tr>
                            </thead>
                            <tbody>
                               <c:forEach items="${students}" var="user">
                                <tr>
                                    <td><c:out value="${user.school}" /></td>
                                    <td><c:out value="${user.district}" /></td>
                                    <td><c:out value="${user.studenCode}" /></td>
                                    <td><c:out value="${user.classSchool}" /></td>
                                    <td><c:out value="${user.name}" /></td>
                                    <td><c:out value="${user.ngaySinh}" /></td>
                                    <td><c:out value="${user.gioiTinh}" /></td>
                                    <td><c:out value="${user.noiSinh}" /></td>
                                    <td><c:out value="${user.danToc}" /></td>
                                    <td><c:out value="${user.city}" /></td>
                                    <td><c:out value="${user.phone}" /></td>
                                    <td><c:out value="${user.diemLop1}" /></td>
                                    <td><c:out value="${user.diemLop2}" /></td>
                                    <td><c:out value="${user.diemLop3}" /></td>
                                    <td><c:out value="${user.diemLop4}" /></td>
                                    <td><c:out value="${user.diemLop5}" /></td>
                                    <td><c:out value="${user.tongDiem5}" /></td>
                                    <td><c:out value="${user.diemUuTien}" /></td>
                                    <td><c:out value="${user.tongDiemSoTuyen}" /></td>
                                    <td><c:out value="${user.note}" /></td>
                                </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                </div>
            </div>
        </div>   
    </section>
    <footer>
        <h3>Chào mừng đến với website của GHTK!</h3>
        <h3><a href="${base}/import">Import danh sách</a></h3>
    </footer>
<script type="text/javascript" src="${base}/js/script.js"></script>
</body>
</html>