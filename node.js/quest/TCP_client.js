const net = require('net');       // 네트워크 관련 기능을 제공하는 net 모듈을 불러옴
const fs = require('fs');         // 파일 시스템 관련 기능을 제공하는 fs 모듈을 불러옴
const path = require('path');     // 파일 경로를 처리하는 path 모듈을 불러옴

// JSON 파일 경로 설정: __dirname은 현재 파일의 디렉토리 경로
const filePath = path.join(__dirname, 'data.json');

// 클라이언트 설정: 3000번 포트로 서버에 연결
const client = net.createConnection({ port: 3000 }, () => {
    console.log('서버에 연결되었습니다.'); // 서버와 연결되었을 때 출력되는 메시지

    // JSON 파일 읽기: 'data.json' 파일을 읽고 그 내용을 가져옵니다.
    fs.readFile(filePath, 'utf8', (err, data) => {
        if (err) {
            console.error('파일 읽기 오류:', err.message); // 파일 읽기 중 오류가 발생하면 메시지 출력
            client.end(); // 오류 발생 시 서버와의 연결 종료
            return;
        }

        try {
            // JSON 파싱 검증: 읽어온 파일 내용이 JSON 형식인지 확인
            const jsonData = JSON.parse(data); // JSON 데이터를 객체로 파싱

            // JSON 데이터 전송: 서버로 JSON 데이터를 전송
            client.write(data); // 파일의 JSON 내용을 서버로 전송
            console.log('JSON 파일 내용 전송 완료'); // 전송 완료 메시지 출력
        } catch (parseErr) {
            console.error('JSON 파싱 오류:', parseErr.message); // JSON 파싱 중 오류 발생 시 메시지 출력
            client.end(); // 오류 발생 시 서버와의 연결 종료
        }
    });
});

// 서버 응답 수신: 서버에서 응답이 오면 실행되는 부분
client.on('data', (data) => {
    try {
        const response = JSON.parse(data.toString()); // 서버의 응답을 JSON으로 파싱
        console.log('서버 응답:', response); // 서버 응답 출력
    } catch (error) {
        console.error('응답 JSON 파싱 에러:', error.message); // 응답 파싱 중 오류 발생 시 메시지 출력
    }
});

// 연결 종료: 서버와의 연결이 종료되면 실행되는 부분
client.on('end', () => {
    console.log('서버 연결 종료'); // 연결 종료 메시지 출력
});

// 에러 처리: 클라이언트에서 오류가 발생하면 실행되는 부분
client.on('error', (err) => {
    console.error('클라이언트 에러:', err.message); // 오류 메시지 출력
});