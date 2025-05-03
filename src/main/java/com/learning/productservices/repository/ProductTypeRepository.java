package com.learning.productservices.repository;

import com.learning.productservices.model.entities.TblProductTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductTypeRepository extends JpaRepository<TblProductTypes, Long> {

    Optional<TblProductTypes> findById(Long id);
    Optional<TblProductTypes> findByProductTypeCode(String productTypeCode);
    void deleteById(Long id);

    @Query(value = "select * from product_type pdt where pdt.product_type_code = :product_type_code", nativeQuery = true)
    Optional<TblProductTypes> queryByProductTypeCode(@Param("product_type_code") String productTypeCode);
}
