package com.bytecook.workspace.company.company.web.rest.dto.company;

import lombok.Data;

import java.time.ZonedDateTime;

/**
 * @author ibraim
 */
@Data
public class CompanyDTO {

    private String id;

    private String name;

    private ZonedDateTime createdDate;

    private ZonedDateTime updatedDate;
}
