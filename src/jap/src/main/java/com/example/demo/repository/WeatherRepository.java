package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Weather;

//sql语句（增删改查）
//<object,keytype>
@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer> {
	List<Weather> findByName(String name);
	List<Weather> findByLocationid(Integer locationid);


}
