import { useState, useEffect, useRef } from 'react'
import './App.css'
import Controller from './components/Controller'
import HookExam from './components/HookExam'
import Viewer from './components/Viewer'
import Even from './components/Even'


function App() {

  const [count, setCount] = useState(0);
  const [input, setInput] = useState("")

  //아직 mount 되지 않았다 -> falte
  const isMount = useRef(false);

  // 1. 마운트 : 탄생
  useEffect(() => {
    console.log('mount');
  }, []);

  // 2. 업데이트 : 변화 , 리렌더링 
  // deps 생략 : 콜백함수는 리렌더링 될 때 마다 실행한다
  useEffect(() => {
    if(!isMount.current){
      isMount.current = true;
      return ;  // 강제종료, 즉 최초의 1번은 update실행되지 않으
    }
    console.log('update');
  });


  //첫번째 인수 : 콜백함수
  //주번째 입수 : 배열
  // 배열에 들어가있는 값이 바뀌면, 
  // sideEffect로 첫번째 전달한 콜백함수를 실행
  // useEffect(()=>{
  //count : 100
  // ``: 백틸(backtick)
  // console.log(`count : ${count} / ${input}`);
  // },[count, input]);

  // Controller는 count와 setCount가 둘다 필요하다.
  // 각각 넘겨줄수도 있지만, event 핸들러를 만들어서 그 자체를 넘겨줄수도 있다.
  const onClickButton = (value) => {
    //value : +10인지 -100인지 선택한 숫자 값
    setCount(count + value);
    // console.log(count);
  }


  return (
    <div className='App'>
      {/* <HookExam/> */}
      <h1>Simple Counter</h1>
      <section>
        <input value={input} onChange={(e) => {
          setInput(e.target.value);
        }} />
      </section>
      <section>
        <Viewer count={count} />
        {count % 2== 0 ? <Even/> : null }
      </section>
      <section>
        <Controller onClickButton={onClickButton} />
      </section>
    </div>
  )
}

export default App
