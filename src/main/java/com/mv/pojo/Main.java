package com.mv.pojo;

import com.mv.entity.User;
import com.mv.service.BookService;
import com.mv.service.MyBeanFactory;
import com.mv.service.UserService;
import com.mv.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Main {

    private final static String cfgPath = "spring-config.xml";

    public static void main(final String[] args) throws Exception {
        demo7();
    }

    private static void demo() {
        ApplicationContext apc = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService user = apc.getBean("userServiceId", UserService.class);
        user.addUser();

        List<String> users = user.getUserList();
        for (String s : users) {
            System.out.println(String.format("用户：%s", s));
        }
    }

    private static void demo2() {
        ApplicationContext apc = new ClassPathXmlApplicationContext("spring-config.xml");
        BookService book = (BookService) apc.getBean("bookServiceId");
        book.addBook();

    }

    private static void demo3() {
        ApplicationContext apc = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) apc.getBean("userId");
        List<User> users = user.getUsers();

        for (User s : users) {
            System.out.println(String.format("demo3 用户：%s", s.getName()));
        }
    }

    public static void demo4() {
        UserService userService = MyBeanFactory.createService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }

    public static void demo5() {
        UserServiceImpl userService = MyBeanFactory.createService_CGLIB();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }

    public static void demo6() {
        ApplicationContext appc = new ClassPathXmlApplicationContext(cfgPath);
        UserService userService = appc.getBean("proxyServerId", UserService.class);
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }

    public static void demo7() {
        ApplicationContext appc = new ClassPathXmlApplicationContext(cfgPath);

        UserService userService = appc.getBean("userServiceId", UserService.class);
        userService.getUser("老王");
    }

}
