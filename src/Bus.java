//Bus는 자동차의 한 종류다.
public class Bus extends Car{ // Car를 상속받는 Bus

    public void run(){ // 오버라이딩
        System.out.println("후륜구동으로 달리다.");
    }

    public void 안내방송(){
        System.out.println("안내방송하다.");
    }
}
