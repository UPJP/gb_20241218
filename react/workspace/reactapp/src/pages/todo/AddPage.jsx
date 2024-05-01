import { createSearchParams, useSearchParams } from "react-router-dom";
import AddComponent from "../../components/todo/AddComponent";

function AddPage() {

    
    // const [queryParams] = useSearchParams();
    // const add =queryParams.get('add') ? parseInt(queryParams.get('add')) :1;
    // const size =queryParams.get('size') ? parseInt(queryParams.get('size')) :10;     

    // const queryStr= createSearchParams({page: add, size: size}).toString

    return (
        <div className="p-4 w-full bg-white">
            <div className="text-3xl font-extrabold">
                Todo Add Page
            </div>
            <AddComponent/>
        </div>
    );
}
export default AddPage;