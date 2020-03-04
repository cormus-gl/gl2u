package com.goodluck2u.gl2u.config;

import com.goodluck2u.gl2u.common.InfluxDBUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfluxDBConfig {

    @Value("${spring.influx.url:''}")
    private String influxUrl;

    @Value("${spring.influx.user:''}")
    private String user;

    @Value("${spring.influx.password:''}")
    private String password;

    @Value("spring.influx.database:''")
    private String database;


    @Bean
    public InfluxDBUtil getInfluxDB() {
        return new InfluxDBUtil(user, password, influxUrl, database, "");
    }
}
