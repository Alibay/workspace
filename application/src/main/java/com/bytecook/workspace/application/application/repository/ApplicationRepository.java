package com.bytecook.workspace.application.application.repository;

import com.bytecook.workspace.application.application.domain.Application;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author ibraim
 */
public interface ApplicationRepository extends ReactiveMongoRepository<Application, String> {
}
