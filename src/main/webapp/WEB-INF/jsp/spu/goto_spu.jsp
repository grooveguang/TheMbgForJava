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
    			$("#spu_class_1_select").append("<option value="+json.id+">"+json.flmch1+"</option>");
    		 });
    	 });
     });
     //二级目录
     function get_spu_class_2(class_1_id){
    	 $.getJSON("js/json/class_2_"+class_1_id+".js",function(data){
    	     $("#spu_class_2_select").empty();
    		 $(data).each(function(i,json){
    			$("#spu_class_2_select").append("<option value="+json.id+">"+json.flmch2+"</option>");
    		 });
    	 });
    	 get_spu_tm_select(class_1_id);
     };
     //商品目录
     function get_spu_tm_select(class_1_id){
    	 $.getJSON("js/json/tm_class_1_"+class_1_id+".js",function(data){
    		 $("#spu_tm_select").empty();
    		 $(data).each(function(i,json){
    			$("#spu_tm_select").append("<option value="+json.id+">"+json.ppmch+"</option>");
    		 });
    	 }); 
     };
     
     
    
     
	function get_spu_list(){
		var class_1=$("#spu_class_1_select").val();
		var class_2=$("#spu_class_2_select").val();
		$.post("get_spu_list.do",{flbh1:class_1,flbh2:class_2},function(data){
			$("#spu_body_list").html(data);
		});
	};
	
	function get_spu_add(){
		var class_1=$("#spu_class_1_select").val();
		var class_2=$("#spu_class_2_select").val();
		var ppId=$("#spu_tm_select").val();
		$.post("get_spu_add.do",{flbh1:class_1,flbh2:class_2,ppId:ppId},function(data){
			$("#spu_body_list").html(data);
		});
	};
     
</script>
<title>硅谷商城</title>
</head>
<body>
    商品spu信息:${success }<br>
	    <select id="spu_class_1_select" name="flbh1" onchange="get_spu_class_2(this.value)">
	    </select>
	    <select id="spu_class_2_select" name="flbh2" ><option>请选择</option></select>
	    <select id="spu_tm_select" name="ppId"><option>请选择</option></select>
	    <br>
	    <a href="javascript:get_spu_list()" >商品列表</a>
	    <a href="javascript:get_spu_add()" >商品添加</a>
	    <hr>
	    <div id="spu_body_list"><div align="center" >Welcome To Here !!</div></div>

</body>
</html>