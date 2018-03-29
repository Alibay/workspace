package com.bytecook.workspace.application.application.web.rest.dto.application;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ibraim
 */
@Data
public class ApplicationFilter implements Serializable {

    private static final long serialVersionUID = -8818839801499321836L;

    private String name;
}
