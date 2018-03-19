package com.winnerchen.service.impl;

import com.winnerchen.domain.City;
import com.winnerchen.mapper.CityMapper;
import com.winnerchen.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lenovo on 2018/1/27.
 */
@Service
public class CityServiceImpl implements ICityService{
    @Autowired
    private CityMapper cityMapper;

    @Override
    @Transactional
    public City queryById(int id) {
        cityMapper.insert("chengdu2","desc_chengdu",1234567L);
        //int a = 1/0;//结合上面的Transactional注解，是生效的，事物回滚
        return cityMapper.queryCityById(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public City queryById2(int id) {
        cityMapper.insert("chengdu3","desc_chengdu",12345678L);
        //int a = 1/0;//结合上面的Transactional注解，是生效的，事物回滚
        return cityMapper.queryCityById(id);
    }
}
