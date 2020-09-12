package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Weather;
import com.example.demo.service.WeatherService;
@Controller
public class WeatherController {
	@Autowired
	WeatherService weatherService;
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("hello","Hello World");

		List<Weather> weatherDataList =  weatherService.findAllWeatherData();

		model.addAttribute("weatherDataList", weatherDataList);



		List<Weather> weatherDataTokyo = weatherService.findWeatherDataListByListName("東京");
		model.addAttribute("weatherDataTokyo", weatherDataTokyo);

		List<Weather> weatherDataNaha = weatherService.findWeatherDataListByListName("那覇");
		model.addAttribute("weatherDataNaha", weatherDataNaha);

		List<Weather> weatherDataId = weatherService.findWeatherDataListByListId(1);
		model.addAttribute("weatherDataId", weatherDataId);

		return "hello";

	}


}
