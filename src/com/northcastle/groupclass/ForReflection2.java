package com.northcastle.groupclass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author : Hongchang Wang
 * createTime:2021/10/6
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ForReflection2 {
    String value() default "hello";
    String value2();
}
