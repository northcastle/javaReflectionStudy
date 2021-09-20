package com.northcastle.classtry;

import java.lang.reflect.Field;

/**
 * author : Hongchang Wang
 * createTime:2021/9/20
 */
public class ApplicationForField {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //1.获取Car类的Class对象
        String classFullPath = "com.northcastle.classtry.Car";
        Class<?> clazz = Class.forName(classFullPath);

        //2.反射创建Car类的对象
        Object o = clazz.newInstance();
        Car car = (Car) o;

        //3.获取Class对象中的属性列表
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==============================");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("==============================");

        //4.获取指定name的属性
        try {
            Field name = clazz.getField("name"); // public 的正常获取
            System.out.println("getField(name) : "+name);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        try {
            Field brand = clazz.getField("brand");// private 的，获取不到
            System.out.println("getField(brand) : "+brand);
        } catch (NoSuchFieldException e) {
            System.out.println("getField(brand) : 无法获取brand 属性！");
            e.printStackTrace();
        }
        try {
            Field brand = clazz.getDeclaredField("brand");
            System.out.println("getDeclareField(brand) : "+brand);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        
        //5.修改 car 对象的 name 的值(public的属性)
        Field nameField = clazz.getDeclaredField("name");
        Object name = nameField.get(car); // 获取car的name属性
        System.out.println(car); // 修改前的car
        nameField.set(car,"测试修改name");//将car的name属性进行修改
        System.out.println(car); // 修改后的car

        //6.修改 car 对象的 brand 的值（private的属性）
        Field brandField =  clazz.getDeclaredField("brand");
        // 私有属性必须设置为 可操作的才可以执行get/set操作
        brandField.setAccessible(true);

        Object brand = brandField.get(car);// 获取 car 的 brand属性
        System.out.println(car);

        brandField.set(car,"测试修改brand");
        System.out.println(car);
    }
}
