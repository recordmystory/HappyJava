public class MathBeanTest {
    public static void main(String[] args) {
        MathBean m1=new MathBean(); // Heap 메모리에 올라가게 됨.

        m1.printClassName();
        m1.printNumber(111);
        int pp=m1.plus(200,300);
        System.out.println(pp);
        int name=m1.getOne();
        System.out.println(name);
    }
}
