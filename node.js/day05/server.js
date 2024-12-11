const express = require('express')
const app = express()

app.use(express.static(__dirname + '/public')) //서버에 등록을 해야함
app.set('view engine', 'ejs')


//mongoDB 
const { MongoClient } = require('mongodb')

let db
const url = 'mongodb+srv://admin:admin1234@cluster0.qar0x.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0'
new MongoClient(url).connect().then((client)=>{
  console.log('DB연결성공')
  db = client.db('forum')
}).catch((err)=>{
  console.log("에러남")
  console.log(err)
})

app.listen(8080, () =>{
    console.log("http://localhost:8080 서버실행")
})

app.get('/', (요청,응답) =>{
    응답.sendFile(__dirname +'/mypage.html')
})

//mongoDB에 자료 넣기
app.get('/get', (요청,응답) =>{
  db.collection('post').insertOne({title:'어쩌구'})
  응답.send('오늘 비옴')
})

app.get('/list', async (요청,응답) =>{
  let result = await db.collection('post').find().toArray()
  console.log(result)

  응답.render('list.ejs' , { 글목록 : result, asd : new Date() })
})

 app.get('/fuck', async (요청,응답)=>{
  let result = await db.collection('post').find().toArray()
  console.log(result[0].title)

   // 모든 title만 추출
  result.forEach((item, index) => {
    console.log(`Title ${index + 1}: ${item.title}`);
  });
   
  응답.send('DB에 있던 게시물')
 })