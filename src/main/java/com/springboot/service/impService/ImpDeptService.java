package com.springboot.service.impService;

import com.springboot.bean.Department;
import com.springboot.repository.DeptRepository;
import com.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ project  项目介绍
 * @ author  clsr
 * @ date  2019/3/24
 */
@Service
public class ImpDeptService implements DeptService {
    @Autowired
    DeptRepository deptRepository;

    @Override
    public Department findDeptByDeptId(Integer deptId) {
        return deptRepository.findDepartmentByDeptId(deptId);
    }
}
