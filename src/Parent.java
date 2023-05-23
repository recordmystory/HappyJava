public class Parent {
    public int i = 5; // 필드에 대한 오버라이딩
    public void printII(){
        System.out.println(i * 2);
    }

    public void printI(){ // 메소드에 대한 오버라이딩
        System.out.println("parent : printI() : "+i);
    }
}
