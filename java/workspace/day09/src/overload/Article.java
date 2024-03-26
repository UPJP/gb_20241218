package overload;

/*	
 	파라미터가 서로 다른 생성자들이 하나의 완전한 생성자를
	호출하도록 하여, 데이터의 초기화를 한 곳에서 일괄적으로 
	처리하도록 구현할 수 있다.
*/

public class Article {
	private int seq;
	private String subject;
	private String wirter;
	private int hit; 
	
	public Article(int seq, String subject, String wirter, int hit) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.wirter = wirter;
		this.hit =hit;
		
	}
// 위 this 처럼 선언을 했을경우 오버로드 기능을 이용하여 짧게 만들수 있음 
	public Article(int seq) {
//		this.seq =seq;
//		this.subject = "제목없음";
//		this.wirter = "익명";
		this(seq, "제목없음","익명",0);
	}
	

	public Article(int seq, String subject) {
//		this.seq =seq;
//		this.subject = subject;
//		this.wirter = "익명";
		this(seq, subject,"익명",0);
	}	
	
	@Override
	public String toString() {
		return "Article [seq=" + seq + 
				", subject=" + subject + 
				", wirter=" + wirter + 
				", hit=" + hit + "]";
	}
	
}
