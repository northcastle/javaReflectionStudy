package com.northcastle.groupclass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * author : Hongchang Wang
 * createTime:2021/10/6
 * desc: 通过反射获取类的结构信息
 */
public class Application {
    public static void main(String[] args) throws ClassNotFoundException {
        //0.获取Class类的对象
        String classPath = "com.northcastle.groupclass.Cat";
        Class<?> clazz = Class.forName(classPath);
        //1.getName():获取全类名
        String name = clazz.getName();
        System.out.println("getName() : "+name);
        //2.getSimpleName():获取简单类名
        String simpleName = clazz.getSimpleName();
        System.out.println("getSimpleName() : "+simpleName);
        //3.getFields():获取所有public修饰的属性，包含本类以及父类的
        System.out.println("=========getFields() begin================");
        Field[] fieldList1 = clazz.getFields();
        for (Field field : fieldList1) {
            System.out.println(field.getName()+"-"+field.toString());
        }
        System.out.println("=========getFields() end================");
        //4.getDeclaredFields():获取本类中所有的属性
        System.out.println("=========getDeclaredFields() begin================");
        Field[] declaredFieldList = clazz.getDeclaredFields();
        for (Field field : declaredFieldList) {
            System.out.println(field.getName()+"-"+field.toString());
        }
        System.out.println("=========getDeclaredFields() end================");
        //5.getMethods():获取所有public修饰的方法，包含本类以及父类的,包括Object类中的
        System.out.println("=========getMethods() begin================");
        Method[] methodList = clazz.getMethods();
        for (Method method : methodList) {
            System.out.println(method.getName()+"-"+method.toString());
        }
        System.out.println("=========getMethods() end================");
        //6.getDeclaredMethods():获取本类所有的方法
        System.out.println("=========getDeclaredMethods() begin================");
        Method[] declaredMethodsList = clazz.getDeclaredMethods();
        for (Method method : declaredMethodsList) {
            System.out.println(method.getName()+"-"+method.toString());
        }
        System.out.println("=========getDeclaredMethods() end================");
        //7.getConstructors():获取本类中所有的public修饰的构造器 : 1=public;2=private
        System.out.println("=========getConstructors() begin================");
        Constructor<?>[] constructorList = clazz.getConstructors();
        for (Constructor<?> constructor : constructorList) {
            System.out.println(constructor.getModifiers()+ "-"+constructor.getName()+"-"+ Arrays.toString( constructor.getParameters()));
        }
        System.out.println("=========getConstructors() end================");
        //8.getDeclaredConstructors():获取本类中所有的构造器
        System.out.println("=========getDeclaredConstructors() end================");
        Constructor<?>[] declaredConstructorsList = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructorsList) {
            System.out.println(constructor.getModifiers()+ "-"+constructor.getName()+"-"+Arrays.toString(constructor.getParameters()));
        }
        System.out.println("=========getDeclaredConstructors() end================");
        //9.getPackage():返回包的信息
        Package aPackage = clazz.getPackage();
        System.out.println("getPackage() : "+aPackage);
        //10.getSuperClass():以Class形式返回父类信息
        Class<?> superclass = clazz.getSuperclass();
        System.out.println("getSuperClass() : "+superclass);
        //11.getInterfaces():以Class[]形式返回接口信息
        System.out.println("=========getInterfaces() begin================");
        Class<?>[] interfaceList = clazz.getInterfaces();
        for (Class<?> interfaceClass : interfaceList) {
            System.out.println(interfaceClass.getName());
        }
        System.out.println("=========getInterfaces() end================");
        //12.getAnnotations():以Annotation[]形式返回注解信息
        System.out.println("=========getAnnotations() begin================");
        Annotation[] annotationList = clazz.getAnnotations();
        for (Annotation annotation : annotationList) {
            System.out.println(annotation+"-"+annotation.getClass()+"-"+annotation.annotationType()+"-");
        }
        // 获取注解的值
        ForReflection2 annotation = clazz.getAnnotation(ForReflection2.class);
        String value = annotation.value();
        String value2 = annotation.value2();
        System.out.println(value+"-"+value2);
        System.out.println("=========getAnnotations() end ================");
    }
}
