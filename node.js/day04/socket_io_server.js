const http = require('http');
const { Server } = require("socket.io");
const httpServer = http.createServer();
const io = new Server(httpServer, {cors: {
      origin: "*" // 모든 출처에서의 요청 허용 (CORS 정책 설정)
    }
});

io.on('connection', (socket) => {
  console.log('A client has connected');
  
  // 클라이언트로부터 'message' 이벤트가 오면 처리
  socket.on('message', (message) => {
    console.log(`Received message: ${message}`);
    socket.emit('message', message); // 클라이언트에게 다시 메시지 전송
  });

  socket.on('disconnect', () => {
    console.log('A client has disconnected');
  });
});

httpServer.listen(3000, () => {
  console.log('Server is listening on port 3000');
});