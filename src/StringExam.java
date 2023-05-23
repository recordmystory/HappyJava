public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello"; // str1과 str2는 같은 값을 참조한다.
        String str3 = new String("hello");
        String str4 = new String("hello"); // new를 사용할시엔 무조건 메모리상에 다른 영역을 차지하게 된다.

        if (str1 == str2)
            System.out.println("str1 == str2");
        if (str1 == str3)
            System.out.println("str1 == str3");
        if (str3 == str4)
            System.out.println("str3 == str4");
        // 여기서 ' == ' 는 같은 것을 참조하는지 비교하는 뜻이다.

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

    // String을 사용할 때는 new 사용을 지양하자. new를 쓸때마다 메모리를 차지한다.
}
