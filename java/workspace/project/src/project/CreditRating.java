package project;
// 새로운 신용등급 생성자 생성
public class CreditRating {
    int score;
    String grade;

    public CreditRating(int score, String grade) {
        this.score = score;
        this.grade = grade;
    }

    public String toString() {
        return "점수: " + score + ", 등급: " + grade;
    }
}
