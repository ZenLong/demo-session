package com.codewalnut.demo.session.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Redis配置类，maxInactiveIntervalInSeconds配置session超时时间
 *
 * @author KelvinZ
 * @date 2020-03-10 13:50
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
public class RedisConfig {

    @Bean
    public static ConfigureRedisAction configureRedisAction() {
        return ConfigureRedisAction.NO_OP;
    }

    /**
     * redisTemplate 序列化使用的Serializeable, 存储二进制字节码, 所以自定义序列化类
     *
     * @param redisConnectionFactory
     * @return
     */
//    @Bean
//    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        RedisTemplate<Object, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(redisConnectionFactory);
//        // redis value使用的序列化器
//        template.setValueSerializer(new KryoRedisSerializer<>(Object.class));
//        template.setDefaultSerializer(new KryoRedisSerializer<>(Object.class));
//        // redis key使用的序列化器
//        template.setKeySerializer(new StringRedisSerializer());
//        template.afterPropertiesSet();
//        return template;
//    }

}
