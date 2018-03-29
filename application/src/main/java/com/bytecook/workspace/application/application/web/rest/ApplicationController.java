package com.bytecook.workspace.application.application.web.rest;

import com.bytecook.workspace.application.application.web.rest.dto.application.ApplicationFilter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ibraim
 */
@RestController
public class ApplicationController {

    @GetMapping("/applications")
    public ResponseEntity getApplications(ApplicationFilter filter) {
        return null;
    }

    @GetMapping("/applications/{id}")
    public ResponseEntity getApplication(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/applications")
    public ResponseEntity createApplication() {
        return null;
    }
}
