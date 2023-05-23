public abstract class Car2 {
    public Car2(String name){
        super();
        System.out.println("Car2() 생성자 호출");
    }

    // 추상메소드. Car2를 만든 사람은 run()이라는 메소드가 필요하다라고 생각했다.
    // run()은 자동차마다 다르게 구현할 것이다.

    public abstract void run();
}
