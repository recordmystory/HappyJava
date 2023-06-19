public class Array14 {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);

        //copyFrom과 copyTo는 서로 다른 배열 인스턴스를 참조한다. 그러므로 if문을 사용해 copyFrom과 copyTo를 비교했을 때 같지 않다고 나온다.

        for (int c : copyTo) {
            System.out.println(c);
        }
        System.out.println("--------------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5); // 5개짜리 배열에 1,2,3이 복사가 되고 나머지는 0을 갖게됨.

        for (int c : copyTo2) {
            System.out.println(c);
        }
    }
}
