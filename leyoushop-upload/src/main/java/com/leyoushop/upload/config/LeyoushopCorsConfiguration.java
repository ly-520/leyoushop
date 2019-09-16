package com.leyoushop.upload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 处理跨域问题，四个头信息配置
 */
@Configuration
public class LeyoushopCorsConfiguration {

    @Bean
    public CorsFilter corsFilter(){

        //初始化cors配置对象
        CorsConfiguration configuration=new CorsConfiguration();
        //允许跨域的域名，如果要携带cookie,不能写*;* 代表所有域名都可以跨域访问
        configuration.addAllowedOrigin("http://manage.leyoushop.com");
        //是否允许携带cookie
        configuration.setAllowCredentials(true);
        configuration.addAllowedMethod("*");//*代表所有的请求方法：GET,POST，PUT,DELTE。。。。
        configuration.addAllowedHeader("*");//允许携带任何头信息

        //初始化cors配置源对象
        UrlBasedCorsConfigurationSource configurationSource=new UrlBasedCorsConfigurationSource();

        //第一个参数校验所有的请求路径
        configurationSource.registerCorsConfiguration("/**",configuration);
        //返回CorsFilter实例，参数：cors配置源对象
        return new CorsFilter(configurationSource);
    }
}
