<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>购物车列表</title>
    <script type="text/javascript">
		function deleteitem(id){
			var b = window.confirm("您确定要删除吗？");
			if(b){
				window.location.href="${pageContext.request.contextPath }/servlet/DeleteServlet?id="+id;
			}
		}
	</script>
  </head>
  
 <body style="text-align: center">
    
    <h1>书籍列表</h1>
    
    <table width="70%" border="1">
    	<tr>
    		<td>书名</td>
    		<td>作者</td>
    		<td>单价</td>
    		<td>数量</td>
    		<td>小计</td>
    		<td>操作</td>
    	</tr>
    	
    	<c:forEach var="entry" items="${cart.map }">
    		<tr>
    			<td>${entry.value.book.name }</td>
    			<td>${entry.value.book.author }</td>
    			<td>${entry.value.book.price }</td>
    			<td>${entry.value.quantity }</td>
    			<td>${entry.value.price }</td>
    			<td>
    				<a href="javascript:void(0)" onclick="deleteitem(${entry.key })">删除</a><!-- 去掉超链接的默认行为 -->
    			</td>
    		</tr>
    	</c:forEach>
    	<tr>
    		<td colspan="3">总价</td>
    		<td colspan="3">${cart.price}元</td>
    	</tr>
    	
    </table>
    
  </body>
</html>
