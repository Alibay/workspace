package com.bytecook.workspace.company.company.repository;

import com.bytecook.workspace.company.company.domain.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author ibraim
 */
public interface CompanyRepository extends ReactiveMongoRepository<Company, String> {
}
