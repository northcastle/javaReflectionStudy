package com.northcastle.groupmethod;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * author : Hongchang Wang
 * createTime:2021/10/10
 */
public class Application {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //1.创建Class类的对象
        String classPath = "com.northcastle.groupmethod.Bird";
        Class<?> clazz = Class.forName(classPath);

        //2.获取方法列表
        // getMethods() : 获取所有的public 的方法,包括父类的公有方法
        // getDeclaredMethods() : 获取所有的方法
        Method[] methodList1 = clazz.getMethods();
        Method[] declaredMethodList = clazz.getDeclaredMethods();
        for (Method method : methodList1) {
            System.out.println(method);
        }
        System.out.println("================================");
        for (Method method : declaredMethodList) {
            System.out.println(method);
        }
        System.out.println("================================");

        //3.获取指定的方法
        //getMethod() : 获取public的方法
        //getDeclaredMethod() : 获取类中声明的方法
        Method method2 = clazz.getMethod("method2");
        Method method8 = clazz.getMethod("method8", String.class);
        Method method10 = clazz.getDeclaredMethod("method10", String.class, int.class, boolean.class);
        System.out.println(method2);
        System.out.println(method8);
        System.out.println(method10);

        //4.获取方法的修饰符
        Method method10_2 = clazz.getDeclaredMethod("method10", String.class, int.class, boolean.class);
        int modifiers = method10_2.getModifiers(); // private static
        System.out.println(modifiers); // 2 + 8 = 10

        //5.获取方法的返回值
        Method method10_3 = clazz.getDeclaredMethod("method10", String.class, int.class, boolean.class);
        Class<?> returnType = method10_3.getReturnType();
        System.out.println(returnType);

        //6.获取方法的参数列表:参数个数、参数类型
        Method method10_4 = clazz.getDeclaredMethod("method10", String.class, int.class, boolean.class);
        int parameterCount = method10_4.getParameterCount();
        Class<?>[] parameterTypes = method10_4.getParameterTypes();
        System.out.println(parameterCount);
        System.out.println(Arrays.toString(parameterTypes) );
        System.out.println();

        Method[] declaredMethodList2 = clazz.getDeclaredMethods();
        for (Method method : declaredMethodList2) {
            if ("method10".equals(method.getName())){
                int parameterCount1 = method.getParameterCount(); // 参数个数
                System.out.println(parameterCount1);
                Class<?>[] parameterTypes1 = method.getParameterTypes();//参数类型
                System.out.println(Arrays.toString(parameterTypes1));
                Parameter[] parameters = method.getParameters(); // 参数
                System.out.println(Arrays.toString(parameters));
                for (Parameter parameter : parameters) {
                    System.out.println(parameter.getName()+" : "+parameter.getType()+" : "+parameter.getModifiers());
                }
            }
        }


        //7.创建一个对象
        Object o = clazz.newInstance();

        //8.普通方法的调用
        Method method2_1 = clazz.getDeclaredMethod("method2");
        method2_1.invoke(o);

        //9.静态方法的调用
        Method method5_1 = clazz.getDeclaredMethod("method5");
        method5_1.setAccessible(true); // 必须爆破
        method5_1.invoke(o);

        //10.调用静态方法
        Method method6_1 = clazz.getDeclaredMethod("method6");
        method6_1.setAccessible(true);
        method6_1.invoke(null);

        //11.调用带参数的方法
        Method method9_9 = clazz.getDeclaredMethod("method9", String.class, int.class);
        Method method10_9 = clazz.getDeclaredMethod("method10",String.class,int.class,boolean.class);

        method9_9.invoke(o,"aaa",111);
        method10_9.setAccessible(true);
        method10_9.invoke(null,"bbb",222,false);

    }
}
