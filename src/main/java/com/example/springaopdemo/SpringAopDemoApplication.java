package com.example.springaopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopDemoApplication {

    private final DemoService demoService;

    public SpringAopDemoApplication(DemoService demoService) {
        this.demoService = demoService;
    }

    public void run() {
        demoService.execute();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringAopDemoApplication.class, args);
        SpringAopDemoApplication bean = context.getBean(SpringAopDemoApplication.class);
        bean.run();
    }

}
