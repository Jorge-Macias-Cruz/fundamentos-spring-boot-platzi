package com.platzi.springboot;

import com.platzi.springboot.bean.MyBean;
import com.platzi.springboot.bean.MyBeanWithDependency;
import com.platzi.springboot.component.ComponentDependency;
import com.platzi.springboot.services.BeanWithDependencies;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    private ComponentDependency componentDependency;
    private MyBean myBean;
    private MyBeanWithDependency myBeanWithDependency;


    public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency) {
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanWithDependency = myBeanWithDependency;

    }

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }


    @Override
    public void run(String... args) {
        componentDependency.printSomething();
        myBean.print();
        myBeanWithDependency.printWithDependency();

    }
}
