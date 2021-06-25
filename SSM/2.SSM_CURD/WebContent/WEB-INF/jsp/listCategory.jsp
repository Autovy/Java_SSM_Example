<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div style="width:500px;margin:0px auto;text-align:center">
	<table align='center' border='1' cellspacing='0'>
	    <tr>
	        <td>id</td>
	        <td>name</td>
	        <td>编辑</td>
	        <td>删除</td>
	    </tr>
	    <c:forEach items="${cs}" var="c" varStatus="st">
	        <tr>
	            <td>${c.id}</td>
	            <td>${c.name}</td>
	            <td><a href="editCategory?id=${c.id}">编辑</a></td>
	            <td><a href="deleteCategory?id=${c.id}">删除</a></td>
	        </tr>
	    </c:forEach>
	</table>
	<div style="text-align:center">
		<a href="?start=0">首  页</a>
		<a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a>
		<a href="?start=${page.last}">末  页</a>
	</div>
	
	
	<div style="text-align:center;margin-top:40px">
		
		<form method="post" action="addCategory">
			分类名称： <input name="name" value="" type="text"> <br><br>
			<input type="submit" value="增加分类">
		</form>

	</div>	
 </div>
