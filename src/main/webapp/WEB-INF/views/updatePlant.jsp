<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改植物信息</title>
<form action="/changePlant" method="post" >
	<input type="hidden" name="id" value=${id}>
	<div>
		<p>
			<span>植物名称：</span><input type="text" value="${plant.name }" name="name" />
		</p>
		<p>
			<span>描述：</span><input type="text" value="${plant.description }" name="description" />
		</p>
		<p>
			<span>类别：</span> <select name="category">
				<c:forEach items="${categories}" var="c">
					<option value="${c.id}" <c:if test="${c.name == plant.categoryName}">selected</c:if>>${c.name }</option>
				</c:forEach>
			</select>
		</p>
		<button type="submit">保存</button>
	</div>
</form>

</head>
<body>

</body>

</html>