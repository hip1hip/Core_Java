import logo from './logo.svg';
import './App.css';
import React from 'react';
import PostList from './components/PostList';
import PostForm from './components/PostForm';


function App() {
  return (
    <div className="App">
      <h1>게시판</h1>
      <PostForm />
      <PostList />
    </div>
  );
}

export default App;
