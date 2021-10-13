package com.northcastle.groupmethod;

/**
 * author : Hongchang Wang
 * createTime:2021/10/10
 */
public class Bird {

    public Bird() {
    }

    //1.常规的四个方法
    void method1(){
        System.out.println("method1...");
    }
    public void method2(){
        System.out.println("method2...");
    }
    private void method3(){
        System.out.println("method3...");
    }
    protected void method4(){
        System.out.println("method4...");
    }
    //2.两个 static 修饰的 类方法
    public static void method5(){
        System.out.println("method5...");
    }
    private static void method6(){
        System.out.println("method6...");
    }
    //3.有返回值的方法
    public String method7(){
        System.out.println("method7...");
        return "method7";
    }
    //4.带参数的方法
    public void method8(String a){
        System.out.println("method8 的参数是 ： "+a);
        System.out.println("method8...");
    }
    public void method9(String a,int b){
        System.out.println("method9 的参数是 ： "+a+" - "+b);
        System.out.println("method9...");
    }
    private static String method10(String a,int b,boolean c){
        System.out.println("method10 的参数是 ： "+a+"-"+b+"-"+c);
        System.out.println("method10...");
        return "method10";
    }

}
