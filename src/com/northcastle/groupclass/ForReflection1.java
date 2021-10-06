package com.northcastle.groupclass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author : Hongchang Wang
 * createTime:2021/10/6
 */
@Retention(RetentionPolicy.RUNTIME) // 必须是RUNTIME才可以被反射获取到
@Target(ElementType.TYPE)//可以修饰类的注解
public @interface ForReflection1 {

}
