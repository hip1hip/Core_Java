<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hip1h
  Date: 25. 2. 13.
  Time: 오전 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시글 목록 </title>
</head>
<body>
    <h2>게시글 목록</h2>

    <!-- 글 작성 페이지로 이동하는 버튼 -->
    <a href="<c:url value='/board/write'/>">
        <button type="button"> 게시글 작성</button>
    </a>

    <table boarder="1">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
            </tr>
        </thead>
    </table>
    <tbody>
        <%-- 게시글 반복 출력 --%>
        <c:forEach var="board" items="${boards}">
            <tr>
                <td>${board.id}</td>
                <!-- 제목을 클릭하면 게시글 상세 페이지로 이동 -->
                <td>
                    <a href="<c:url value='/board/detail?id=${board.id}'/>">
                        ${board.title}
                    </a>
                </td>
                <td>${board.writer}</td>
                <td>${board.createdDate}</td>
            </tr>

        </c:forEach>

    </tbody>

</body>
</html>