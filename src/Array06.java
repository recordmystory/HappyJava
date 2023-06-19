public class Array06 {
    public static void main(String[] args) {

        double[] array1 = new double[5];
        double[] array2 = {1.5, 2.4, 3.5};
        double[] array3;
        double[] array4 = null;
        //array3과 array4는 배열 인스턴스를 참조하지 않음. NullPointerException 발생.

        System.out.println(array1.length);
        System.out.println(array2.length);
    }


}
