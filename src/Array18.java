import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};

        Arrays.sort(array);

        // 어느 값과 값 사이의 중간값을 찾는 것. binarysearch를 하기 위해서는 배열의 값이 정렬되어 있어야한다.
        int i=Arrays.binarySearch(array,4);
            System.out.println(i);
        }
    }


