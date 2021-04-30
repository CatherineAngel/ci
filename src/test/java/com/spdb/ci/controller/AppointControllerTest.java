package com.spdb.ci.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest
@RunWith(SpringRunner.class)
public class AppointControllerTest {
    @Resource
    private AppointController appointController;

    @Test
    public void addAppoint() {
    }

    @Test
    public void getAppointListByTel() {
    }

    @Test
    public void getQueuePersonal() {
        Integer num = appointController.getQueuePersonal("1", "2021-04-30", "9:00-10:00");
        System.out.println(num);
    }
}