package cn.darren.ferrari.gateway.config;

import cn.darren.ferrari.gateway.filter.CustomGlobalFilter;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chensy
 * @date 2019/10/20 22:21
 */
@Configuration
public class CustomFilterConfig {
    @Bean
    public GlobalFilter customFilter() {
        return new CustomGlobalFilter();
    }

}
