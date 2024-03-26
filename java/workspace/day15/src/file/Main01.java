package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main01 {
	public static void main(String[] args) {
		// 저장할 파일의 경로
		final String PATH = "./test.txt";
//		final String PATH = "K:/test.txt";

		// 파일에 저장할 내용

		String write_string = "테스트 문자열 다시 입력";

		// 특정 인코딩 방식을 적용
		byte[] buffer = null;
		try {
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 파일 저장 절차 시작
		// 파일 저장을 위한 FileOutputStream은
		// 저장될 파일에 대한 경로를 생성자 파라티머로 설정해야 하고
		// 부모 형태로 암묵적 형변환을 처리한다
		OutputStream out = null;
		try {
			out = new FileOutputStream(PATH);
			// 파일 쓰기
			out.write(buffer);
			System.out.println("[INFO]파일 저장 성공 > " + PATH);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR]지정된 경로를 찾을수 없음>>" + PATH);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR]파일 저장 실패 >> " + PATH);
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("[ERROR]알 수 없는 에러 >> " + PATH);
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
