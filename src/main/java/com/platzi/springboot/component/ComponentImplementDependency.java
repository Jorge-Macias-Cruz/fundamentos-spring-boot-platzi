package com.platzi.springboot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplementDependency implements ComponentDependency {
    @Override
    public void printSomething() {
        System.out.println("Imprimiendo algo de ComponentDependency");
    }
}
