import { Suspense, lazy } from "react";
import { Navigate } from "react-router-dom";

const Loding = <div className={'bg-purple-200'}>Loding</div>;                            //로딩페이징 구성
const TodoList = lazy(()=> import("../pages/todo/ListPage")); 
const todoRouter=()=>{
    return [
        {
            path : 'list',  //todo/list
            element :<Suspense fallback={Loding}><TodoList /></Suspense>,
        },
        {
            path : '',  //todo/ 요청이 오면 todo/list로 redirection
            element : <Navigate replace={true} to={'list'} > </Navigate>
        },
    ]
};

export default todoRouter;