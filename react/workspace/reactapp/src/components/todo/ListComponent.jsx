import { useEffect, useState } from "react";
import useCustomMove from "../../hooks/useCustomMove";
import { getList } from "../../api/todoApi";
import PageComponent from "../common/PageComponent";

const initState = {
    dtoList: [],
    pageNumberList: [],
    pageRequestDTO: null,
    prev: false,
    next: false,
    totalCount: 0,
    prevPage: 0,
    nextPage: 0,
    totalPage: 0,
    urrent: 0
}

function ListComponent() {
    const [serverData, setServetData ] = useState(initState);

    const { page, size, moveToList, moveto} = useCustomMove();

    useEffect(() => {
        getList({ page, size }).then(data => {
            console.log(data);
            setServetData(data);
        });
    }, [page, size]);

    return (
        <div className="border-2 border-blue-100 mt-10 mr-2 ml-2">
            <div className="flex flex-wrap mx-auto justify-center p-6">
                {serverData.dtoList.map(todo =>
                    <div key={todo.tno} className="w-full min-w-[400px] p-2 m-2 rounded shadow-md  bg-white">
                        <div className="flex ">
                            <div className="font-extrabold text-2xl p-2 w-1/12">{todo.tno}</div>
                            <div className="text-1xl m-1 p-2 w-8/12 font-extrabold">{todo.title}</div>
                            <div className="text-1xl m-1 p-2 w-2/10 font-medium">{todo.dueDate}</div>
                        </div>
                    </div>
                )}
            </div>
            <PageComponent serverData={serverData} movePage={moveToList}/>
        </div> 
    );
}

export default ListComponent;