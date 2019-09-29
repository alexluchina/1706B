<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加植物</title>
<link type="text/css" rel="stylesheet" href="/css/style.css">
<link type="text/css" rel="stylesheet" href="/js/font-awesome-4.7.0/css/font-awesome.css">
</head>
<body>
	<div class="contenter">
		<form action="/addPlant" method="post" id="plant">
			<input type="hidden" name="category">
			<table >
				<tr>
					<td>
						<div style="width: 49.5%; float: left; text-align: left">
							<span>植物名称：</span> <input type="text" name="name">
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div style="width: 49.5%; float: left; text-align: left">
							<span>描述：</span> <input type="text" name="description">
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div style="width: 49.5%; float: left; text-align: left">
							<span>类别：</span> <select id="selectCategory"></select>
						</div>
					</td>
				</tr>
			</table>
			<button type="submit" align="center">保存</button>
		</form>
	</div>
</body>
<script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$.ajax({
			timeout : 3000,
			async : false,
			type : "POST",
			url : "/getCategories",
			dataType : "json",
			data : {},
			success : function(data) {
				for (var i = 0; i < data.length; i++) {
					$("#selectCategory").append("<option value='"+ data[i].id +"'>" + data[i].name + "</option>");
				}
			}
		});
		window.onload = function() {
			// 1.取值
			var id = $('#selectCategory option:selected').val();
			$('input[name="category"]').val(id);
		}
	});
</script>
</html>