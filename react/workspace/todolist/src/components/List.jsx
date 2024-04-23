import { useState } from "react";
import "./List.css";
import TodoItem from "./TodoItem";

function List(){

const [input, useInput]= useState();

    return(
        <div className='List'>
            <h4>Todo List 🌱</h4>
            <input placeholder="검색어를 입력하세요"/>
            <div>
                <TodoItem/>
                <TodoItem/>
                <TodoItem/>
            </div>
        </div>
    );
}
export default List;

