package com.learning.productservices.controller;

import com.learning.productservices.exception.NoSuchExistsException;
import com.learning.productservices.model.dto.ProductDto;
import com.learning.productservices.model.entities.TblProducts;
import com.learning.productservices.model.request.RequestParamDto;
import com.learning.productservices.repository.ProductRepository;
import com.learning.productservices.service.ProductService;
import com.learning.productservices.exception.errorMessage.errorDetails.ErrorMessages;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> createProduct(@RequestBody RequestParamDto requestParamDto)
    {

        productService.validateProduct(requestParamDto);

        Optional<TblProducts> saveProduct = productService.saveProduct(requestParamDto.getProduct());

        return ResponseEntity.ok(saveProduct);
    }

    //-----------------------------------------------------------------------------------get
    @GetMapping("/getAll")
    public List<TblProducts> readProductsAll() {
        return productService.getProductsAll();
    }

    //-----------------------------------------------------------------------------------get by id
    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {

        Optional<TblProducts> productById = productService.getProductById(id);

        return ResponseEntity.ok(productById);

    }

    //-----------------------------------------------------------------------------------get by query
    @GetMapping("/getByQuery")
    public Object getProductByQuery(@RequestParam Map<String, String> param) throws NoSuchExistsException {

        String productCode = param.get("productCode");
        String productName = param.get("productName");

        if(productCode == null | productName == null) {
            throw new NoSuchExistsException(ErrorMessages.ERROR_REQUIRE_PARAMETER + "productCode & productName");
        }

        List<ProductDto> productByQuery = this.productService.getProductByQuery(param);

        return ResponseEntity.ok(productByQuery.get(0));

    }

    //-----------------------------------------------------------------------------------put by id
    @PutMapping("/updateById/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody RequestParamDto requestParamDto, @PathVariable Long id) {

        Optional<TblProducts> productsUpdate = productService.updateProduct(requestParamDto, id);

        return ResponseEntity.ok(productsUpdate);
    }


    //-----------------------------------------------------------------------------------patch by id
    @PatchMapping("/updateField/{id}")//    not used
    public ResponseEntity<ProductDto> updateProductField(@RequestBody Map<String, Object> fields, @PathVariable("id") Long id) throws ResourceNotFoundException {
        ProductDto productsUpdateByField = productService.updateProductField(id);
        return ResponseEntity.ok(productsUpdateByField);
    }

    //-----------------------------------------------------------------------------------patch by id
    @PatchMapping("/{id}")
    public TblProducts updateProductByFields(@PathVariable Long id, @RequestBody Map<String, Object> fields) {
        return productService.updateProductByField(id, fields);
    }

    //-----------------------------------------------------------------------------------delete by id
    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable("id") Long id) throws RuntimeException {
        try {
            productService.deleteProductById(id);
            return ResponseEntity.ok(HttpStatus.OK+" The DELETE request was successful");
        } catch (NoSuchExistsException e) {
            throw new NoSuchExistsException(ErrorMessages.ERROR_NOT_FOUND + id);
        }
    }

}
