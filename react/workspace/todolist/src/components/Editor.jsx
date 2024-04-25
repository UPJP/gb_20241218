import { useState, useRef, useContext } from "react";
import "./Editor.css"
import {  TodoDispatcherContext } from "../App";

function Editor() {
    // 구조분해 할당으로 {onCreate만 받아온다}
    const {onCreate} = useContext(TodoDispatcherContext);
    
    //input박스 onChage 이벤트 ,
    // 이벤트가 발생할 때 마다 입련된 content값을 
    // useState훅 값을 가지고 있는  처리 
    const [content, setContent] = useState("");
    const contentRef = useRef();

    function onChage(e) {
        setContent(e.target.value)

        if (e.key === "Enter") {
            onCreate(content);

        }
    }

    const onSubmit = () => {
        if (content == "") {
            contentRef.current.focus();
            alert("할일을 입력해주세요");
            return;
        }
        onCreate(content);
        setContent("");

    }

    const onkeydown = (e) => {
        if (e.keyCode == 13) { //enter
            onSubmit();
        }
    }
    return (
        <div className="Editor">
            <input
                ref={contentRef}
                value={content}
                onChange={onChage}
                onKeyDown={onkeydown}
                placeholder="새로운 todolist..."
            />
            <button onClick={onSubmit}>추가</button>
        </div>
    );

}
export default Editor;

