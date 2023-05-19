public class Person {
    String name; // 인스턴스 필드 -> printCount() 메소드 안에서는 사용이 불가능하다. printCount() 메소드가 static이기 때문.
    String address;
    boolean isVip;
    static int count;

    static{ // 클래스 필드는 static 블록에서 초기화 할 수 있다.
        count=100;
    }

    public void printName(){
        System.out.println("내 이름은 " + name);
    }

    public static void printCount(){
        System.out.println("Count : "+count);
    }
}
