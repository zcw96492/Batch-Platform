package com.newcore.batch.platform.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 批处理平台-主启动类
 * @author zhouchaowei
 * @date 2022-07-13
 */
@SpringBootApplication
public class BatchPlatformJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchPlatformJobApplication.class,args);
    }
}
