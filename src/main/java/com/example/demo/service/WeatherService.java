package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Weather;
import com.example.demo.repository.WeatherRepository;
//逻辑处理 方法调用
@Service
//事物 多张表插入检测
@Transactional
public class WeatherService {
//	Db db=new Db();
@Autowired
	WeatherRepository weatherRepository;
public List<Weather> findAllWeatherData(){
	return weatherRepository.findAll();

}
}
