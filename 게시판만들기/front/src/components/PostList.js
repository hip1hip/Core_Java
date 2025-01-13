import React, {useEffect, useState} from 'react';
import { fetchPosts} from '../api/posts';

const PostList = () => {
    const [posts, setPosts] = useState([]);

    useEffect(() => {
        const getPosts = async () => {
            const data = await fetchPosts();
            setPosts(data);
        };
        getPosts();
    }, []);

    return (
        <div>
            <h1>게시글 목록</h1>
            <ul>
                {posts.map((post) => (
                    <li key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.content}</p>
                        <p><strong>작성자:</strong> {post.author}</p>
                        <p><strong>카테고리:</strong> {post.category}</p>
                        
                        {/* <Link to={`/posts/${post.id}`}>상세보기</Link> */}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default PostList;
