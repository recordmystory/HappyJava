package com.example;

public class MyRunnableMain2 {
    public static void main(String[] args) {

        MyRunnable myRunnable=new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello!");
            }
        };

        RunnableExecute runnableExecute=new RunnableExecute();
        runnableExecute.execute(myRunnable);
    }
}
