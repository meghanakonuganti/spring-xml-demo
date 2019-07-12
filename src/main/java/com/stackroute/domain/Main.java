package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie beanA=context.getBean("movieA", Movie.class);
        beanA.showActorInfo();
        /*Movie beanB=context.getBean("movieB", Movie.class);
        beanB.showActorInfo();
        System.out.println(beanA==beanB);*/
    }
}
