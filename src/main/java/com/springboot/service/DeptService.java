package com.springboot.service;

import com.springboot.bean.Department;

/**
 * @ project  项目介绍
 * @ author  clsr
 * @ date  2019/3/24
 */
public interface DeptService {
    Department findDeptByDeptId(Integer deptId);
}
