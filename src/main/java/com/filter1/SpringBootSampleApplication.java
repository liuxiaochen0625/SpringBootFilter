/**
 *
 * @author : liuxiaoqiang
 * @date   :Mar 11, 2016 6:20:47 PM 
 * @version 1.0 
 *
 */
package com.filter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
 
@SpringBootApplication
@ServletComponentScan
public class SpringBootSampleApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleApplication.class, args);
    }
}
