import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        int compare = Arrays.compare(array1, array2);
        //compare 메소드는 왼쪽값이 크면 양수, 오른쪽값이 크면 음수, 같으면 0

        System.out.println(compare);
    }

}
