public class CarExam02 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1); // println(Object x) -> Object로 참조할 수 있는 것은 무엇이든 받을 수 있다.
        c1.printName(); // 참조하는 게 없음.
        System.out.println("----------------------");

        Car c2 = new Car("story");
        c2.printName();
    }
}

// 부모타입의 변수로 자식인스턴스를 참조할 수 있다.
// 조상타입의 변수로 후손인스턴스를 참조할 수 있다.
// Car c1 = new Bus(); -> 오류발생 X
// Car c2 = new 이층버스(); -> 이층버스는 Car의 자손이기 때문에 오류발생 X
// Object o1 = new Car();
// Object o2 = new Bus();
// Object o3 = new 이층버스();
// System.out.println(o1.toString()); == System.out.println(o1); 결과값이 같음.