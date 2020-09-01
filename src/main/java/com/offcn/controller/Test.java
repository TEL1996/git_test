package com.offcn.controller;

import com.offcn.bean.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping("/hello")
    public Car test(){
        System.out.println("哈哈");
        Car car = new Car(1,"笑话",199.1f,new Date());
        return car;
    }
}
