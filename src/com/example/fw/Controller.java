package com.example.fw;

/*
Controller의 종류가 여러 개
초기화 - 같은 코드
실행 - 다른 코드
마무리 - 같은 코드
 */
public abstract class Controller {

    //protected는 같은 package거나 상속받았을 때 호출 가능.

    protected final void init(){ // final이 붙으면 Override 할 수 없음.
        System.out.println("초기화 하는 코드");
    }
    protected final void close(){
        System.out.println("마무리 하는 코드");
    }

    protected abstract void run(); //다른 코드

    // 내가 가지고 있는 메소드를 호출한다.
    // 템플릿 메소드 - 어떤 순서를 가지고 있다.
    public void execute(){
        this.init();
        this.run();
        this.close();
    }

}
