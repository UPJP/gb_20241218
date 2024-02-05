package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		// ArrayList 생성
		List<People> plist 
			= new ArrayList<People>();
		
//		plist.add(new People("회원1", "01012345670"));
//		plist.add(new People("회원2", "01012345671"));
//		plist.add(new People("회원3", "01012345672"));
//		plist.add(new People("회원4", "01012345673"));
//		plist.add(new People("회원5", "01012345674"));
//		plist.add(new People("회원6", "01012345675"));
//		plist.add(new People("회원7", "01012345676"));
//		plist.add(new People("회원8", "01012345677"));
//		plist.add(new People("회원9", "01012345678"));
//		plist.add(new People("회원10", "01012345679"));
		
		// 10명의 데이터를 임의로 추가
		for(int i=0; i<10; i++) {
			People p = new People("회원"+i, "0101234567"+i);
			plist.add(p);
		}
		
		 System.out.println(plist.size());
		
		// 출력하기
		for(int i=0; i<plist.size(); i++) {
			// List에 저장된 데이터를 하나 꺼내면,
			// People 클래스 형의 객체다.
			People item = plist.get(i);
			System.out.println(item.toString());
		}
	}

}







