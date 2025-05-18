package com.learning.productservices.repository;

import com.learning.productservices.model.entities.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

    Optional<ProductType> findById(Long id);

    Optional<ProductType> findByProductTypeCode(String productTypeCode);

    void deleteById(Long id);

    @Query(value = "select * from product_type pdt where pdt.product_type_code = :product_type_code", nativeQuery = true)
    Optional<ProductType> queryByProductTypeCode(@Param("product_type_code") String productTypeCode);

}
