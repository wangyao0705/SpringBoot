package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Weather;
//sql语句（增删改查）
@Repository
//<object,keytype>
public interface WeatherRepository extends JpaRepository<Weather,Integer> {


}
