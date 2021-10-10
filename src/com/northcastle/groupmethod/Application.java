package com.northcastle.groupmethod;

/**
 * author : Hongchang Wang
 * createTime:2021/10/10
 */
public class Application {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.创建Class类的对象
        String classPath = "com.northcastle.groupmethod.Bird";
        Class<?> clazz = Class.forName(classPath);
    }
}
