public class UserExam {
    public static void main(String[] args) {
        User user = new User("김지우", "ss@naver.com");
       /*  System.out.println(user.name); -> private으로 설정했기 때문에 오류 발생.
        사용하려면 getter, setter 만들어줘야됨. */

        System.out.println("\n"+user+"\n");

        System.out.println(user.getName());
        System.out.println(user.getEmail());

        User user2 = new User("홍길동", "gg@naver.com", "1234");

        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());

        System.out.println("\n"+user2+"\n");

    }
}
