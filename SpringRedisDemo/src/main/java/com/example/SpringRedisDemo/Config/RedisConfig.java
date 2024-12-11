package com.example.SpringRedisDemo.Config;

import io.lettuce.core.RedisURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConfiguration;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.URI;
import java.time.Duration;

@Configuration
public class RedisConfig {

    @Value("${spring.redis.url}")
    private String redisUrl;

    @Value("${spring.redis.ssl:false}") // Default to false if not set
    private boolean useSsl;

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        // Parse the Redis URL

        URI uri = URI.create(redisUrl);
        String[] userInfo = uri.getUserInfo().split(":");
        String username = userInfo[0];
        String password = userInfo[1];

        // Set up Redis configuration
        RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
        redisConfig.setHostName(uri.getHost());
        redisConfig.setPort(uri.getPort());
        redisConfig.setUsername(username);
        redisConfig.setPassword(password);

        // Configure SSL only if explicitly set to true
        LettuceClientConfiguration clientConfig;
        if (useSsl) {
            clientConfig = LettuceClientConfiguration.builder()
                    .useSsl()
                    .build();
        } else {
            clientConfig = LettuceClientConfiguration.builder().build();
        }

        return new LettuceConnectionFactory(redisConfig, clientConfig);
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(LettuceConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);

        // Use GenericJackson2JsonRedisSerializer for both keys and values
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

        return template;
    }

    @Bean
    public RedisCacheManager cacheManager(LettuceConnectionFactory redisConnectionFactory) {

        return RedisCacheManager.builder(redisConnectionFactory).
                cacheDefaults(RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(2))
                        .disableCachingNullValues()).transactionAware().build();

    }

}
