package com.bytecook.workspace.company.company.web.rest.dto.company;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author ibraim
 */
@Data
public class ManagedCompanyDTO {

    @NotNull
    private String name;
}
