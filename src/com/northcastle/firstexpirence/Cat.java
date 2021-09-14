package com.northcastle.firstexpirence;

/**
 * @Classname Cat
 * @Description TODO
 * @Date 2021/9/14 14:52
 * @Created by northcastle
 */
public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void hi(){
        System.out.println("hi,this is method hi()");
    }

    public void mi(){
        System.out.println("mi,this is method mi()");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
