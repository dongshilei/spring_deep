package com.dong.applicationEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 定义事件监听器
 * Created by DONGSHILEI on 2017/8/19
 */
public class StudentAddListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        if (!(event instanceof StudentAddEvent)){
            return;
        }
        //获得监听事件
        StudentAddEvent studentAddEvent = (StudentAddEvent)event;
        //获取监听事件的值，模拟处理监听事件
        System.out.println("监听到了添加学生："+studentAddEvent.getStudent().getStudentName());
    }

}
