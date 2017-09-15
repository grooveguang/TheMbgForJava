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
	function spu_image_click(index){
		$("#spu_file_"+index).click();
	}
	
	function spu_img_change(index){
		
		var img = $("#spu_file_"+index)[0].files[0];
		
		var url = window.URL.createObjectURL(img);
		
		$("#spu_img_"+index).attr("src",url);
		
		var length = $("#spu_file_div :file").length-1;
		if(index>=2&&index==length){
			spu_img_append(index);
		}
	}
	
	function spu_img_append(index){
		$("#spu_img_div").append('<img width="70px" id="spu_img_'+(index+1)+'" onclick="spu_image_click('+(index+1)+')" src="image/upload_hover.png"/>');
	
		$("#spu_file_div").append('<input id="spu_file_'+(index+1)+'" style="display: none" type="file" name="files" onchange="spu_img_change('+(index+1)+')"/><br>');
	}
</script>
<title>硅谷商城</title>
</head>
<body>
<form action="save_spu.do" method="post" enctype="multipart/form-data">
        <input type="hidden" name="flbh1" value="${flbh1 }">
        <input type="hidden" name="flbh2" value="${flbh2 }">
        <input type="hidden" name="ppId" value="${ppId }">
		商品名称:<input name="shpMch" type="text" /><br>
		商品描述:<textarea name="shpMsh" rows="5" cols="50"></textarea><br>
		商品图片:<br>
		<div id="spu_img_div">
			<img width="70px" id="spu_img_0" onclick="spu_image_click(0)" src="image/upload_hover.png"/>
			<img width="70px" id="spu_img_1" onclick="spu_image_click(1)" src="image/upload_hover.png"/>
			<img width="70px" id="spu_img_2" onclick="spu_image_click(2)" src="image/upload_hover.png"/>
		</div>
		<input type="submit" value="提交"/>
		<div id="spu_file_div" >
			<input id="spu_file_0" style="display: none" type="file" name="files" onchange="spu_img_change(0)"/><br>
			<input id="spu_file_1" style="display: none" type="file" name="files" onchange="spu_img_change(1)"/><br>
			<input id="spu_file_2" style="display: none" type="file" name="files" onchange="spu_img_change(2)"/><br>
		</div>
    </form>
</body>
</html>