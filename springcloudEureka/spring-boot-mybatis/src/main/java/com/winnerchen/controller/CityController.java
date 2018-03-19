package com.winnerchen.controller;
import com.winnerchen.domain.City;
import com.winnerchen.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by lenovo on 2018/1/27.
 */
@RestController
@RequestMapping("city/")
public class CityController {
    @Autowired
    private ICityService cityService;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World,snow is beautifull";
    }

    @RequestMapping(value = "query/{id}",method = RequestMethod.GET)
    public City queryById(@PathVariable("id") int id){
        float a = 2/0f;
        float b = 2f/0;
        return this.cityService.queryById(id);
    }
}
