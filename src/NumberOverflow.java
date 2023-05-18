public class NumberOverflow {
    public static void main(String[] args) {
        int value = 10;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(value + 1);
        System.out.println(maxInt + 1);

        // 정수와 실수는 메모리에 저장되는 방식이 다르다.

        double d1 =50;
        double d2=500L;

        System.out.println(d1); // 묵시적 형변환
        System.out.println(d2);

       // int d3 = 50.0;  -> 오류 발생
        // double형엔 정수를 넣을 수 있지만, int형엔 실수를 넣을 수 없다.

        int i1=(int)50.0; // 형변환을 해줬기 때문에 오류가 발생하지 않는다.
        int i2 =(int)25.6f;

        System.out.println(i1); // 출력시 소수점 잘림 현상 발생
        System.out.println(i2);

    }
}
