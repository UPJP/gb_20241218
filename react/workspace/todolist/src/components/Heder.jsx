import "./Heder.css";
import { memo } from "react";

function Heder(){
    return(
        <div className="Heder">
            <h3>오늘은 📅</h3>
            <h1>{new Date().toDateString()}</h1>
        </div>
    );
}

// const modizedHeader = memo(Heder);
// export default modizedHeader;

export default memo(Heder);
