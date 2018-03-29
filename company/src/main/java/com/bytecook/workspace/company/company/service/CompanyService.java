package com.bytecook.workspace.company.company.service;

import com.bytecook.workspace.company.company.domain.Company;
import com.bytecook.workspace.company.company.repository.CompanyRepository;
import com.bytecook.workspace.company.company.web.rest.dto.company.ManagedCompanyDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ibraim
 */
@Slf4j
@AllArgsConstructor
@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Transactional
    public Company createCompany(ManagedCompanyDTO managedCompanyDTO) {
        Company company = new Company();
        company.setName(managedCompanyDTO.getName());

        return company;
    }

    @Transactional
    public Company updateCompany(String id, ManagedCompanyDTO companyDTO) {
        return null;
    }
}
