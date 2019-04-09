package com.at.springcloud.controller;

import com.at.springcloud.enties.Dept;
import com.at.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2019/4/9
 * @ Description：
 * @ throws
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add")
    public Integer add(@RequestBody Dept dept)
    {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Integer id)
    {
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list()
    {
        return deptService.list();
    }
}
