import "./Heder.css";

function Heder(){
    return(
        <div className="Heder">
            <h3>오늘은 📅</h3>
            <h1>{new Date().toDateString()}</h1>
        </div>
    );
}
export default Heder;

