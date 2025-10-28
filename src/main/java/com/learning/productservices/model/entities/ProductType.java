package com.learning.productservices.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@Entity
@Table(name = "productType", uniqueConstraints = {@UniqueConstraint(columnNames = "productTypeCode")})
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String productTypeCode;

    @NotBlank
    private String productTypeName;

    private String image;

}
