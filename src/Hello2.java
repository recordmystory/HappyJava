public class Hello2 {
    static int i = 0;
    static{
        i=500;
        System.out.println("static block");
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    // main 메소드보다 먼저 실행되는 static 블록
}
