package Static;

public class Main01 {
	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
		Article.setCount(1);
		Article a1 = new Article(1, "첫 글", "2024-01-03");
		
		Article.setCount(2);
		Article a2 = new Article(2, "두번쨰 글", "2024-01-03");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}
}
