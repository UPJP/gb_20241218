import { useState, useRef, useReducer } from 'react';
import './App.css'
import Editor from './components/Editor'
import Heder from './components/Heder'
import List from './components/List'

//임시 data 
const mockData = [
  {
    id: 0,            // db에서의 pk
    isDone: false,   // 선택을 위한 체크박스 값
    content: "React 공부하기",
    date: new Date().getTime(), //현재시각
  },
  {
    id: 1,            // db에서의 pk
    isDone: false,   // 선택을 위한 체크박스 값
    content: "빨래널기",
    date: new Date().getTime(), //현재시각
  },
  {
    id: 2,            // db에서의 pk
    isDone: false,   // 선택을 위한 체크박스 값
    content: "노래 연습하기",
    date: new Date().getTime(), //현재시각
  },

  
];

function reducer(state, action) {
  switch (action.type) {
    case 'CREATE': return [action.data, ...state];
    case 'UPDATE':
      return state.map((item) => item.id == action.targetID
        ? { ...item, isDone: !item.isDone }
        : item
      );

    case 'DELETE':
      return state.filter((item) => item.id != action.targetID);
    default : return state;
  }
}

function App() {
  // const [todos, setTodos] = useState(mockData);
  const [todos, dispatch] = useReducer(reducer, mockData);
  const idRef = useRef(3)

  const onUpdate = (targetID) => {
    dispatch({
      type: 'UPDATE',
      targetID: targetID
    })

    //todos state의 값들 중에서 targetId와 일치하는 
    // id를 갖는 투두 아이템의 isDone변경

    //todos배열에서 targetId와 일치하는 id를 갖는 요소의 isDone데이터만 토글로 바꾼 배열
    // setTodos(todos.map((todo) => {
    //   //삼항연산자로 표현
    //   return todo.id == targetID
    //   ? { ...todo, isDone: !todo.isDone }
    //   : todo

    // if (todo.id == targetID) {
    //   return{
    //     ...todo,
    //     isDone : !todo.isDone
    //   }
    // }
    // return todo;

    // }));
  }

  const onDelete = (targetID) => {
    dispatch({
      type: "DELETE",
      targetID: targetID
    })

    // todos 배열에서 targetID와 일치하는 id를 갖는 
    // 요소만 삭제한 새로운 배열
    // 즉, 삭제 대상이 아닌 영영 (targetID와 일치하지 않는 대상)만 필터링
    // setTodos(todos.filter((todo) => todo.id != targetID));
  }


  const onCreate = (content) => {
    dispatch({
      type: "CREATE",
      data: {
        id: idRef.current++,
        isDone: false,
        content: content,
        date: new Date().getTime(),
      }
    })

    // 나쁜 예 
    // todos.push(newTodo);

    // 스프레드 연산자로 기존의 todos데이터와 완전 동일한 테이터를 넣어주고,
    // 우리가 추가하려는 newtodo 데이터도 넣어준다.
    // setTodos([newTodo, ...todos]);

  }

  return (
    <div className='App '>
      <Heder />
      <Editor onCreate={onCreate} />
      <List todos={todos} onUpdate={onUpdate} onDelete={onDelete} />
    </div>
  )
}

export default App
