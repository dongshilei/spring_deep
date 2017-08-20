package com.dong.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 开发者可以个性化地定制自己想要实例化出来的Bean，方法就是实现FactoryBean接口
 * 使用FactoryBean，可以灵活操作Bean的生成
 * 1、getObject()方法是最重要的，控制Bean的实例化过程
 * 2、getObjectType()方法获取接口返回的实例的class
 * 3、isSingleton()方法获取该Bean是否为一个单例的Bean
 * Created by DONGSHILEI on 2017/8/17
 */
public class AnimalFactoryBean implements FactoryBean<Animal> {

    private String animal;

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public Animal getObject() throws Exception {
        if ("Mokey".equals(animal)){
            return new Mokey();
        } else if ("Tiger".equals(animal)){
            return new Tiger();
        }
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
