package com.dong.applicationEvent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by DONGSHILEI on 2017/8/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-event.xml"
})
public class EventTest {

    @Resource
    private StudentAddBean studentAddBean;


    @Test
    public void test(){
        studentAddBean.addStudent("小强");
    }
}
