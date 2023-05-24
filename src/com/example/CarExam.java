package com.example;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car() { // Car를 상속받고 있는 이름없는 객체 생성
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a() 메소드 오버라이딩");
            }
        };
        c1.a();
    }
}
