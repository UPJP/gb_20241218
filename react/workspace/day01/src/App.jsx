import Button from "./assets/components/Button"
import Footer from "./assets/components/Footer"
import Header from "./assets/components/Header"
import Main from "./assets/components/Main"
import Main2 from "./assets/components/Main2"

function App() {
  const ButtonProps ={
    text : "메일",
    color: "red",
    a    : 1,
    b    : 2,
    c    : 3,

  }

  return (
    <>
      {/* <Header/>
      <Main/>
      <Main2/>
      <Footer/> */}
      {/*
       {text : "메일",color: "red",a : 1,b : 2, c : 3,  } 
       ...ButtonProps : 스프레드 연산자
          ->ButtonProps의 내용을 펼쳐서 나열해
      */}
      <Button {...ButtonProps}/>
      <Button text={"카페"}/>
      <Button text={"블로그"}>
        <div>자식요소</div>
        <Header/>
      </Button>

    </>
  )
}

export default App
