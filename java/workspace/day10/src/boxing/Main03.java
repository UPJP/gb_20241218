	package boxing;

public class Main03 {

	public static void main(String[] args) {
		//부대지정
		Unit[] units =new Unit[5];		
		units[0] =new AirForce("공군1호");
		units[1] =new AirForce("공군2호");
		units[2] =new Navy("해군1호");
		units[3] =new Army("육군1호");
		units[4] =new Army("육군2호");
		
		//부대 일괄 공격
		//intanceof 사용해서 작성
		//Unit[i] 인슨턴스 클래스 3개와 비교
		

		for(int i=0; i<units.length; i++) {
			units[i].attack();
			if(units[i] instanceof Army){
				Army a = (Army)units[i];
				a.tank();
		}else if(units[i] instanceof Navy) {
			Navy n = (Navy)units[i];
			n.nucleus();
		}else if(units[i] instanceof AirForce){
			AirForce f =(AirForce) units[i];
			f.bombing();
		}
	
		}

	}

}
