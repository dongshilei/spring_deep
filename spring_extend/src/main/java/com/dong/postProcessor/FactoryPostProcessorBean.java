package com.dong.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * BeanFactoryPostProcessor的执行优先级高于BeanPostProcessor
 * BeanFactoryPostProcessor的postProcessBeanFactory()方法只会执行一次
 * Created by DONGSHILEI on 2017/8/18
 */
public class FactoryPostProcessorBean implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory*********"+beanFactory);
    }
}
