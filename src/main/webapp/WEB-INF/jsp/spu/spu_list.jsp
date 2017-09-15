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
function get_spu_update(id){
	$.post("spu_update.do",{id:id},function(data){
		$("#spu_update_list").html(data);
	});
};
</script>
<title>硅谷商城</title>
</head>
<body>

    <div id="spu_update_list">
	<table width="500px" border="1">
		 <c:forEach items="${productLists }" var="product">
	        <tr><td><img src="upload/image/${product.shpTp }" width="50px"></td><td>${product.shpMch }</td><td>${product.shpMsh }</td><td><a href="javascript:get_spu_update(${product.id })">更新</a></td><td>删除</td></tr>
	     </c:forEach>
	</table>
	</div>
</body>
</html>