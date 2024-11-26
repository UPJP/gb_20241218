const express = require('express')
const app = express()

app.listen(8080, () => {
    console.log('http://localhost:8080 에서 서버 실행중')
})


//expess 라이브러리 함수 문법
app.get('/', (요청, 응답) => {
    응답.send('반갑다')
})

app.get('/news', function(요청, 응답) {
    응답.send('데이터보내기')
})

app.get('/html', function(요청, 응답) {
    응답.sendFile(__dirname + '/index.html')
    //__dirname = server.js 담긴 폴더
})

app.get('/mypage', (요청,응답) => {
    응답.sendFile(__dirname+ '/mypage.html')
})