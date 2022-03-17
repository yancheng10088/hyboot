package com.hy.hyweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 *
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.hy.hyweb", "com.hy.hycommon","com.hy.backgroud", "com.hy.vcenter"})
public class HyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyWebApplication.class, args);
    }

}
