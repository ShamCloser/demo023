package com.springboot;

import com.springboot.bean.Department;
import com.springboot.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo023ApplicationTests {
    @Autowired
    DeptService deptService;
    @Test
    public void contextLoads() {
        int deptId = 102;
        Department department = deptService.findDeptByDeptId(deptId);
        System.out.println(department);
    }

}
