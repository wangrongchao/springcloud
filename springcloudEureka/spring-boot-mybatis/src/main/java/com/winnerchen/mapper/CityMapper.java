package com.winnerchen.mapper;

import com.winnerchen.domain.City;
import org.apache.ibatis.annotations.*;

/**
 * Created by lenovo on 2018/1/27.
 */
@Mapper
public interface CityMapper {

    @Insert("INSERT INTO t_city(city_name, description, province_id) VALUES(#{city_name}, #{description}, #{province_id})")
    int insert(@Param("city_name") String city_name, @Param("description") String description, @Param("province_id") Long province_id);

    /**
     * 查询城市信息
     */
    @Select(" SELECT * FROM t_city WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description")
    })
    public City queryCityById(@Param("id") int id);


}
