package com.dong.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *InitialingBean和DisposableBean
 InitialingBean是一个接口，提供了一个唯一的方法afterPropertiesSet()。
 DisposableBean也是一个接口，提供了一个唯一的方法destory()。
 这两个接口是一组的，功能类似，因此放在一起
 * Created by DONGSHILEI on 2017/8/16
 */
public class LifecycleBean implements InitializingBean,DisposableBean {

    private String lifeCycleBeanName;

    /**
     * 设置Bean属性
     * @param lifeCycleBeanName
     */
    public void setLifeCycleBeanName(String lifeCycleBeanName) {
        System.out.println("Enter LifecycleBean.setLifeCycleBeanName(), lifeCycleBeanName = " + lifeCycleBeanName);
        this.lifeCycleBeanName = lifeCycleBeanName;
    }

    /**
     *在Bean生命周期结束前调用destory()方法做一些收尾工作
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Enter LifecycleBean.destroy()");
    }

    /**
     * 在Bean属性都设置完毕后调用afterPropertiesSet()方法做一些初始化的工作
     * 初始化过程不宜太久
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Enter LifecycleBean.afterPropertiesSet()");
    }
}
