public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if (str1.equals(str2)) { // 값이 같은지 비교
            System.out.println("str1과 str2의 값이 같다.");
        }

        String s = str1.toUpperCase(); // 소문자를 대문자로 바꿔 return
        System.out.println(s);
        System.out.println(str1);

        String substring = str1.substring(3);
        System.out.println(substring);
        System.out.println(str1);
    }

}
