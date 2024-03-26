/**
 * 
 */
function sendit() {
		// form의 아이디 값으로 각 input 값을 접근
		// 각 인풋 빈값 체크 -> alert
		// 비밀번호 8자리 이상 체크 -> alert
		// 전부 입력 후, submit();
		alert("test");
		let joinForm = document.getElementById("joinForm");
		let useridTag = document.getElementById("userid");
		let userpwTag = document.getElementById("userpw");
		let usernameTag = document.getElementById("username");
		let userphoneTag = document.getElementById("userphone");
		// name 값으로 접근하는 방법
		// joinForm.userid 

		if(useridTag.value == "") {
			alert("아이디를 입력하세요");
			useridTag.focus();
			return false;
		}
		if(userpwTag.value == "") {
			alert("비밀번호를 입력하세요");
			userpwTag.focus();
			return false;
		}
		if(userpwTag.value.length < 8) {
			alert("비밀번호를 8자 이상으로 작성하세요");
			userpwTag.focus();
			return false;
		}
		if(usernameTag.value == "") {
			alert("이름을 입력하세요");
			usernameTag.focus();
			return false;
		}
		if(userphoneTag.value == "") {
			alert("휴대폰 번호를 입력하세요");
			userphoneTag.focus();
			return false;
		}
		joinForm.submit();
	}