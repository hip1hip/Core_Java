import axios from 'axios';

const BASE_URL =  '/posts';

//모든 게시글 조회 
export const fetchPosts = async () => {
    try {
        const response = await axios.get(BASE_URL);
        return response.data;
    } catch (error) {
        console.error('Error fetching posts:', error.message);
        throw error;
    }
};

// 특정 게시글 조회 
export const fetchPostById = async (id) => {
    const response = await axios.get(`${BASE_URL}/${id}`);
    return response.data
};

// 게시글 생성 
export const createPost = async (postData) => {
    const response = await axios.post(BASE_URL, postData);
    return response.data;
};

// 게시글 수정 
export const updatePost = async (id, postData) => {
    const response = await axios.put(`${BASE_URL}/${id}`, postData);
    return response.data;
};

// 게시글 삭제 
export const deletePost = async (id) => {
    await axios.delete(`${BASE_URL}/${id}`);
    
};
