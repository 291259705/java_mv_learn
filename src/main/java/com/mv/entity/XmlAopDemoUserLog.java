package com.mv.entity;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Aspect
@Component
public class XmlAopDemoUserLog {

    @Pointcut("execution(* com.mv.service.UserServiceImpl.*(..))")
    public void pointcut() {

    }

    //    方法执行前通知
    @Before("pointcut()")
    public void beforeLog() {
        System.out.println("开始执行前置通知  日志记录");
    }

    //    方法执行完后通知\
    @After("pointcut()")
    public void afterLog() {
        System.out.println("开始执行后置通知 日志记录");
    }

    //    执行成功后通知
    @AfterReturning("pointcut()")
    public void afterReturningLog() {
        System.out.println("方法成功执行后通知 日志记录");
    }

    //    抛出异常后通知
    @AfterThrowing("pointcut()")
    public void afterThrowingLog() {
        System.out.println("方法抛出异常后执行通知 日志记录");
    }

    //  环绕通知
    @Around("pointcut()")
    public Object aroundLog(ProceedingJoinPoint joinpoint) {
        Object result = null;
        try {
            System.out.println("环绕通知开始 日志记录");
            long start = System.currentTimeMillis();

            //有返回参数 则需返回值
            result = joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("总共执行时长" + (end - start) + " 毫秒");
            System.out.println("环绕通知结束 日志记录");
        } catch (Throwable t) {
            System.out.println("出现错误");
        }
        return result;
    }
}