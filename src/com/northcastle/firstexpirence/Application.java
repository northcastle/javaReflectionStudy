package com.northcastle.firstexpirence;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Classname Application
 * @Description TODO
 * @Date 2021/9/14 18:04
 * @Created by northcastle
 */
public class Application {
    public static void main(String[] args) throws Exception {

        //1.读取properties配置文件
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\application.properties");
        properties.load(fileInputStream);
        String classFullPath = properties.getProperty("class-full-path");
        String methodName = properties.getProperty("method-name");

        //2.创建配置文件中指定类的对象
        Class clazz = Class.forName(classFullPath);
        Object o = clazz.newInstance();

        //3.调用配置文件中指定的方法
        Method method = clazz.getMethod(methodName);
        method.invoke(o);

    }
}
