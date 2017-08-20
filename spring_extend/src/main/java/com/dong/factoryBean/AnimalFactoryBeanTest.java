package com.dong.factoryBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by DONGSHILEI on 2017/8/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-factoryBean.xml"
})
public class AnimalFactoryBeanTest {
    @Resource
    private Animal tiger;

    @Resource
    private Animal mokey;

    @Test
    public void tiger(){
        tiger.move();
    }

    @Test
    public void mokey(){
        mokey.move();
    }
}
