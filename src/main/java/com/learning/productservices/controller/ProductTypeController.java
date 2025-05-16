package com.learning.productservices.controller;


import com.learning.productservices.exception.ResourceNotFoundException;
import com.learning.productservices.model.dto.ProductTypeDto;
import com.learning.productservices.model.entities.TblProductTypes;
import com.learning.productservices.service.ProductTypeService;
import com.learning.productservices.exception.errorMessage.errorDetails.ErrorMessages;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productTypes")
@AllArgsConstructor
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    //-----------------------------------------------------------------------------------POST
    @PostMapping("/create")
    public ResponseEntity<?> createProductType(@RequestBody ProductTypeDto productTypeDtoRequest) {

        Optional<TblProductTypes> productTypes = productTypeService.saveProductType(productTypeDtoRequest);
        if (productTypes.isPresent()) {
            return ResponseEntity.ok(productTypes);
        } else {
            throw new  ResourceNotFoundException(ErrorMessages.ERROR_NOT_FOUND + productTypeDtoRequest);
        }
    }

    //-----------------------------------------------------------------------------------GET ALL
    @GetMapping("/getAll")
    public List<TblProductTypes> readProductTypesAll() {
        return productTypeService.getProductTypeAll();
    }

    //-----------------------------------------------------------------------------------GET BY ID
    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getProductTypeById(@PathVariable Long id) {

        Optional<TblProductTypes> productTypeById = productTypeService.getProductTypeById(id);

        if (productTypeById.isPresent()) {
            return ResponseEntity.ok(productTypeById);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteProductTypeById(@PathVariable Long id) {
        productTypeService.deleteProductType(id);
        return "Delete Successfully";
    }
}
