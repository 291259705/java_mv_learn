package com.mv.service;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {

    /**
     * JDK动态代理：对“装饰者”设计模式 简化。使用前提：必须有接口
     *
     * @return
     */
    public static UserService createService() {
        //目标类
        final UserService userService = new UserServiceImpl();
        //切面类
        final MyAspect myAspect = new MyAspect();
        //代理类
        UserService proxService = (UserService) Proxy.newProxyInstance(
                MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        //前执行
                        myAspect.before();

                        //执行目标类方法
                        Object obj = method.invoke(userService, args);

                        //后执行
                        myAspect.after();

                        return obj;
                    }
                }
        );

        return proxService;
    }

    /**
     * 没有接口，只有实现类
     * 采用字节码增强框架cglib,在运行时创建目标类子类,从而对目标类进行增强
     *
     * @return
     */
    public static UserServiceImpl createService_CGLIB() {
        //目标类
        final UserServiceImpl userService = new UserServiceImpl();
        //代理类
        final MyAspect myAspect = new MyAspect();
        //核心类：采用cglib,底层创建目标类的子类
        Enhancer enhancer = new Enhancer(); //3.1 核心类
        enhancer.setSuperclass(userService.getClass()); //3.2 确定父类
        //3.3 确定回调函数
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                System.out.println("setCallback intercept ... ");
                //前执行
                myAspect.before();

                // 执行目标类方法
                Object obj = method.invoke(userService, objects);
                // * 执行代理类的父类，执行目标类（目标类和代理类 父子关系）
                methodProxy.invokeSuper(proxy, objects);

                //后执行
                myAspect.after();

                return obj;
            }
        });

        //3.4 创建代理
        UserServiceImpl proxService = (UserServiceImpl) enhancer.create();

        return proxService;
    }
}
