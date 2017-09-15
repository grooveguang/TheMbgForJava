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
	//一级目录
	$(function(){
		 $.getJSON("js/json/class_1.js",function(data){
			 $(data).each(function(i,json){
				$("#sku_class_1_select").append("<option value="+json.id+">"+json.flmch1+"</option>");
			 });
		 });
	});
	//二级目录
	function get_sku_class_2(class_1_id){
		 $.getJSON("js/json/class_2_"+class_1_id+".js",function(data){
		     $("#sku_class_2_select").empty();
			 $(data).each(function(i,json){
				$("#sku_class_2_select").append("<option value="+json.id+">"+json.flmch2+"</option>");
			 });
		 });
		 get_sku_tm_select(class_1_id);
	};
	//商品目录
	function get_sku_tm_select(class_1_id){
		 $.getJSON("js/json/tm_class_1_"+class_1_id+".js",function(data){
			 $("#sku_tm_select").empty();
			 $(data).each(function(i,json){
				$("#sku_tm_select").append("<option value="+json.id+">"+json.ppmch+"</option>");
			 });
		 }); 
	};
	
	function get_sku_attr_list(class_2_id){
		$.post("get_attr_list_inner.do",{flbh2:class_2_id},function(data){
			$("#attr_list_inner").html(data);
		});
	};
	
	
</script>
<title>硅谷商城</title>
</head>
<body>
        商品sku信息:<div style="column-rule-color: blue;">${success }</div> 
        <select id="sku_class_1_select" name="flbh1" onchange="get_sku_class_2(this.value)">
	    <option>请选择</option>
	    </select>
	    <select id="sku_class_2_select" name="flbh2" onchange="get_sku_attr_list(this.value)"><option>请选择</option></select>
	    <select id="sku_tm_select" name="ppId"><option>请选择</option></select>
	    <hr>
	    <div id="attr_list_inner"></div>

</body>
</html>