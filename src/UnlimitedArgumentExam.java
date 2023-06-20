

public class UnlimitedArgumentExam {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(1, 2, 4, 2));
        System.out.println(sum(3, 1, 2, 3, 4, 1));
    }

    public static int sum(int... args) { // int ... : 정수를 여러 개 받을 수 있음, args는 배열처럼 취급됨.
        System.out.println("print1 메소드 - args 길이: " + args.length);
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
