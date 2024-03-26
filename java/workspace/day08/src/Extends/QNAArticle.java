package Extends;

public class QNAArticle extends Article {
	private String Answer;

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	@Override
	public String toString() {
		return "QNAArticle [글번호= " + getNum()
				+ ", 글제목=" + getTitle()
				+ " 답변=" + Answer + "]";
	}
	
}
