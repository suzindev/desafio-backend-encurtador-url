package com.suzintech.urlshortener.repository;

import com.suzintech.urlshortener.entity.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
