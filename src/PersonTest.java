public class PersonTest {
    public static void main(String[] args) {
       // Person p1; // p1은 Null 값을 가지고 있다. -> 이대로 p1을 사용하려고 하면 NullPointerException이 발생할 수 있다.

        Person p1 = new Person();
        Person p2 = new Person();

        p1.name="홍길동"; // 문자열의 경우 new를 사용하지 않고, 인스턴스를 사용할 수 있다.
        p1.address="일산";
        p1.isVip=true;
        p2.name="조조";
        p2.address="서울";


        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
       // System.out.println(p1.address.length()); //NullPointerException 발생 : 참조하는 게 없어서 오류 발생함.
        System.out.println(p1.isVip);
        System.out.println("----------------------");

        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);

    }
}
