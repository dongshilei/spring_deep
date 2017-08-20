package com.dong.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by DONGSHILEI on 2017/8/18
 */
public class PostProcessorBean implements BeanPostProcessor {

    /**
     * 参数中的bean 指配置文件中bean的ID
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("postProcessBeforeInitialization*********"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization*********"+beanName);
        return bean;
    }
}
