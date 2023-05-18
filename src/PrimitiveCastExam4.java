public class PrimitiveCastExam4 {
    public static void main(String[] args) {
        short x2 =50;
        int i2 = (int)x2;

        System.out.println(x2);
        System.out.println(i2);

        long x3=Long.MAX_VALUE;
        int i3=(int)x3;
        // Long 타입인 x3을 더 작은 byte인 int 타입에다 넣으려니까 오버플로우가 발생한다. ->음수 값 출력
        System.out.println(x3);
        System.out.println(i3);

        // 형 변환시에 크키가 큰 타입을 작은 타입에 저장할 때는 오버플로우를 조심해야 된다.
    }
}
