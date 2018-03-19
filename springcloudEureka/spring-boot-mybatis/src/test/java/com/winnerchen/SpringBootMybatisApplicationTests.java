package com.winnerchen;

import com.winnerchen.domain.City;
import com.winnerchen.domain.Student;
import com.winnerchen.mapper.CityMapper;
import com.winnerchen.mapper.StudentMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {
	@Autowired
	private StudentMapper studentMapper;

	@Autowired
	private CityMapper cityMapper;

	@Test
	public void contextLoads() {
		studentMapper.insert("winterchen", "123456", "12345678910");
		Student u = studentMapper.findUserByPhone("12345678910");
		Assert.assertEquals("winterchen", u.getName());
	}

	@Test
	@Transactional(isolation = Isolation.READ_UNCOMMITTED)
	public void test(){

		studentMapper.insert("张三", "123456", "18600000000");
		//int a = 1/0;
		studentMapper.insert("李四", "123456", "13500000000");
		Student u = studentMapper.findUserByPhone("13500000000");
		Assert.assertEquals("李四", u.getName());
	}

	@Test
	@Transactional
	public void testQueryCity(){
		int i = cityMapper.insert("wuhan111","wuhan_desc",442100L);
		Assert.assertEquals(1, i);
		City city = cityMapper.queryCityById(1006);
		Assert.assertEquals("wuhan", city.getCityName());
	}
}
