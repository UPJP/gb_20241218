//Express 예시임
const express = require('express');
const path = require('path'); 
const { callChatGPT } = require('./chatgpt');  //chatgpt.js 함수연결

const app = express();
const router = express.Router();  // express.Router() 객체 생성

app.set('view engine', 'ejs');  // EJS를 템플릿 엔진으로 사용
app.set('views', path.join(__dirname,'views')); //경로

// 요청 본문에 있는 JSON 데이터 파싱을 위한 미들웨어 설정
app.use(express.json()) // application/json 타입의 요청 데이터 파싱
app.use(express.urlencoded({ extended: true })) // application/x-www-form-urlencoded 타입의 데이터 파싱
// URL 인코딩된 데이터를 파싱하기 위한 미들웨어 설정

// GET 요청 처리: /ask 경로로 요청이 들어오면 askgpt 페이지를 렌더링
router.get('/ask', async function(req, res) {
	res.render('askgpt', {
    pass: true   // 렌더링할 때 pass 값을 true로 전달
  });
});

app.post('/ask', async (req, res) => {
  // 사용자가 요청한 프롬프트 데이터 (message) 추출
  const prompt = req.body.prompt;
  const response = await callChatGPT(prompt);  // ChatGPT API 호출하여 응답 받기

  if (response) {
    res.json({ 'response': response });   // 응답이 정상적으로 돌아오면 JSON 형식으로 응답
  } else { // 오류뜰경우 상태 코드 500과 함께 오류 메시지 전송
    res.status(500).json({ 'error': 'Failed to get response from ChatGPT API' });
  } 
});

// 라우터를 앱에 등록
app.use(router); 

const port = process.env.PORT || 3000; //(환경 변수 PORT가 없으면 기본 3000번 포트 사용)
app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);   // 서버 시작 메시지 출력
});