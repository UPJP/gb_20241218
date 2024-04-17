const Main = () => {
    const number = 11;
    const obj = {a:1};

    return (
        <main>
            <h1>main</h1>
            <h2>{number % 2 == 0 ? "짝수" : "홀수"}</h2>
            {10}
            {number}
            {[1,2,3]}                 {/*렌더링*/}
            <hr/>
            {true}
            {undefined}
            {null}                    {/*렌더링 안됨*/}
            {obj.a}
            
        </main>
    );
}
export default Main;