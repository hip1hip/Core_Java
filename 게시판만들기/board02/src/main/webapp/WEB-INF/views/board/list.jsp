<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- JSTL 사용을 위한 태그 -->

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판 목록</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f4f4f4;
        }
    </style>
</head>
<body>
    <h1>게시판 목록</h1>
    
    <!-- 글쓰기 버튼 -->
    <div style="margin-bottom: 10px;">
        <a href="/board/write">글쓰기</a>
    </div>

    <!-- 게시글 목록 테이블 -->
    <table>
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
                <th>조회수</th>
            </tr>
        </thead>
        <tbody>
            <!-- boardList를 순회하면서 게시글 출력 -->
            <c:forEach items="${boardList}" var="board">
                <tr>
                    <td>${board.id}</td>
                    <td>
                        <a href="/board/detail/${board.id}">${board.title}</a>
                    </td>
                    <td>${board.writer}</td>
                    <td>${board.createdDate}</td>
                    <td>${board.viewCount}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
