<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>
				<div class="container-fluid">
                    <h1 class="h3 mb-4 text-gray-800">Detail Page</h1>
                    <div>
                    	<h2>${d.departmentName}</h2>
                    	<h2>${d.category}</h2>
                    	<h2>${d.capacity}</h2>
                    </div>
                    <div>
                    	<a class="btn btn-info" href="./update?departmentNo=${d.departmentNo}">학과 수정</a>
                    	<form action="./delete" method="post">
                    		<input type="hidden" name="departmentNo" value="${d.departmentNo}">
                    		<button type="submit" class="btn btn-info">학과 삭제</button>
                    	</form>
                    </div>
                </div>
                <!-- end container-fluid -->
			</div>
			<!-- end content -->
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- end content-wrapper -->
	</div>
	<!-- end wrapper -->
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>
</body>
</html>