import { useParams, useNavigate, useSearchParams, createSearchParams } from "react-router-dom";

function ReadPage() {
    const { tno } = useParams();
    const navigator = useNavigate();
    const [queryParams] = useSearchParams();

    const page =queryParams.get('page') ? parseInt(queryParams.get('page')) :1;     
    const size =queryParams.get('size') ? parseInt(queryParams.get('size')) :10;    
    const queryStr = createSearchParams({ page: page, size: size }).toString();

    const moveToModify = (tno) => {
        // /todo/modify/tno
        navigator({
            pathname: `/todo/modify/${tno}`,
            search: queryStr
        });
    }

    return (
        <div className="text-3xl font-extrabold">
            Todo Read page Component
            <div>
                <button onClick={() => { moveToModify(tno) }}>Test Modify</button>
            </div>
        </div>
    );
}

export default ReadPage; 