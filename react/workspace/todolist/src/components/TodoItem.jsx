import "./TodoItem.css"

function TodoItem({id,isDone, content, date, onUpdate, onDelete}) {
const onChangeCheckbox=()=>{
    onUpdate(id);
}
const onClickDeletButton=()=>{
    onDelete(id);
}

    return(
        <div className="TodoItem">
            <input type="checkbox" 
                checked={isDone} 
                onChange={onChangeCheckbox}

                    />
            <div className="content">{content}</div>
            <div className="date">{new Date(date).toLocaleDateString()}</div>
            <button onClick={onClickDeletButton}>삭제</button>
        </div>
    );
}
export default TodoItem;