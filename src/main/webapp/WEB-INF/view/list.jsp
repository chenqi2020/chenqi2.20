<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.js"></script>
<link href="<%=request.getContextPath() %>/css/index3.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="list" method="post">
	区间:<input type="text" name="p1"  >--
	<input type="text" name="p2"  >
	<input type="submit" value="查询">
	<select >
	 <option>id</option>
	 <option>发布时间</option>
	 
	</select>
	</form>
	<table>
	 <tr>
	 <td>编号</td>
	 <td>标题</td>
	 <td>内容</td>
	 <td>添加时间</td>
	 <td>修改时间</td>
	 </tr>
	<c:forEach items="${list}" var="ll">
	 <tr>
	 <td>${ll.id}</td>
	 <td>${ll.title}</td>
	 <td>ff</td>
	 <td>${ll.created}</td>
	 <td>${ll.updated}</td>
	 </tr>
	
	</c:forEach>
	</table>
</body>
</html>