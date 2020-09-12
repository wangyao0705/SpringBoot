package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Weather;
import com.example.demo.repository.WeatherRepository;

//逻辑处理 方法调用 service
//事物 多张表插入检测 数据库事务（Transaction）,
//是由若干个SQL语句构成的一个操作序列，有点类似于Java的synchronized同步,
//数据库系统保证在一个事务中的所有SQL要么全部执行成功，要么全部不执行，
@Service
@Transactional
public class WeatherService {
	//	Db db=new Db();
	@Autowired
	WeatherRepository weatherRepository;

	//all取得
	public List<Weather> findAllWeatherData() {
		return weatherRepository.findAll();

	}

	//指定name取得数据
	public List<Weather> findWeatherDataListByListName(String name) {
		return weatherRepository.findByName(name);

	}
//	指定ID取得数据
	public List<Weather> findWeatherDataListByListId(Integer locationid){
		return weatherRepository.findByLocationid(locationid);

	}

}
