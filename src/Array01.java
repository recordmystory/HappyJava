import javax.xml.transform.stream.StreamSource;

public class Array01 {
    public static void main(String[] args) {
        int[] array1;
        int array2[];
        int array3[];

        array1=new int[5];
        array2=new int[5];
        array3=new int[0];

        System.out.println(array1.length); //array.length 배열 길이 출력
        System.out.println(array2.length);
        System.out.println(array3.length);
    }
}
