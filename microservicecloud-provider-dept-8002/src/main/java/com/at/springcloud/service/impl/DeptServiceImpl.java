package com.at.springcloud.service.impl;

import com.at.springcloud.enties.Dept;
import com.at.springcloud.mapper.DeptMapper;
import com.at.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2019/4/9
 * @ Description：
 * @ throws
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Integer add(Dept dept) {
        return deptMapper.insertDept(dept);
    }

    @Override
    public Dept get(Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.selectAll();
    }
}
