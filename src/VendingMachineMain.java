public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine(); // 인스턴스 생성
        VendingMachine vm2 = new VendingMachine();

        String product=vm1.pushProductButton(100);
        System.out.println(product);
        // VendingMachineMain 클래스는 VendingMachine 클래스에 의존한다. -> VendingMachineMain 클래스는 VendingMachine 클래스가 없다면 컴파일 오류가 발생한다.

        VendingMachine.PrintVersion();

        String product2=vm2.pushProductButton(200);
        System.out.println(product2);
    }
}
