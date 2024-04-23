import{ useState } from "react";
import useInput from "../hooks/useInput";

//get을쓰면 외부에서 호출이 불가하지만 접두사로 use라는 명칭을 붙여주면 
//react 내부에서는 커스텀 hook 이라고 이해한다. 
// function useInput(){
//     const [input, setInput] =useState();
//     const onChange =(e) =>{
//         setInput(e.target.value)
//     }
//     return [input, onChange];
//     //배열로 input, onChange를 return 
// }
// 1. 함수 컴포넌트, 커스텀 훅 내부에서만 호출 가능
//const state = useState();

function HookExam() {
    // const state = useState();
    
    // 조건부, 반복문 에서는 호출이 불가하다.
    // if(true){
    //     const state = useState();
    // }
    const [인풋, 변수1] = useInput();
    const [인풋2, 변수2] = useInput();
    
    return(
        <>
          <div>HookExam</div>
          <input value={인풋} onChange={변수1}/>
        </>
    );
}
export default HookExam;