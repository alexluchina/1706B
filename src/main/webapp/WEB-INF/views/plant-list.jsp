<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet" href="/css/style.css">
<link type="text/css" rel="stylesheet" href="/js/font-awesome-4.7.0/css/font-awesome.css">
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>植物信息</title>
</head>
<body>
	<div class="container">
		<table class="table" id="plantTable">
			<tr>
				<td align="center"><button class="btn btn-primary" type="button" id="addBtn">添加</button></td>
				<td colspan="5" align="center">查询内容<input type="text" id="plantName">
					<button class="btn btn-primary" id="searchBtn">搜索</button>
				</td>
			</tr>
			
			<tr>
				<th align="center"><input type="checkbox" id="select-all">全选</th>
				<th>序号</th>
				<th>植物名称</th>
				<th>描述</th>
				<th>类别</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${plantPages.records }" var="plants">
				<tr>
				<td align="center"><input type="checkbox" class="checkPlantId" value="${plants.id }" /></td>
				<td>${plants.id }</td>
				<td>${plants.name }</td>
				<td>${plants.description }</td>
				<td>${plants.categoryName }</td>
				<td><a href="/showPlant?id=${plants.id }">查看</a>&nbsp;<a href="/updatePlant?id=${plants.id }">修改</a>&nbsp;<a href="/remove?id=${plants.id}">删除</a></td>
			</tr>
			</c:forEach>
			<tr>
				<td align="center"><button type="button" id="batchRemoveBtn">批量删除</button></td>
				<td colspan="6" align="center"><button type="button" id="firstBtn">首页</button>
					<button type="button" id="previousBtn">上一页</button>
					<button type="button" id="nextBtn">下一页</button>
					<button type="button" id="lastBtn">末页</button> &nbsp;&nbsp;当前是第${currentPage}页/共计${pages }页</td>
			</tr>
		</table>
	</div>
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$('#searchBtn').click(function(){
			var name= $('#plantName').val();
			location="/?name="+name;
		})
	$('#addBtn').click(function(){
		location="/showAdd";
	})
	// 全选
	$('#select-all').click(function(){
		if($(this).is(":checked")) {
			$('.checkPlantId').prop("checked",true)
		}else{
			$('.checkPlantId').prop("checked",false)
		}
	})
	// 批量删除
	$('#batchRemoveBtn').click(function(){
		var checkedInfoList = $('.checkPlantId:checked');
		if (checkedInfoList.length == 0) {
			alert("请选择要删除的植物信息")
		} else {
			var removeUrl = "/remove?"
			checkedInfoList.each(function(){
				var id = $(this).val();
				removeUrl+="id="+id+"&"
			})
			removeUrl = removeUrl.substring(0,removeUrl.length-1);
			location=removeUrl;
		}
	})
	})
	//首页
	$('#firstBtn').click(function(){
		location="/?pageNo=1";
	})
	//上一页
	$('#previousBtn').click(function(){
		var current = ${currentPage};
		if(current>1){
			location="/?pageNo="+(current-1);
		}else{
			location="/?pageNo=1";
		}
	})
	//下一页
	$('#nextBtn').click(function(){
		var current = ${currentPage};
		var last = ${pages};
		if(last==current){
			location="/?pageNo="+last;
		}else if(last==1){
			location="/?pageNo=1";
		}else if(last>current){
			location="/?pageNo="+(current+1);
		}
	})
	//末页
	$('#lastBtn').click(function(){
		location="/?pageNo="+${pages};
	})
	</script>
</body>
</html>