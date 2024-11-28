const net = require('net');

const server = net.createServer((socket) => {
  console.log('서버켜짐');

  socket.on('data', (data) => {
    console.log(`Received from client: ${data}`);

    socket.write(data);
  });

  socket.on('end', () => {
    console.log('서버꺼짐');
  });
});

//주소
const port = 8080;
server.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});