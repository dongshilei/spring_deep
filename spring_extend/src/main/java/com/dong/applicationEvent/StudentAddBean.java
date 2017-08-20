package com.dong.applicationEvent;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 实现接口ApplicationContextAware中的setApplicationContext方法，
 * 在构造bean的时候注入Spring的上下文对象，
 * 以便通过Spring上下文对象的publishEvent方法来触发StudentAddEvent事件
 * Created by DONGSHILEI on 2017/8/19
 */
public class StudentAddBean implements ApplicationContextAware {

    //spring 上下文
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
    }

    /**
     * 添加学生
     * @param studentName
     */
    public void addStudent(String studentName){
        //添加学生
        Student student = new Student(studentName);
        System.out.println("添加学生：："+student.toString());
        //构造一个学生添加事件
        StudentAddEvent event = new StudentAddEvent(applicationContext,student);
        //发布增加学生事件
        applicationContext.publishEvent(event);
    }
}
