package com.dong.postProcessor;

/**
 * Created by DONGSHILEI on 2017/8/18
 */
public class People {

    private String name;

    public People() {
        System.out.println("构建people");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void div_init(){
        System.out.println(" people init "+name);
    }

    public String getName() {
        return name;
    }
}
