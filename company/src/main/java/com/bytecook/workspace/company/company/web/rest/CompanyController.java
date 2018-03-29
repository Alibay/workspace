package com.bytecook.workspace.company.company.web.rest;

import com.bytecook.workspace.company.company.domain.Company;
import com.bytecook.workspace.company.company.repository.CompanyRepository;
import com.bytecook.workspace.company.company.service.CompanyService;
import com.bytecook.workspace.company.company.service.mapper.CompanyMapper;
import com.bytecook.workspace.company.company.web.rest.dto.company.CompanyDTO;
import com.bytecook.workspace.company.company.web.rest.dto.company.ManagedCompanyDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @author ibraim
 */
@Slf4j
@AllArgsConstructor
@RestController
public class CompanyController {

    private final CompanyService companyService;
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    @PostMapping("/companies")
    public ResponseEntity createComapny(@Valid @RequestBody ManagedCompanyDTO companyDTO) throws URISyntaxException {
        log.debug("REST request to create a new company {}", companyDTO);
        Company company = companyService.createCompany(companyDTO);

        return ResponseEntity
                .created(new URI(String.format("/companies/%s", company.getId())))
                .body(companyMapper.companyToCompanyDTO(company));
    }

    @PutMapping("/companies/{id}")
    public ResponseEntity updateCompany(@PathVariable String id,
                                        @Valid @RequestBody ManagedCompanyDTO companyDTO) {
        log.debug("REST request to create the company, id: {}, body: {}", id, companyDTO);
        Company company = companyService.updateCompany(id, companyDTO);
        return ResponseEntity.ok(companyMapper.companyToCompanyDTO(company));
    }

    @GetMapping("/companies")
    public ResponseEntity<List<CompanyDTO>> getCompanies() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/companies/{id}")
    public ResponseEntity getCompany(@PathVariable String id) {
        companyRepository.findById(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/companies/{id}")
    public ResponseEntity deleteCompany(@PathVariable String id) {
        return ResponseEntity.noContent().build();
    }
}
