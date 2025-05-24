package com.learning.productservices.controller;


import com.learning.productservices.exception.ResourceNotFoundException;
import com.learning.productservices.model.dto.ProductTypeDto;
import com.learning.productservices.model.entities.ProductType;
import com.learning.productservices.repository.ProductTypeRepository;
import com.learning.productservices.service.ImageService;
import com.learning.productservices.service.ProductTypeService;
import com.learning.productservices.exception.errorMessage.ErrorMessages;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productTypes")
@AllArgsConstructor
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @Autowired
    private ImageService imageService;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    //-----------------------------------------------------------------------------------POST
    @PostMapping("/create")
    public ResponseEntity<?> createProductType(@RequestBody ProductTypeDto productTypeDtoRequest) {

        Optional<ProductType> productTypes = productTypeService.saveProductType(productTypeDtoRequest);
        if (productTypes.isPresent()) {
            return ResponseEntity.ok(productTypes);
        } else {
            throw new  ResourceNotFoundException(ErrorMessages.ERROR_NOT_FOUND + productTypeDtoRequest);
        }
    }

    //-----------------------------------------------------------------------------------GET ALL
    @GetMapping("/get")
    public List<ProductType> readProductTypesAll() {
        return productTypeService.getProductTypeAll();
    }

    //-----------------------------------------------------------------------------------GET BY ID
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getProductTypeById(@PathVariable Long id) {

        Optional<ProductType> productTypeById = productTypeService.getProductTypeById(id);

        if (productTypeById.isPresent()) {
            return ResponseEntity.ok(productTypeById);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    //-----------------------------------------------------------------------------------UPDATE BY ID
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateProductTypeById(@RequestBody ProductTypeDto productTypeDto, @PathVariable Long id) throws RuntimeException {
        Optional<ProductType> productTypes = productTypeService.updateProductType(productTypeDto, id);

        if (productTypes.isPresent()) {
            return ResponseEntity.ok(productTypes);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    //-----------------------------------------------------------------------------------DELETE BY ID
    @DeleteMapping("/delete/{id}")
    public String deleteProductTypeById(@PathVariable Long id) {
        productTypeService.deleteProductType(id);
        return "Delete Successfully";
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file")MultipartFile file, @RequestParam("productTypeId") Long productTypeId) {
        try {
            String fileName = imageService.saveFile(file);

            ProductType productType = productTypeRepository.findById(productTypeId).orElseThrow(() -> new RuntimeException("ProductType not found"));
            productType.setImage(fileName);
            productTypeRepository.save(productType);

            return ResponseEntity.ok("Image uploaded successfully: " + fileName);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Upload failed");
        }
    }
}
