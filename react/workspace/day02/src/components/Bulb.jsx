import { useState } from "react";

const Bulb = () => {
    const [light, setLight] = useState("OFF");
    console.log(light);
  
    return (
      <div>
        {light == "ON" ?
          (<h1 style={{ backgroundColor: "orange" }}>ON</h1>)   // 로그인 회원가입 3항연산자로 만들기
          :
          (<h1 style={{ backgroundColor: "grey" }}>OFF</h1>)
        }
        <button
            onClick={() => {
              setLight(light == "ON" ? "OFF" : "ON")
            }}
          >{light == "ON" ? "끄기" : "켜기"}</button>
      </div>
    );
  }

export default Bulb;