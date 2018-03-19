package com.winnerchen.service;

import com.winnerchen.domain.City;

/**
 * Created by lenovo on 2018/1/27.
 */
public interface ICityService {

    /**
     * 查询城市信息
     */
    public City queryById(int id);

    /**
     * 查询城市信息
     */
    public City queryById2(int id);
}
