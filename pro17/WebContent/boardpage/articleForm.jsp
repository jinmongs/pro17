<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
%> 
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<c:set var="userId" value="${sessionScope.userid}" /> 
<head>
<meta charset="UTF-8">
<title>글쓰기창</title>

</head>
<body>
<h1 style="text-align:center">새글 쓰기</h1>
  <form name="articleForm" method="post"   action="${contextPath}/board/addArticle.do?id=${userId}">
    <table border="0" align="center">
     <tr>
	   <td align="right">작성자: </td>
	   <td colspan="2"><input type="text" size="67" name="gid" value="${userID}" disabled/></td>
	 </tr>
     <tr>
	   <td align="right">글제목: </td>
	   <td colspan="2"><input type="text" size="67"  maxlength="500" name="title" /></td>
	 </tr>
	 <tr>
		<td align="right" valign="top"><br>글내용: </td>
		<td colspan=2><textarea name="content" rows="10" cols="65" maxlength="4000"></textarea> </td>
     </tr>
     <tr>
        <td align="right">이미지파일 첨부:  </td>
	     <td> <input type="text" name="imageFileName" /></td>
         <td><img  id="preview" src="#"   width=200 height=200/></td>
	 </tr>
    </table>
    <input type="submit" value="글쓰기" />
	<a href="${contextPath}/board/listArticles.do">목록</a>
  </form>
</body>
</html>
