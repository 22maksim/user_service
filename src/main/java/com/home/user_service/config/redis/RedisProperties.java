package com.home.user_service.config.redis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("spring.data.redis")
public class RedisProperties {
        private String host;
        private int port;
        private int database;
}
