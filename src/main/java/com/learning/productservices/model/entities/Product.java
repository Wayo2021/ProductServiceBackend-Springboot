package com.learning.productservices.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "product", uniqueConstraints = {@UniqueConstraint(columnNames = "productCode")})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String productName;

    @DecimalMin(value = "0.00")
    private BigDecimal productPrice;

    @NotBlank
    private String productCode;

    @ManyToOne
    @JoinColumn(name = "productType_id")
    private ProductType productType;

}
