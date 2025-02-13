<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hong InPyo
  Date: 25. 2. 13.
  Time: 오전 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시글 작성</title>
</head>
<body>
    <h2>게시글 작성</h2>
    <form action="<c:url value='/board/write'/>" method="post">
        <div>
            <label>제목</label>
            <input type="text" name="title" required>
        </div>
        <div>
            <label>작성자</label>
            <input type="text" name="writer" required>
        </div>
        <div>
            <label>내용</label>
            <textarea name="content" required></textarea>
        </div>
        <button type="submit">저장</button>
    </form>

    <!-- 목록으로 돌아가기 -->
    <a href="<c:url value='/board/list'/>">
        <button type="button"> 목록으로 돌아가기 </button>
    </a>

</body>
</html>
