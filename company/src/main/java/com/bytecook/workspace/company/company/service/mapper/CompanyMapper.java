package com.bytecook.workspace.company.company.service.mapper;

import com.bytecook.workspace.company.company.domain.Company;
import com.bytecook.workspace.company.company.web.rest.dto.company.CompanyDTO;
import org.springframework.stereotype.Service;

/**
 * @author ibraim
 */
@Service
public class CompanyMapper {

    public CompanyDTO companyToCompanyDTO(Company company) {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setName(company.getName());
        companyDTO.setCreatedDate(company.getCreatedDate());
        companyDTO.setUpdatedDate(company.getUpdatedDate());

        return companyDTO;
    }
}
