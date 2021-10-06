package com.northcastle.groupclass;

/**
 * author : Hongchang Wang
 * createTime:2021/10/6
 */

@ForReflection1
@ForReflection2(value = "World",value2 = "哈哈")
public class Cat extends Pat implements Sleep,CatchMouse{
    //1.属性
    public String catField1;
    private String catField2;
    protected String catField3;
    String catFiled4;

    //3.构造器
    public Cat() {
    }

    public Cat(String catField1) {
        this.catField1 = catField1;
    }

    public Cat(String catField1, String catField2) {
        this.catField1 = catField1;
        this.catField2 = catField2;
    }
    private Cat(String catField1, String catField2, String catField3) {
        this.catField1 = catField1;
        this.catField2 = catField2;
        this.catField3 = catField3;
    }

    public Cat(String catField1, String catField2, String catField3, String catFiled4) {
        this.catField1 = catField1;
        this.catField2 = catField2;
        this.catField3 = catField3;
        this.catFiled4 = catFiled4;
    }



    //2.方法
    public void catMethod1(){}
    private void catMethod2(){}
    protected void catMethod3(){}
    void catMethod4(){}

    //4.实现接口中的方法:会被反射getMethods() 和 getDeclaredMethods()获取到
    @Override
    public void sleep() {
        System.out.println("cat sleep...");
    }
}
