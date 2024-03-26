package overload;

class Hello {
    // 생성자의 수 만큼 객체 생성 방법이 늘어나게 된다
    public Hello() {
        System.out.println("Hello");
    }
    public Hello(String msg) {
        System.out.println(msg);
    }
}

public class Main02 {
    public static void main(String[] args) {
        Hello h1 = new Hello();
        Hello h2 = new Hello("안녕");
    }
}