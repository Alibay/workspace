package com.bytecook.workspace.application.application.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author ibraim
 */
@Data
@Document
public class Application implements Serializable {

    private static final long serialVersionUID = 3882658169239413824L;

    private String id;

    private String name;
}
