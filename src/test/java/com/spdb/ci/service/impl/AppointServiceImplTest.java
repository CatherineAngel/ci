package com.spdb.ci.service.impl;

import com.spdb.ci.service.AppointService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppointServiceImplTest {
    @Resource
    private AppointService appointService;

    @Test
    public void addAppoint() {
    }

    @Test
    public void getAppointListByTel() {
    }

    @Test
    public void getQueuePersonal() {
        Integer num = appointService.getQueuePersonal("1", "2021-04-30", "9:00-10:00");
        System.out.println(num);
    }
}