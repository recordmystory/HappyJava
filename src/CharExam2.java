public class CharExam2 {
    public static void main(String[] args) {
        char c1='a';

        System.out.println((int)c1);

        char c2=(char)97;

        System.out.println(c2+"\n");

        //문자 'a' 부터 'z' 까지 출력하는 문제
        char c3='a';
        while(c3<='z'){
            System.out.println(c3);
            c3++;
        }
    }

}
