package com.northcastle.groupclass;

/**
 * author : Hongchang Wang
 * createTime:2021/10/6
 * 父类
 */
public class Pat {
    public String patField1; // public 修饰的可以被子类的反射拿到
    private String patField2;
    protected String patField3;
    String patField4;

    public Pat() {
    }

    public void patMethod1(){} // public 修饰的可以被子类的反射拿到
    private void patMehod2(){}
    protected void patMethod3(){}
    void patMethod4(){}
}
