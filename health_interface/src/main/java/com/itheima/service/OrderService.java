package com.itheima.service;

import com.itheima.entity.Result;

import java.util.Map;

/**
 * 体检预约服务接口
 */
public interface OrderService {
    public Result order(Map map) throws Exception;
    public Map findById(Integer id) throws Exception;
}
