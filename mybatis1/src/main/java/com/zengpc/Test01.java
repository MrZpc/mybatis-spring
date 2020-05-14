package com.zengpc;

public class Test01 {
    public Test01(){
        System.out.println("heiheihei");
    }
    static {
        System.out.println("uyiyiyi");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("com.zengpc.pojo.User");
        
    }
}

class  A extends Test01{

    static {
        System.out.println("这是代码块");
        m=300;
    }

    public static int m = 1000;

    public  A(){
        System.out.println("这是方法");
    }
}