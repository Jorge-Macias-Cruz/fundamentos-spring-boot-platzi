package com.platzi.springboot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{
    @Override
    public void printSomething() {
        System.out.println("Hola mundo desde mi componente 2");
    }
}
