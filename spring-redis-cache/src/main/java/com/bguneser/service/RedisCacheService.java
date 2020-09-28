package com.bguneser.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {



    // Bu method uzun süren bir fonksiyonalite sağlıyor
    @Cacheable(cacheNames = "mySpecialCache")
    public String longRunningMethod() throws InterruptedException {

        Thread.sleep(5000L);

        return "method çalıştı" ;
    }

    @CacheEvict(cacheNames = "mySpecialCache")
    public void clearCache() {
        System.out.println("cache has been cleared");
    }
}
