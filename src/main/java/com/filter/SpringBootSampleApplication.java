/**
 *
 * @author : liuxiaoqiang
 * @date   :Mar 11, 2016 6:11:46 PM 
 * @version 1.0 
 *
 */
package com.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.filter.servlet.MyServlet;
 
@SpringBootApplication
public class SpringBootSampleApplication {
 
    /**
     * 使用代码注册Servlet（不需Ҫ@ServletComponentScanע解）
     *
     * @return
     * @author SHANHY
     * @create  2016年1月6日
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MyServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
    }
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleApplication.class, args);
    }
}