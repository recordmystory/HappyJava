package com.example;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
        Bus b1 = new Bus();
       // b1.a();

        // className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고, 그 정보를 clazz가 참조하도록 한다.
        String className = "com.example.MyHome";
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();

        Method m = clazz.getDeclaredMethod("a", null); // a() 메소드 정보를 가지고 있는 Method를 반환.
        m.invoke(o, null);
    }
}

