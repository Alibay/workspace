package com.bytecook.workspace.company.company.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * @author ibraim
 */
@Data
@Document
public class Company implements Serializable {

    private static final long serialVersionUID = 5017595743633882290L;

    private String id;

    private String name;

    private ZonedDateTime createdDate = ZonedDateTime.now();

    private ZonedDateTime updatedDate;
}
