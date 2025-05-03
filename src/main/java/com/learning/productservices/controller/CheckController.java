package com.learning.productservices.controller;

import com.learning.productservices.model.dto.ProductDto;
import com.learning.productservices.service.CheckService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
@AllArgsConstructor
public class CheckController {

    @Autowired
    private CheckService checkService;

    @PostMapping("/request")
    public ResponseEntity<?> checkRequest(@RequestBody ProductDto productDto) throws ResourceNotFoundException {
        checkService.validateRequest(productDto);
        return ResponseEntity.ok(productDto);
    }
}
