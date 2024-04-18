import './Login.css'

//로그인 페이지 해더  회원가입/로그인
function LoginHeader() {
    return (
        <header>
            <div style={{ display: 'flex' }}>
                <nav>
                    {/* 로그인 */}
                    <button>로그인</button>
                </nav>
                <nav>
                    {/* 회원가입 */}
                    <button>회원가입</button>
                </nav>
            </div>
        </header>
    );
}
//로그인 페이지 메인 
function LoginMain() {
    return (
        <main>
            <div className="LoginMainBody">
                <input type="text" placeholder={"이름"} />
                <input type="text" placeholder={"Email"} />
                <input type="text" placeholder={"비밀번호 6자리 이상입력"} />

                {/* -- BIRTH START--*/}
                <div>
                    <h3><label form="yy">생년월일</label></h3>

                    <div id="bir_wrap">
                    
                        {/* <!-- BIRTH_YY --> */}
                        <div id="bir_yy">
                            <span className="box">
                                <input type="text" id="yy" className ="int" maxLength="4" placeholder="년(4자)"/>
                            </span>
                        </div>

                        {/* <!-- BIRTH_MM --> */}
                        <div id="bir_mm">
                            <span className="box">
                                <select id="mm">
                                    <option>월</option>
                                    <option value="01">1</option>
                                    <option value="02">2</option>
                                    <option value="03">3</option>
                                    <option value="04">4</option>
                                    <option value="05">5</option>
                                    <option value="06">6</option>
                                    <option value="07">7</option>
                                    <option value="08">8</option>
                                    <option value="09">9</option>                                    
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </span>
                        </div>

                        {/* <!-- BIRTH_DD --> */}
                        <div id="bir_dd">
                            <span className="box">
                                <input type="text" id="dd" className="int" maxLength="2" placeholder="일"/>
                            </span>
                        </div>

                    </div>
                    <span className="error_next_box"></span>    
                </div>
                {/* -- BIRTH END--*/}
            </div>
            <input type='checkbox'/>개인정보수집·이용약관 동의 <a>보기</a>

        </main>
    );
}
//로그인 페이지 푸터    소셜로그인 
function LoginFooter() {
    return (
        <footer>


        </footer>
    );
}


function Login() {
    return (
        <div className="Login">
            <LoginHeader />
            <LoginMain />
            <LoginFooter />
        </div>
    );
}

export default Login;