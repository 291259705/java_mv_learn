package com.mv.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("myAspectId")
public class MyAspect implements MethodInterceptor {
    public void before() {
        System.out.println("鸡首");
    }

    public void after() {
        System.out.println("牛后");
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        before();

        Object obj = mi.proceed();

        after();

        return obj;
    }
}