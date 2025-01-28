<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글 상세보기</title>
    <style>
        .board-detail {
            width: 80%;
            margin: 20px auto;
        }
        .board-header {
            border-bottom: 2px solid #ddd;
            padding-bottom: 10px;
            margin-bottom: 20px;
        }
        .board-content {
            min-height: 200px;
            margin-bottom: 20px;
            padding: 20px;
            border: 1px solid #ddd;
        }
        .board-footer {
            text-align: right;
        }
        button {
            padding: 5px 10px;
            margin-left: 5px;
        }
    </style>
</head>
<body>
    <div class="board-detail">
        <div class="board-header">
            <h2>${board.title}</h2>
            <p>
                작성자: ${board.writer} | 
                작성일: ${board.createdDate} | 
                조회수: ${board.viewCount}
            </p>
        </div>
        
        <div class="board-content">
            ${board.content}
        </div>
        
        <div class="board-footer">
            <button onclick="location.href='/board/edit/${board.id}'">수정</button>
            <!-- 삭제 버튼과 폼 -->
            <form action="/board/delete/${board.id}" method="post" style="display: inline;">
                <button type="submit" onclick="return confirm('정말 삭제하시겠습니까?')">삭제</button>
            </form>
            <button onclick="location.href='/board/list'">목록</button>
        </div>
    </div>
</body>
</html>
