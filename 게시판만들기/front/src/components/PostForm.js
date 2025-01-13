import React, { useState } from 'react';
import { createPost } from '../api/posts';

const PostForm = () => {
    const [formData, setFormData] = useState({
        title: '',
        content: '',
        author: '',
        category: '',
    });

    const handleChange = (e) => {
        const {name , value} = e.target;
        setFormData({ ...formData, [name]: value});
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        await createPost(formData);
        alert('게시글이 등록되었습니다!');
        setFormData({title: '', constent: '', author:'' , category: ''});
    };

    return (
        <form onSubmit = {handleSubmit}>
            <input type="text" name="title" placeholder="제목" value={formData.title} onChange={handleChange} required />
            <textarea name="content" placeholder="내용" value={formData.content} onChange={handleChange} required />
            <input type="text" name="author" placeholder="작성자" value={formData.author} onChange={handleChange} required />
            <input type="text" name="category" placeholder="카테고리" value={formData.category} onChange={handleChange} required />
            <button type="submit"> 등록 </button>
        </form>
    );
};

export default PostForm;
