// .env 파일에 설정된 환경 변수 로드
require('dotenv').config();

// OpenAI API와 통신할 수 있도록 필요한 클래스 불러오기
const { configuration, OpenAIApi} = require("openai");

async function callChatGPT(prompt) {
    const configuration = new configuration({
        apiKey : process.env.OPENAI_API_KEY,   //OPENAI_API_KEY 홥경변수 함부로 발설 ㄴ
    });

    try {
         // OpenAI API 클라이언트 인스턴스 생성
        const openai = new OpenAIApi(configuration);

         // ChatGPT 모델에 대해 메시지를 보내고 응답 받기
        const response = await openai.createChatCompletion({
            model : "gpt-3.5-turbo",
            messages : [{role: "user", content : "하이"}],
        });

        // 응답에서 첫 번째 메시지 선택하여 반환
        return response.data.choices[0].messages;

    } catch(error){  //에러
        console.error('Error calling ChatGPT API:',error);
        return null;
    }
}

// 해당 함수 외부에서 사용할 수 있도록 내보내기
module.exports = { callChatGPT };