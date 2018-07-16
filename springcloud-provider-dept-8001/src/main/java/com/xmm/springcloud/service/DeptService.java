package com.xmm.springcloud.service;

import com.xmm.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
