package org.example;

import org.example.configurations.AppConfigWithoutSpringBoot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfigWithoutSpringBoot.class);
        AppConfigWithoutSpringBoot bean = context.getBean(AppConfigWithoutSpringBoot.class);
        System.out.println(bean.getUrl());

    }
}
