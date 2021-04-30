package com.spdb.ci.mapper;

import com.spdb.ci.bean.dto.AppointDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppointMapperTest {
    @Resource
    private AppointMapper appointMapper;

    @Test
    public void addAppoint() {
    }

    @Test
    public void findAppointListByTel() {
        List<AppointDto> appointDtoList = appointMapper.findAppointListByTel("176");
        System.out.println(appointDtoList);
    }
    @Test
    public void getQueuePersonal() {
        Integer num = appointMapper.getQueuePersonal("1","2021-04-30","9:00-10:00");
        System.out.println(num);
    }
}