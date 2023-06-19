import javax.xml.transform.stream.StreamSource;

public class Array03 {
    public static void main(String[] args) {
        int[] array1=new int[5]; //이러한 선언 방식은 키보드로부터 입력받은 값을 배열에 넣어줄 때 사용함.
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        int[] array2=new int[]{1,2,3,4,5};
        int[] array3={1,2,3,4,5};

        System.out.println("array1의 값 출력");
        for(int i=0; i<5; i++){
            System.out.println(array1[i]);
        }

        System.out.println("array2의 값 출력");
        for(int i =0; i<5; i++){
            System.out.println(array2[i]);
        }
        System.out.println("array3의 값 출력");
        for(int i =0; i<5; i++){
            System.out.println(array3[i]);
        }
    }

}
