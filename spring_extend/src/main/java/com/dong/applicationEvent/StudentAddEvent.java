package com.dong.applicationEvent;

import org.springframework.context.ApplicationEvent;

/**
 * 增加学生的监听事件
 * Created by DONGSHILEI on 2017/8/19
 */
public class StudentAddEvent extends ApplicationEvent {

    private Student student;

    public StudentAddEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
