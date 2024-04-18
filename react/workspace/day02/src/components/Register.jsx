import { useState, useRef } from "react";
// import { useRef } from "react"; 위처럼 한줄로 표현 가능
// useState는 자주 변경되는거 바꾸기 위해서 존재하는거임
// useRef는 리렌더링 되더 값이 변경되지 않음

//회원가입폼
// 1.이름
// 2. 생년월일
// 3. 국적
// 4. 자기소개

let count = 0;
function Register() {
    // const [name, setName] = useState("이름");
    // const [birth, setBirth] = useState("");
    // const [coutry, setCoutry] = useState("");
    // const [bio, SetBio] = useState("");              반복됨

    const [input, setInput] =useState({
        name: "",
        birth: "",
        contry: "",
        bio: "",
    })
    console.log(input)
    
    const refObj = useRef(0)
    const inputRef = useRef();
//  console.log("register 컴포넌트 실행!!");


   
    const onChange =(e) =>{
        // console.log(e.target.value, e.target.name)
        // count++;
        // console.log(count);
        refObj.current++;
        // console.log(refObj.current);
        // console.log(e.target.value, e.target.name);
        setInput({
            ...input,
            [e.target.name] : e.target.value,
            
        });
    }
    const onSubmit =()=>{
        // DOM 요소에 접근하기 위해서는 useRef 객체 사용
        if(input.name == ""){
            console.log(inputRef.current);
            inputRef.current.focus();
            alert("이름 작성해주세요")
        }
    };


    // const onChangeName = (e)=>{
    //     setInput({
    //         ...input, 
    //         name: e.target.value
    //     });
    // }
    // const onChangeBirth = (e)=>{
    //     setInput({
    //         ...input, 
    //         birth: e.target.value
    //     });
    // }
    // const onChangeCoutry = (e)=>{
    //     setInput({
    //         ...input, 
    //         contry: e.target.value
    //     });
    // }
    // const onChangeBio = (e)=>{
    //     setInput({
    //         ...input, 
    //         bio: e.target.value
    //     });
    // }

    // const onChangeName = (e)=>{
    //     setName(e.target.value);
    // }
    // const onChangBirth = (e)=>{
    //     setBrith(e.target.value);
    // }    
    // const onChangeCountry = (e)=>{
    //     setCountry(e.target.value);
    // }
    // const onChangeBio = (e)=>{
    //     setBio(e.target.value);
    // }

    return (
        <div>
            {/* <button
                onClick={()=>{
                    refObj.current++;
                    console.log(refObj.current);
                }}
            >ref + 1</button> */}
            <div>
                <input ref={inputRef} onChange={onChange} name="name" value={input.name} placeholder="이름" />
                {/* {name} */}
            </div>
            <div>
                <input type="date" onChange={onChange} name="birth" value={input.birth} />
                {/* {birth} */}
            </div>


            <div>
                <select onChange={onChange} name="contry" value={input.coutry}>
                    <option value=""></option>
                    <option value="kr">한국</option>
                    <option value="us">미국</option>
                    <option value="uk">영국</option>
                </select>
                {input.coutry}
            </div>

            <div>
                <textarea  value={input.bio}  name="bio" onChange={onChange}/>
                {input.bio}
            </div>
            <button onClick={onSubmit}>제출</button>
        </div>
    );
}

export default Register;