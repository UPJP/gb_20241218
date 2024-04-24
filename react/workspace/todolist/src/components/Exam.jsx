import { useReducer } from "react";

// param1 : 현재 스테이 값을 가져옴
// param2 : 액션 객체
function reducer(state,action){
    console.log(state, action);

    switch(action.type){
        case "INCREASE" :  return state + action.data;
        case "DECREASE" :  return state - action.data;
        default : return state;
    }


    // if(action.type == "INCREASE"){
    //    return state + action.data;
    // }else if(action.type == "DECREASE"){
    //     return state - action.data;
    // }
}

function Exam(){
    /*
        useReducer는 useState와 동일하게 새로운 state를 생성해서 
        배열의 첫번째 요소를 return
        dispatch라는 상태변화를 요청하기만 하는 요소를 반환해준다.
        즉, 컴포넌트 내부에서 dispatch를 함수를 호출하면
        상태변화가 요청이 되고, useReducer가 상태변화를 처리할 함수를 호출하게 된다
        그 함수는 직접 만들어야 한다.
        - 두번째 인수는 state의 초기값
    */
    const [state, dispatch] = useReducer(reducer, 0);

    //버튼이 클릭 되었을때 dispatch 선택 함수를 호출해서 state 상태변화를 요청
    const onClickPlus = ()=>{
        //dispatch를 호출해서 상태변화를 요청
        // 인수 : 상태가 어떻게 변화되기를 원하는지 객체로 전달
        // 객체내부 데이터는 내가 작성 -> 액션 객체라고 한다.
        dispatch({
            type : "INCREASE",
            data : 1
        });
    }
    const onClickMinus=() =>{
        dispatch({
            type : "DECREASE",
            data : 1
        })
    }

    return(
        <div>
            <h1>{state}</h1>
            <button onClick={onClickPlus}>+</button>
            <button onClick={onClickMinus}>-</button>
        </div>
    );
}

export default Exam;
