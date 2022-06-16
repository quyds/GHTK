<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html
    lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Students</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    
    <link rel="stylesheet" type="text/css" href="${base}/css/style.css">
    
    <link rel="icon" type="image/x-icon" href="${base}/img/logo.jpg">
    
     <jsp:include page="/WEB-INF/views/common/variables.jsp"></jsp:include>
    
</head>
<body>
    <header>
        <div class="students-header">
            <h1>tra cứu thông tin tuyển sinh</h1>
            <img src="${base}/img/icon_ghtk.jpg" width="30%">
        </div>
    </header>
    <section class="students-import">
        <div class="container">
            <form action="import" class="form-index" method="post" enctype ="multipart/form-data">
                <div class="file-upload-wrapper" data-text="Select your file!">
                  <input name="file" type="file" class="file-upload-field" value="">
                </div>
               <input type="submit" value="import">     
            </form>
            <div style="display: flex; justify-content: center; margin-top: 20px;">
            	<h4 style="color: green">${message}</h4>
            </div>
        </div>
    </section>
    <footer>
        <h3>Chào mừng đến với website của GHTK!</h3>
        <h3><a href="${base}/search">Tra cứu</a></h3>
    </footer>
<script type="text/javascript" src="${base}/js/script.js"></script>
</body>
</html>