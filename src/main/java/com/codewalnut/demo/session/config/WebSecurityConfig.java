package com.codewalnut.demo.session.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Web相关配置
 *
 * @author KelvinZ
 * @date 2020-03-10 23:05
 */
@Configuration
public class WebSecurityConfig {
	/**
	 * 使用Fastjson作为springboot的默认转换器
	 *
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		//创建FastJson信息转换对象
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		//创建FastJson对象并设定序列化规则
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		// 是否格式化json字符串，调试器可以打开，正式使用时关掉可以节省格式化时间和传输流量
		// fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastJsonHttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));
		//规则赋予转换对象
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		return new HttpMessageConverters(fastJsonHttpMessageConverter, new StringHttpMessageConverter(Charset.forName("UTF-8")));
	}
}
