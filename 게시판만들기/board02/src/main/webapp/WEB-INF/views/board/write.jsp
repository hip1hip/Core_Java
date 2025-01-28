<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글 작성</title>
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
    <h1>게시글 작성</h1>
    
    <!-- 폼 시작 - POST 방식으로 /board/write에 데이터 전송 -->
    <form action="/board/write" method="post">
        <div class="form-group">
            <label for="title">제목</label>
            <input type="text" id="title" name="title" required>
        </div>
        
        <div class="form-group">
            <label for="writer">작성자</label>
            <input type="text" id="writer" name="writer" required>
        </div>
        
        <div class="form-group">
            <label for="content">내용</label>
            <textarea id="content" name="content" required></textarea>
        </div>
        
        <div class="form-group">
            <button type="submit">저장</button>
            <button type="button" onclick="location.href='/board/list'">취소</button>
        </div>
    </form>
</body>
</html>
