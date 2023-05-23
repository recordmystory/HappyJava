public class CarExam01 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();
        b1.안내방송(); // 자바는 유니코드를 사용하기 때문에 메소드 이름 한글로 작성 가능.

        Car c1 = new Bus(); // 버스는 자동차다.
        c1.run();
     //   c1.안내방송(); -> 사용불가. 참조 변수의 타입으로 Car를 사용하면 Car가 가지고 있는 메소드만 사용 가능하기 때문이다.
        Bus b2=(Bus)c1; // 여기서 c1이 참조하는 인스턴스가 Bus가 아니라면 b2가 참조할 때 Exception이 발생할 수 있다.
        b2.안내방송();

        Car c2 = new SuperCar();
        c2.run();
    }
}
