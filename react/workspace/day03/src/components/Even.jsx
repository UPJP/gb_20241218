import { useEffect } from "react";

function Even ()  {

    
    useEffect(()=>{
        // 콜뱀함수 안에서 return으로 새로운 함수를
        // reutnr하면, useEffect의 콜백함수가 
        // return해주는 함수를 클린업, 정리함수라고 판단한다.
        // useEffect가 끝날떄 실행된다
        return () =>{
            console.log("unmount")
        }
    },[]);

    return (
        <div>
            짝수입니다. 
        </div>
    );
}
export default Even;