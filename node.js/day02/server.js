const express = require('express')
const app = express()

app.use(express.static(__dirname + '/public')) //서버에 등록을 해야함

app.listen(8080, () =>{
    console.log("http://localhost:8080 서버실행")
})

app.get('/', (요청,응답) =>{
    응답.sendFile(__dirname +'/mypage.html')
})