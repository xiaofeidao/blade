package com.blade.base.datasouce;

import com.alibaba.druid.pool.DruidDataSource;
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

    @Bean(name="bladeDataSource")
    @ConfigurationProperties("spring.datasource.blade.druid")
    public DruidDataSource servantDataSource(){
        return new DruidDataSource();
    }

}
