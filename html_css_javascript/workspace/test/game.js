// myCanvas영역
let canvas = $("#myCanvas")[0];
let ctx = canvas.getContext("2d");
let w = $("#myCanvas").width();
let h = $("#myCanvas").height();
// 뱀과 먹이의 크기
let sq = 15;
let food = {};
let snake = {};
// 게임 시작 후 처음 움직이는 방향설정
let velocityX = 0,
   velocityY = 0;
let tailLength = 1;
let trail = [];


//먹이의 위치를 랜덤으로 추출
function placeFood() {
 food = {
  // 해당 영역의 너비만큼 sq의 길이를 빼준다 
  x : Math.round(Math.random()*(w-sq)/sq),
  y : Math.round(Math.random()*(h-sq)/sq)
 }
}

// 뱀의 위치를 랜덤으로 추출
function placeSnake() {
 snake = {
  x : Math.round(Math.random()*(w-sq)/sq),
  y : Math.round(Math.random()*(h-sq)/sq)
 }
}

// 위치에 맞춰 색을 넣어준다.
function paint_cell(x,y, color){
 ctx.fillStyle=color;
 ctx.fillRect(x*sq,y*sq,sq,sq);
 ctx.strokeStyle="white";
 ctx.strokeRect(x*sq,y*sq,sq,sq);
}

// food와 snake의 위치를 최초 세팅
placeFood();
paint_cell(food.x, food.y, "grey");
placeSnake();
paint_cell(snake.x, snake.y, "green");

// 키 입력 처리
function keyPush(evt) {
   switch (evt.keyCode) {
       case 37: // 왼쪽 화살표
           if (velocityX !== 1) {
               velocityX = -1;
               velocityY = 0;
           }
           break;
       case 38: // 위쪽 화살표
           if (velocityY !== 1) {
               velocityX = 0;
               velocityY = -1;
           }
           break;
       case 39: // 오른쪽 화살표
           if (velocityX !== -1) {
               velocityX = 1;
               velocityY = 0;
           }
           break;
       case 40: // 아래쪽 화살표
           if (velocityY !== -1) {
               velocityX = 0;
               velocityY = 1;
           }
           break;
   }
}

// 게임 루프
function game() {
    // 캔버스 초기화
    ctx.clearRect(0, 0, w, h);

    // 뱀의 위치 업데이트
    snake.x += velocityX;
    snake.y += velocityY;

    // 뱀 그리기
    paint_cell(snake.x, snake.y, "green");

    // 먹이 그리기
    paint_cell(food.x, food.y, "grey");

    // 뱀의 머리를 trail 배열에 추가
    trail.push({
        x: snake.x,
        y: snake.y
    });

    // trail 배열이 일정 길이보다 길어지면 꼬리 부분 제거
    while (trail.length > tailLength) {
        trail.shift();
    }

    // 뱀의 꼬리 그리기
    for (let i = 0; i < trail.length; i++) {
        paint_cell(trail[i].x, trail[i].y, "green");

        // 뱀의 머리와 꼬리가 겹칠 경우 게임 오버
        if (trail[i].x === snake.x && trail[i].y === snake.y && i !== trail.length - 1
            && snake.x >= w && snake.y >= h) {
            // 게임 오버 처리
       
            alert("종료");
        }
    }

    // 뱀이 먹이를 먹었을 때
    if (snake.x === food.x && snake.y === food.y) {
        tailLength++; // 꼬리 길이 증가
        placeFood(); // 새로운 먹이 배치
        paint_cell(food.x, food.y, "grey"); // 새로운 먹이 그리기

        // 현재 요소의 값을 가져옵니다.
        var currentValue = parseInt(document.getElementById("current").innerHTML);

        // 값을 1 증가시킵니다.
        var newValue = currentValue + 1;

        document.getElementById("current").innerHTML = newValue
    }
}

// window.onload 이벤트 설정
window.onload = () => {
   document.addEventListener("keydown", keyPush);
   setInterval(game, 1000 / 15); // 게임 루프를 15프레임으로 설정
};
