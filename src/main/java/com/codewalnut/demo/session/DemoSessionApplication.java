package com.codewalnut.demo.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 测试主类
 *
 * @author KelvinZ
 * @date 2020-03-10 14:13
 */
@SpringBootApplication
@PropertySources(value = {
		@PropertySource(value = "classpath:application-redis.properties")
})
public class DemoSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSessionApplication.class, args);
	}

}
