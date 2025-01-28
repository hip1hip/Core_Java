<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글 수정</title>
    <style>
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"], textarea {
            width: 100%;
            padding: 8px;
        }
        textarea {
            height: 200px;
        }
    </style>
</head>
<body>
    <h1>게시글 수정</h1>
    
    <!-- 폼 시작 - POST 방식으로 /board/edit/{id}에 데이터 전송 -->
    <form action="/board/edit/${board.id}" method="post">
        <!-- 기존 id 값을 hidden으로 전송 -->
        <input type="hidden" name="id" value="${board.id}">
        
        <div class="form-group">
            <label for="title">제목</label>
            <input type="text" id="title" name="title" value="${board.title}" required>
        </div>
        
        <div class="form-group">
            <label for="writer">작성자</label>
            <input type="text" id="writer" name="writer" value="${board.writer}" readonly>
        </div>
        
        <div class="form-group">
            <label for="content">내용</label>
            <textarea id="content" name="content" required>${board.content}</textarea>
        </div>
        
        <div class="form-group">
            <button type="submit">수정</button>
            <button type="button" onclick="location.href='/board/detail/${board.id}'">취소</button>
        </div>
    </form>
</body>
</html>
