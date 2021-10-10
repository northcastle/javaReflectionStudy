package com.northcastle.classtry;

/**
 * author : Hongchang Wang
 * createTime:2021/9/20
 */
public class Car {
    //1.公有属性
    public String name = "测试的一辆车";
    public Integer age = 1;
    //2.私有属性
    private String brand;
    private String price;

    private static String a;

    //3.无参构造
    public Car() { }
    //4.有参构造
    public Car(String name, Integer age, String brand, String price) {
        this.name = name;
        this.age = age;
        this.brand = brand;
        this.price = price;
    }
    //5.getter/setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    // 6.toString() 方法
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}
