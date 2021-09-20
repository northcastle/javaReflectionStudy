package com.northcastle.classtry;

/**
 * author : Hongchang Wang
 * createTime:2021/9/20
 */
public class Application {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1.获取Class对象
        String carFullPath = "com.northcastle.classtry.Car"; // 类的全路径名
        Class<?> clazz = Class.forName(carFullPath); // 获取Class的对象
        System.out.println(clazz); // 代表的类的Class对象 ： com.northcastle.classtry.Car
        System.out.println(clazz.getClass()); // clazz 的运行时类型 ： java.lang.Class
        //2.得到包名
        String packageName = clazz.getPackage().getName();
        System.out.println(packageName);//com.northcastle.classtry
        //3.得到全类名
        String classFullPathName = clazz.getName();
        System.out.println(classFullPathName); // com.northcastle.classtry.Car
        //4.创建clazz对象实例
        Object o = clazz.newInstance();
        System.out.println(o);
        Car car = (Car) o; // 实际上o的类型就是Car,所以可以进行强制类型转换
        System.out.println(car);
    }
}
