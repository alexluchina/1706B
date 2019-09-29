<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>植物详情</title>
<link type="text/css" rel="stylesheet" href="/css/style.css">
<link type="text/css" rel="stylesheet" href="/js/font-awesome-4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div>
		<div align="center">
			<p>
				<span>植物名称：</span> <span><input disabled="disabled" value="${plant.name}"></span>
			</p>
			<p>
				<span>描述：</span> <span><input disabled="disabled" value="${plant.description}"></span>
			</p>

			<span>类别：</span> <span><input disabled="disabled" value="${plant.categoryName}"> </span>
			</p>

			<p>
				<a href="javascript:history.go(-1)">
					<button>返回</button>
		</a>
		</p>
	</div>

</body>

</html>