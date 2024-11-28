const net = require('net');       // 네트워크 관련 기능을 제공하는 net 모듈을 불러옴
const fs = require('fs');         // 파일 시스템 관련 기능을 제공하는 fs 모듈을 불러옴
const path = require('path');     // 파일 경로를 처리하는 path 모듈을 불러옴

// 로그 폴더 경로 설정: __dirname은 현재 파일의 디렉토리 경로
const logDir = path.join(__dirname, 'log'); 

// 만약 'log' 폴더가 없다면, 해당 폴더를 생성
if (!fs.existsSync(logDir)) fs.mkdirSync(logDir);

// TCP 서버 생성
const server = net.createServer((socket) => {
    console.log('클라이언트 연결됨'); // 클라이언트가 연결되었을 때 출력되는 메시지

    let dataBuffer = ''; // 데이터를 누적할 변수 (중간에 끊길 수 있기 때문에, 수신한 데이터를 여기에 누적함)

    // 데이터 수신 이벤트: 클라이언트로부터 데이터가 오면 실행됨
    socket.on('data', (chunk) => {
        dataBuffer += chunk.toString();  // 수신한 데이터를 문자열로 변환하여 dataBuffer에 추가

        try {
            // 수신된 데이터를 JSON 형식으로 파싱 (JSON 문자열 -> JavaScript 객체)
            const jsonData = JSON.parse(dataBuffer);

            // jsonData가 배열인 경우만 처리 (배열이 아닐 경우 에러)
            if (Array.isArray(jsonData)) {
                // jsonData 배열을 순회하면서 각각의 객체를 파일로 저장
                jsonData.forEach((item, index) => {
                    // 예를 들어 객체 속성에 따라 파일명을 다르게 지정하거나 내용 구조를 다르게 설정할 수 있음
                    const fileName = `data${index + 1}.json`; // 파일 이름을 data1.json, data2.json ... 로 설정
                    const filePath = path.join(logDir, fileName); // 로그 폴더 내에 파일 경로 설정

                    // 객체를 파일에 저장 (객체를 JSON 형태로 파일에 저장)
                    fs.writeFileSync(filePath, JSON.stringify(item, null, 2), 'utf-8');
                    console.log(`${fileName} 저장 완료`); // 파일이 저장되었음을 콘솔에 출력
                });

                // JSON 데이터 처리 완료 후 클라이언트에게 응답
                socket.write(JSON.stringify({ status: 'success', message: 'JSON 데이터 처리 완료' }));
            } else {
                // jsonData가 배열이 아닐 경우
                console.error('올바르지 않은 데이터 형식: JSON 배열이 아닙니다.');
            }
        } catch (error) {
            // JSON 파싱 오류가 발생한 경우 (데이터가 완전하지 않거나 형식이 잘못된 경우)
            console.error('JSON 파싱 실패:', error.message);
        }
    });

    // 연결 종료 이벤트: 클라이언트가 연결을 종료할 때 실행됨
    socket.on('end', () => {
        console.log('클라이언트 연결 종료');
    });

    // 에러 처리 이벤트: 소켓에 에러가 발생할 경우 실행됨
    socket.on('error', (err) => {
        console.error('소켓 에러:', err.message);
    });
});

// 서버 실행: 3000 포트에서 TCP 서버 시작
const PORT = 3000;
server.listen(PORT, () => {
    console.log(`TCP 서버가 ${PORT} 포트에서 실행 중입니다.`);
});