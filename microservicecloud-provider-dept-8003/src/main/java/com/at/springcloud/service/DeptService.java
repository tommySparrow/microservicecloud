package com.at.springcloud.service;

import com.at.springcloud.enties.Dept;

import java.util.List;

public interface DeptService {
    Integer add(Dept dept);
    Dept get(Integer id);
    List<Dept> list();
}
