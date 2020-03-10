# 项目说明
Springboot 提供了简便快捷的方法来集成redis并将之使用为服务端的共享session的存储。

## 要点

### 关键依赖
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-redis</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.session</groupId>
		<artifactId>spring-session-data-redis</artifactId>
	</dependency>

### 辅助依赖
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>

### 配置
application-redis.properties为redis连接配置

### 补充说明
1. 本演示项目使用了FastJson作为序列化方案，因此也增加了对fastjson的依赖；
1. 在RedisConfig和WebSecurityConfig中将fastjson配置成Redis存储序列化方案和默认消息转换器方案；
1. application-redis.properties通过注解声明加载；