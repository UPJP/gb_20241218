import { useState } from 'react';
import './App.css'
import Editor from './components/Editor'
import Heder from './components/Heder'
import List from './components/List'

//임시 data 
const mockData=[
  {
    id      : 0,            // db에서의 pk
    isDone  : false,   // 선택을 위한 체크박스 값
    content : "React 공부하기",
    date    : new Date().getTime(), //현재시각
  },
  {
    id      : 1,            // db에서의 pk
    isDone  : false,   // 선택을 위한 체크박스 값
    content : "빨래널기",
    date    : new Date().getTime(), //현재시각
  },
  {
    id      : 2,            // db에서의 pk
    isDone  : false,   // 선택을 위한 체크박스 값
    content : "노래 연습하기",
    date    : new Date().getTime(), //현재시각
  }
];


function App() {
  
  const [todos, setTodos] = useState(mockData);

  const onCreate = (content) =>{
    const newTodo={
      id      : 0,            
      isDone  : false,  
      content : content,
      date    : new Date().getTime(), 
    }

    // 나쁜 예 
    // todos.push(newTodo);

    // 스프레드 연산자로 기존의 todos데이터와 완전 동일한 테이터를 넣어주고,
    // 우리가 추가하려는 newtodo 데이터도 넣어준다.
    setTodos([newTodo, ...todos]);

  }

  return (
    <div className='App '>
      <Heder/>
      <Editor onCreate={onCreate}/>
      <List/>
    </div>
  )
}

export default App
