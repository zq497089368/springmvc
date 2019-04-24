package com.test.service;

import com.test.entity.LeisuMatchBasePO;

import java.util.concurrent.Future;

public interface LeisuMatchBaseService {
    LeisuMatchBasePO findById(Long id);

    void updateById(long id);

    void test();

    Future<String> test2();
}
