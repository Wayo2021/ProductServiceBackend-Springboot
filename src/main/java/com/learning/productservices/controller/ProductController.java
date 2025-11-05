package com.learning.productservices.controller;

import com.learning.productservices.exception.NoSuchExistsException;
import com.learning.productservices.model.dto.ProductDto;
import com.learning.productservices.model.entities.Product;
import com.learning.productservices.model.request.RequestParamDto;
import com.learning.productservices.repository.ProductRepository;
import com.learning.productservices.service.ProductService;
import com.learning.productservices.exception.errorMessage.ErrorMessages;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class  ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    //-----------------------------------------------------------------------------------post
    @PostMapping("/create")
    public Object createProduct(@Validated @RequestBody RequestParamDto requestParamDto)
    {

        productService.validateProduct(requestParamDto);

        Optional<Product> saveProduct = productService.saveProduct(requestParamDto.getProduct());

        return ResponseEntity.ok(saveProduct);
    }

    //-----------------------------------------------------------------------------------get
    @GetMapping("/get")
    public List<Product> readProductsAll() {
        return productService.getProductsAll();
    }

    //-----------------------------------------------------------------------------------get by id
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {

        Optional<Product> productById = productService.getProductById(id);

        return ResponseEntity.ok(productById);

    }

    //-----------------------------------------------------------------------------------get by query
    @GetMapping("/get/query")
    public Object getProductByQuery(@RequestParam Map<String, String> param) throws NoSuchExistsException {

        String productCode = param.get("productCode");
        String productName = param.get("productName");

        if(productCode == null | productName == null) {
            throw new NoSuchExistsException(ErrorMessages.ERROR_REQUIRE_PARAMETER + "productCode & productName");
        }

        List<ProductDto> productByQuery = this.productService.getProductByQuery(param);

        return ResponseEntity.ok(productByQuery.get(0));

    }
    //-----------------------------------------------------------------------------------get by query
    @GetMapping("/get/queryProductTypeByProductCode")
    public Object getProductTypeByProductCode(@RequestParam Map<String, String> param) throws NoSuchExistsException {

        String productCode = param.get("productCode");

        if(productCode == null) {
            throw new NoSuchExistsException(ErrorMessages.ERROR_REQUIRE_PARAMETER + "productCode");
        }

        List<ProductDto> productByQuery = this.productService.getProductTypeByProductCode(param);

        return ResponseEntity.ok(productByQuery.get(0));

    }

    //-----------------------------------------------------------------------------------put by id
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateProductById(@RequestBody RequestParamDto requestParamDto, @PathVariable Long id) {

        Optional<Product> productsUpdate = productService.updateProduct(requestParamDto, id);

        return ResponseEntity.ok(productsUpdate);
    }


    //-----------------------------------------------------------------------------------patch by id
//    @PatchMapping("/update/{id}") //    NOT USED
//    public ResponseEntity<ProductDto> updateProductField(@RequestBody Map<String, Object> fields, @PathVariable("id") Long id) throws ResourceNotFoundException {
//        ProductDto productsUpdateByField = productService.updateProductField(id);
//        return ResponseEntity.ok(productsUpdateByField);
//    }

    //-----------------------------------------------------------------------------------patch by id
    @PatchMapping("/{id}")
    public Product updateProductByFields(@PathVariable Long id, @RequestBody Map<String, Object> fields) {
        return productService.updateProductByField(id, fields);
    }

    //-----------------------------------------------------------------------------------delete by id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable("id") Long id) throws RuntimeException {
        try {
            productService.deleteProductById(id);
            return ResponseEntity.ok(HttpStatus.OK + " The DELETE request was successful");
        } catch (NoSuchExistsException e) {
            throw new NoSuchExistsException(ErrorMessages.ERROR_NOT_FOUND + id);
        }
    }

}
