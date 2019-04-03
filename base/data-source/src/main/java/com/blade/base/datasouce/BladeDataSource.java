package com.blade.base.datasouce;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author xiaofeidao
 * @date 2019/4/1
 */
@Configuration
public class BladeDataSource {

    @Value("${blade.druid.url}")
    private String url;

    @Value("${blade.druid.driverClassName}")
    private String driverClassName;

    @Value("${blade.druid.userName}")
    private String userName;

    @Value("${blade.druid.password}")
    private String password;

    @Bean(name="bladeDataSource")
    @ConfigurationProperties("spring.datasource.blade.druid")
    public DruidDataSource servantDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

}
