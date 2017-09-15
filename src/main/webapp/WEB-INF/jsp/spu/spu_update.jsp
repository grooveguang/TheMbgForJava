<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">

</script>
<title>硅谷商城</title>
</head>
<body>
	<table  width="500px" border="1">
		<tr><td>商品名</td><td><input type="text" value="${mpi.mallProduct.shpMch }"/></td></tr>
		<tr><td>商品描述</td><td><textarea style="width:300px;height:100px;" >${mpi.mallProduct.shpMsh }</textarea></td></tr>
		<tr><td>创建时间</td><td>${mpi.mallProduct.chjshj }</td></tr>
		<tr><td>商品图片</td><td>
		<c:forEach items="${mpi.mallProductImagelists }" var="mallProductImage">
		     <img src="upload/image/${mallProductImage.url}" width="50px">
		</c:forEach>
		</td></tr>
		<tr><td>提交修改</td><td><input type="button" value="提交"></td></tr>
	</table>
</body>
</html>