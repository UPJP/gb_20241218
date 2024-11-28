const net = require('net');

const client = new net.Socket();

//주소
const port = 8080;
const host = 'localhost';

client.connect(port, host, () => {
  console.log(`Connected to server: ${host}:${port}`);

  // Send some data to the server
  client.write('ㅎㅇ');
});

client.on('data', (data) => {
  console.log(`Received from server: ${data}`);

  // Close the connection after receiving the response
  client.destroy();
});

client.on('close', () => {
  console.log('Connection closed');
});